package com.expr.brule.stats;

import java.util.ArrayList;

import com.expr.brule.common.ParseWrapper;
import com.expr.brule.core.BusinessRuleParser.NumberExpressionContext;
import com.expr.brule.core.BusinessRuleParser.StringExpressionContext;
import com.expr.brule.core.BusinessRuleParser.VariableExpressionContext;
import com.expr.brule.editing.RuleExpression;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExtractExpression extends ParseWrapper {
	
	private ArrayList<RuleExpression> expressions;
	
	private int expressionCount;
	
	public ExtractExpression(String rule) {
		super(rule);
		setExpressions(new ArrayList<RuleExpression>());
	}

	@Override
	public void enterStringExpression(StringExpressionContext ctx) {
		RuleExpression exp = new RuleExpression();
		exp.setBusinessVariable(ctx.lhs.getText());
		exp.setOperator(ctx.compop().getText());
		exp.setComparedValue(ctx.rhs.getText());
		expressions.add(exp);
		this.expressionCount++;
	}

	@Override
	public void enterNumberExpression(NumberExpressionContext ctx) {
		RuleExpression exp = new RuleExpression();
		exp.setBusinessVariable(ctx.lhs.getText());
		exp.setOperator(ctx.compop().getText());
		exp.setComparedValue(ctx.rhs.getText());
		expressions.add(exp);
		this.expressionCount++;
	}

	@Override
	public void enterVariableExpression(VariableExpressionContext ctx) {
		RuleExpression exp = new RuleExpression();
		exp.setBusinessVariable(ctx.lhs.getText());
		exp.setOperator(ctx.compop().getText());
		exp.setComparedValue(ctx.rhs.getText());
		expressions.add(exp);
		this.expressionCount++;
	}

}
