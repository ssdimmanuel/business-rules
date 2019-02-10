package com.expr.brule.evaluate;

import com.expr.brule.editing.RuleExpression;

/**
 * Captures the outcome of every expression in a business rule
 * @author ssdImmanuel
 *
 */
public class ExecutionDetails {
	
	private RuleExpression expression;
	
	private boolean outcome;
	
	public ExecutionDetails() {
	}
	public RuleExpression getExpression() {
		return expression;
	}
	public void setExpression(RuleExpression expression) {
		this.expression = expression;
	}
	public boolean isOutcome() {
		return outcome;
	}
	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}

}
