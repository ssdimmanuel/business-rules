/**
 * 
 */
package com.expr.brule.builder;

/**
 * @author ssdImmanuel
 *
 */
public class RuleBuilder {

	/**
	 * 
	 */
	public RuleBuilder() {
	}
	
	private StringBuilder sb = new StringBuilder();
	
	public RuleBuilder leftParenthesis() {
		sb.append(" ( ");
		return this;
	}
	
	public RuleBuilder rightParenthesis() {
		sb.append(" ) ");
		return this;
	}
	
	public RuleBuilder expression(String lhs, String op, String rhs) {
		sb.append(" "+lhs+" "+op+" "+rhs+" ");
		return this;
	}
	
	public RuleBuilder variable(String var) {
		sb.append(" "+var+" ");
		return this;
	}
	
	public RuleBuilder equals() {
		sb.append(" = ");
		return this;
	}
	
	public RuleBuilder lessthan() {
		sb.append(" < ");
		return this;
	}
	
	public RuleBuilder greaterthan() {
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
	
	public RuleBuilder and() {
		sb.append(" & ");
		return this;
	}
	
	public RuleBuilder or() {
		sb.append(" or ");
		return this;
	}
	
	public String build() {
		return sb.toString();
	}

}
