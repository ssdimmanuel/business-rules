package com.expr.brule.builder;

public interface IComparisonOperator {
	
	public IVariableProvider equals();
	
	public IVariableProvider lessthan();
	
	public IVariableProvider greaterthan();
	
	public IVariableProvider greaterthanorEqual();
	
	public IVariableProvider lessthanorEqual();

}
