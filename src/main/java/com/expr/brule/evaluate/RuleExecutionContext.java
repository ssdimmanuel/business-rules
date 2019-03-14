package com.expr.brule.evaluate;

import java.util.HashMap;

/**
 * Context information supplied as input to the <code>ExecutionEngine
 * @author ssdImmanuel
 *
 */
public class RuleExecutionContext {
	/**
	 * Business rule expression
	 */
	private String rule;
	
	/**
	 * Runtime data supplied as a HashMap
	 */
	private HashMap<String, Object> data;

	public RuleExecutionContext() {
	}
	
	public RuleExecutionContext(String rule, HashMap<String, Object> data) {
		super();
		this.rule = rule;
		this.data = data;
	}


	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		this.data = data;
	}

}
