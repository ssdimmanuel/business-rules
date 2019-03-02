/**
 * 
 */
package com.expr.brule.builder;

import junit.framework.Assert;

/**
 * @author ssdImmanuel
 *
 */
public class RuleBuilder implements IVariableProvider, IComparisonOperator
, IOperatorOrParenthesisProvider, IBooleanProvider, IExpressionProvider
, ILeftParenthesisProvider, IRightParenthesisProvider, ILeftParenthesisOrVariableProvider
,ILeftParenthesisOrExpressionProvider, IRightParenthesisOrBooleanProvider
, IRuleBuilder{

	/**
	 * 
	 */
	public RuleBuilder() {
	}
	
	private StringBuilder sb = new StringBuilder();
	
	public static RuleBuilder newBuilder() {
		return new RuleBuilder();
	}
	
	public ILeftParenthesisOrVariableProvider leftParenthesis() {
		sb.append(" ( ");
		return this;
	}
	
	public IRightParenthesisOrBooleanProvider rightParenthesis() {
		sb.append(" ) ");
		return this;
	}
	
	public RuleBuilder expression(String lhs, String op, String rhs) {
		Assert.assertNotNull("LHS cannot be null", lhs);
		Assert.assertNotNull("RHS cannot be null", rhs);
		if(lhs.trim().equals("")) {
			throw new RuntimeException("LHS cannot be spaces");
		}
		sb.append(" ( ");
		sb.append(" "+lhs+" "+op+" "+rhs+" ");
		sb.append(" ) ");
		return this;
	}
	
	public RuleBuilder expression(String lhs, Operators op, String rhs) {
		Assert.assertNotNull("LHS cannot be null", lhs);
		Assert.assertNotNull("RHS cannot be null", rhs);
		if(lhs.trim().equals("")) {
			throw new RuntimeException("LHS cannot be spaces");
		}
		sb.append(" ( ");
		sb.append(" "+lhs+" "+op+" "+rhs+" ");
		sb.append(" ) ");
		return this;
	}
	
	public IOperatorOrParenthesisProvider variable(String var) {
		sb.append(" "+var+" ");
		return this;
	}
	
	public IVariableProvider equals() {
		sb.append(" = ");
		return this;
	}
	
	public IVariableProvider lessthan() {
		sb.append(" < ");
		return this;
	}
	
	public IVariableProvider greaterthan() {
		sb.append(" > ");
		return this;
	}
	
	public RuleBuilder lessthanorEqual() {
		sb.append(" <= ");
		return this;
	}
	
	public RuleBuilder greaterthanorEqual() {
		sb.append(" >= ");
		return this;
	}
	
	public ILeftParenthesisOrExpressionProvider and() {
		sb.append(" & ");
		return this;
	}
	
	public ILeftParenthesisOrExpressionProvider or() {
		sb.append(" or ");
		return this;
	}
	
	public String build() {
		return sb.toString();
	}

}
