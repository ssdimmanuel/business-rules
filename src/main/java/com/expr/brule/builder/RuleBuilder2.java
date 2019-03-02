/**
 * 
 */
package com.expr.brule.builder;

/**
 * @author ssdImmanuel
 *
 */
public class RuleBuilder2 {

	/**
	 * 
	 */
	public RuleBuilder2() {
	}
	
	private StringBuilder sb = new StringBuilder();
	
	public RuleBuilder2 leftParenthesis() {
		sb.append(" ( ");
		return this;
	}
	
	public RuleBuilder2 rightParenthesis() {
		sb.append(" ) ");
		return this;
	}
	
	public RuleBuilder2 expression(String lhs, String op, String rhs) {
		sb.append(" "+lhs+" "+op+" "+rhs+" ");
		return this;
	}
	
	public RuleBuilder2 variable(String var) {
		sb.append(" "+var+" ");
		return this;
	}
	
	public RuleBuilder2 equals() {
		sb.append(" = ");
		return this;
	}
	
	public RuleBuilder2 lessthan() {
		sb.append(" < ");
		return this;
	}
	
	public RuleBuilder2 greaterthan() {
		sb.append(" > ");
		return this;
	}
	
	public RuleBuilder2 lessthanorEqual() {
		sb.append(" <= ");
		return this;
	}
	
	public RuleBuilder2 greaterthanorEqual() {
		sb.append(" >= ");
		return this;
	}
	
	public RuleBuilder2 and() {
		sb.append(" & ");
		return this;
	}
	
	public RuleBuilder2 or() {
		sb.append(" or ");
		return this;
	}
	
	public String build() {
		return sb.toString();
	}

}
