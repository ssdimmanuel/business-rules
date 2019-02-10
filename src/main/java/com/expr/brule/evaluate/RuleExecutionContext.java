package com.expr.brule.evaluate;

import java.util.HashMap;

public class RuleExecutionContext {
	
	private String rule;
	private HashMap<String, String> data;

	public RuleExecutionContext() {
	}
	
	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public HashMap<String, String> getData() {
		return data;
	}

	public void setData(HashMap<String, String> data) {
		this.data = data;
	}

}
