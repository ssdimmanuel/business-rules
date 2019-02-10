package com.expr.brule.evaluate;

import java.util.ArrayList;

public class RuleResult {
	
	private boolean outcome;
	
	private ArrayList<ExecutionDetails> executionDetails;

	public RuleResult() {
		this.executionDetails = new ArrayList();
	}

	public boolean isOutcome() {
		return outcome;
	}

	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}

	public ArrayList<ExecutionDetails> getExecutionDetails() {
		return executionDetails;
	}

	public void setExecutionDetails(ArrayList<ExecutionDetails> executionDetails) {
		this.executionDetails = executionDetails;
	}
	
	public void addExecutionInstance(ExecutionDetails detail) {
		this.executionDetails.add(detail);
	}

}
