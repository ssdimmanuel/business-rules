/**
 * 
 */
package com.expr.brule.evaluate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.expr.brule.core.BusinessRuleBaseVisitor;
import com.expr.brule.core.BusinessRuleLexer;
import com.expr.brule.core.BusinessRuleParser;
import com.expr.brule.core.BusinessRuleParser.ArgsContext;
import com.expr.brule.core.BusinessRuleParser.BinopContext;
import com.expr.brule.core.BusinessRuleParser.BooleanVariableContext;
import com.expr.brule.core.BusinessRuleParser.CompopContext;
import com.expr.brule.core.BusinessRuleParser.EnclosedExpressionContext;
import com.expr.brule.core.BusinessRuleParser.FunctionContext;
import com.expr.brule.core.BusinessRuleParser.FunctionExpressionContext;
import com.expr.brule.core.BusinessRuleParser.LogicalExpressionContext;
import com.expr.brule.core.BusinessRuleParser.NumberExpressionContext;
import com.expr.brule.core.BusinessRuleParser.ParseContext;
import com.expr.brule.core.BusinessRuleParser.StringExpressionContext;
import com.expr.brule.core.BusinessRuleParser.VariableExpressionContext;
import com.expr.brule.editing.RuleExpression;

/**
 * Executes a business rule
 * <p>
 * A Subclass of the ANTLR generated Visitor to evaluate expressions.
 * When an expression node is visited (string or number or variable or function), the expression is 
 * evaluated using the context data provided through the <code>HashMap</code> or the property file
 * <p>
 * The result of execution is a <code>RuleResult</code> object which has the details of all
 * the expressions evaluated and their outcome (true or false) and the overall outcome
 * @author ssdImmanuel
 *
 */
public class ExecutionEngine extends BusinessRuleBaseVisitor<Object> {

	/**
	 * Pass rule and context as a HashMap
	 * @param rule
	 * @param values
	 */
	public ExecutionEngine(String rule, HashMap<String, Object> values) {
		this.rule = rule;
		this.values = values;
		this.debug = false;
		this.ruleResult = new RuleResult();
	}
	
	/**
	 * Pass rule and context as Property File
	 * @param rule
	 * @param data
	 */
	public ExecutionEngine(String rule, File data) {
		this.rule = rule;
		this.values = this.getDataMap(data);
		if(values.size()<=0) {
			throw new ContextNotPassedException("Empty rule context data");
		}
		this.debug = false;
		this.ruleResult = new RuleResult();
	} 
	
	/**
	 * Convert values from a property file to a HashMap
	 * @param file
	 * @return
	 */
	private HashMap<String, Object> getDataMap(File file) {
		Properties prop = new Properties();
		HashMap<String, Object> map = new HashMap<String, Object>();
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String name : prop.stringPropertyNames()) {
			String value = prop.getProperty(name);
			map.put(name, value);
		}
		
		return map;
	}

	/**
	 * Rule expression text
	 */
	private String rule;
	/**
	 * Runtime values for variables
	 */
	private HashMap values;

	private Boolean result;
	private boolean debug=false;
	
	private RuleResult ruleResult;

	/**
	 * Parses the rule String passed and calls the top level visit method
	 */
	public void evaluate() {
		String t1 = this.getCurrentTimeUsingCalendar();
		this.ruleResult.setStartTime(t1);
		BusinessRuleLexer lexer = new BusinessRuleLexer(CharStreams.fromString(rule));
		BusinessRuleParser parser = new BusinessRuleParser(new CommonTokenStream(lexer));
		this.result = (Boolean) this.visit(parser.parse());
		
		this.ruleResult.setEndTime(getCurrentTimeUsingCalendar());
		this.ruleResult.setOutcome(result);
		System.out.println("Final outcome : " + result);
		
	}

	@Override
	public Object visitParse(ParseContext ctx) {
		System.out.println("visit parse: " + ctx.getText());
		System.out.println(""+ctx.expr().getText());
		boolean res = false;
		res = (boolean) super.visit(ctx.expr());
		return res;
	}
	
	@Override
	public Object visitEnclosedExpression(EnclosedExpressionContext ctx) {
		return super.visit(ctx.expr());
	}

	
	@Override
	public Object visitFunctionExpression(FunctionExpressionContext ctx) {
		FunctionContext fctx = ctx.function();
		String functionName = fctx.VARIABLE().getText();
		Object impl = values.get(functionName);
		if(impl==null) {
			throw new RuntimeException("Function not found for: "+functionName);
		}
		
		boolean result;
		if(impl instanceof IFunctionHandler) {
			ArgsContext argc = fctx.args();
			String []arglist = new String[0];
			if(argc!=null) {
				List<String> strargs = argc.STRING()
						.stream()
						.map(node -> node.getText())
						.collect(Collectors.toList());
				arglist = strargs.toArray(arglist);
			}
			System.out.println("*** "+arglist.length);
			for(String arg : arglist) {
				System.out.println("*** Arg: "+arg);
			}
			result = executeFunction((IFunctionHandler)impl, arglist);
		}else {
			throw new RuntimeException("Function passed for: "+functionName+" not an implementation of IFunctionHandler");
		}
		
		return result;
	}
	
	private boolean executeFunction(IFunctionHandler handler, String...args) {
		boolean isValid = handler.isValidationSuccess(args);
		if(!isValid) {
			throw new RuntimeException("Incompatible Arguments passed");
		}
		return handler.execute();
	}

	@Override
	public Object visitStringExpression(StringExpressionContext ctx) {
		System.out.println("*** inside String exp");
		String lhsvalue = ctx.lhs.getText();
		String rhsvalue = ctx.rhs.getText();
		Object lhsRuntimeValue;
		Object newrhsValue = rhsvalue.replaceAll("\"", "");

		ExecutionDetails detail = new ExecutionDetails();
		RuleExpression exp = new RuleExpression(lhsvalue,rhsvalue,ctx.compop().getText());
		detail.setExpression(exp);
		
		lhsRuntimeValue = this.values.get(lhsvalue);
		if (lhsRuntimeValue == null) {
			lhsRuntimeValue = lhsvalue;
		}

		System.out.println("lhs: " + lhsvalue);
		System.out.println("sbs: " + values.get(lhsvalue));
		System.out.println("rhs: " + ctx.rhs.getText());

		boolean tempresult=false;
		if (ctx.compop().EQUAL() != null) {
			System.out.println("Outcome of expr " + ctx.getText() + " : " + lhsRuntimeValue.equals(rhsvalue));

			if (lhsRuntimeValue instanceof String) {

			} else if (lhsRuntimeValue instanceof Integer) {

			}
			tempresult = lhsRuntimeValue.equals(newrhsValue);
		}else if (ctx.compop().GT() != null) {

		}else {
			tempresult= lhsRuntimeValue.equals(rhsvalue);
		}
		
		detail.setOutcome(tempresult);
		this.ruleResult.addExecutionInstance(detail);

		return tempresult;
	}

	/**
	 * Evaluate a Number expression . the RHS is a numeric
	 */
	@Override
	public Object visitNumberExpression(NumberExpressionContext ctx) {
		System.out.println("inside Number exp");
		String lhsvalue = ctx.lhs.getText();
		String rhsvalue = ctx.rhs.getText();
		double lhsnum = 0;
		double rhsnum;
		Object lhsRuntimeValue;
		Object newrhsValue = rhsvalue.replaceAll("\"", "");
		
		ExecutionDetails detail = new ExecutionDetails();
		RuleExpression exp = new RuleExpression(lhsvalue,rhsvalue,ctx.compop().getText());
		detail.setExpression(exp);

		boolean tempresult=false;
		lhsRuntimeValue = this.values.get(lhsvalue);
		if (lhsRuntimeValue == null) {
			new RuntimeException("Value missing for Number expression");
		}else {
			if(lhsRuntimeValue instanceof String) {
				lhsnum = Double.parseDouble(lhsRuntimeValue.toString());
			}else {
				lhsnum = Double.valueOf(lhsRuntimeValue.toString());
			}
		}
		
		rhsnum= Double.parseDouble(newrhsValue.toString());

		System.out.println("lhs: " + lhsvalue);
		System.out.println("sbs: " + values.get(lhsvalue));
		System.out.println("rhs: " + ctx.rhs.getText());

		if (ctx.compop().EQUAL() != null) {
			tempresult= lhsnum==rhsnum;
		}

		if (ctx.compop().GT() != null) {
			tempresult= lhsnum>rhsnum;
		}
		if (ctx.compop().LT() != null) {
			tempresult= lhsnum<rhsnum;
		}
		if (ctx.compop().NE() != null) {
			tempresult= lhsnum!=rhsnum;
		}
		if (ctx.compop().GTE() != null) {
			tempresult= lhsnum>=rhsnum;
		}
		if (ctx.compop().LTE() != null) {
			tempresult= lhsnum <= rhsnum;
		}
		
		detail.setOutcome(tempresult);
		this.ruleResult.addExecutionInstance(detail);

		return tempresult;
	}

	@Override
	public Object visitLogicalExpression(LogicalExpressionContext ctx) {

		System.out.println("Before Evaluation of LHS " + ctx.expr(0).getText() + " ");
		System.out.println(""+ctx.expr(0).getText());
		boolean leftoutcome = (boolean) this.visit(ctx.expr(0));

		System.out.println("Before Evaluation of RHS " + ctx.expr(1).getText() + " ");
		boolean rightoutcome = (boolean) this.visit(ctx.expr(1));

		System.out.println("Evaluation of " + ctx.expr(0).getText() + " " + leftoutcome);
		System.out.println("Evaluation of " + ctx.expr(1).getText() + " " + rightoutcome);

		if (ctx.binop().AND() != null) {
			return (leftoutcome && rightoutcome);
		}

		if (ctx.binop().OR() != null) {
			System.out.println("Evaluating OR " + rightoutcome);
			return (leftoutcome || rightoutcome);
		}

		return false;
	}
	
	

	@Override
	public Object visitBooleanVariable(BooleanVariableContext ctx) {
		System.out.println("inside boolean");
		String var = ctx.VARIABLE().getText();
		Object passed = values.get(var);
		if(passed instanceof Boolean) {
			
		}else {
			throw new RuntimeException("Pass boolean for variable : "+var);
		}
		return passed;
	}

	@Override
	public Object visitVariableExpression(VariableExpressionContext ctx) {
		System.out.println("inside String exp");
		String lhsvalue = ctx.lhs.getText();
		String rhsvalue = ctx.rhs.getText();
		Object lhsRuntimeValue;
		Object rhsRuntimeValue;
		//Object newrhsValue = rhsvalue.replaceAll("\"", "");
		
		ExecutionDetails detail = new ExecutionDetails();
		RuleExpression exp = new RuleExpression(lhsvalue,rhsvalue,ctx.compop().getText());
		detail.setExpression(exp);

		lhsRuntimeValue = this.values.get(lhsvalue);
		if (lhsRuntimeValue == null) {
			lhsRuntimeValue = lhsvalue;
		}
		
		rhsRuntimeValue = this.values.get(rhsvalue);
		if(rhsRuntimeValue==null) {
			rhsRuntimeValue = rhsvalue;
		}
		

		System.out.println("lhs: " + lhsvalue);
		System.out.println("sbs: " + values.get(lhsvalue));
		System.out.println("rhs: " + ctx.rhs.getText());
		
		boolean tempresult = false;

		if (ctx.compop().EQUAL() != null) {
			System.out.println("Outcome of expr " + ctx.getText() + " : " + lhsRuntimeValue.equals(rhsvalue));

			if (lhsRuntimeValue instanceof String) {

			} else if (lhsRuntimeValue instanceof Integer) {

			}
			tempresult = lhsRuntimeValue.equals(rhsRuntimeValue);
		}else if (ctx.compop().GT() != null) {

		}else {
			tempresult = lhsRuntimeValue.equals(rhsvalue);
		}
		detail.setOutcome(tempresult);
		this.ruleResult.addExecutionInstance(detail);

		return tempresult;
	}

	@Override
	public Object visitBinop(BinopContext ctx) {
		return super.visitBinop(ctx);
	}

	@Override
	public Object visitCompop(CompopContext ctx) {
		return super.visitCompop(ctx);
	}

	public Boolean getResult() {
		return result;
	}

	public RuleResult getRuleResult() {
		return ruleResult;
	}

	public void setRuleResult(RuleResult ruleResult) {
		this.ruleResult = ruleResult;
	}
	
	public String getCurrentTimeUsingCalendar() {
	    Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String formattedDate=dateFormat.format(date);
	    System.out.println("Current time of the day  : "+ formattedDate);
		return formattedDate;
	}

}
