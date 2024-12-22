package com.expr.brule.evaluate;

import com.expr.brule.editing.RuleExpression;

import lombok.Getter;
import lombok.Setter;

/**
 * Captures the outcome of every expression in a business rule
 * @author ssdImmanuel
 *
 */
@Setter
@Getter
public class ExecutionDetails {
	
	private RuleExpression expression;
	
	private boolean outcome;
	
	public ExecutionDetails() {
	}

	public String toString() {
		return ""+this.expression.toString()+">> Outcome: "+this.outcome;
	}

}
