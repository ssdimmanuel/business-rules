package com.expr.brule.builder;

public enum Operators {
	EQUAL("="),
	NotEqual("!="),
	GreaterThan(">"),
	LessThan("<"),
	GreaterThanOrEqual(">="),
	LessThanOrEqual("<=")
	;
	
	private String value;
	Operators(String ops){
		this.value = ops;
	}

	@Override
	public String toString() {
		return this.value;
	}
	

}
