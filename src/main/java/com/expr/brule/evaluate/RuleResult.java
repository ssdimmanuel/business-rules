package com.expr.brule.evaluate;

import java.util.ArrayList;

/**
 * Accumulated Result of rule execution
 * @author ssdImmanuel
 *
 */
public class RuleResult {
	
	private boolean outcome;
	
	private ArrayList<ExecutionDetails> executionDetails;
	private String startTime;
	private String endTime;

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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String toString() {
		return this.executionDetails.stream()
				.map(exec -> exec.toString()+"\n")
				.reduce("", String::concat);
	}

}
