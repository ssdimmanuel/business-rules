package com.expr.brule.builder;

public interface IExpressionProvider {
	public IBooleanProvider expression(String lhs, String op, String rhs);
	public IBooleanProvider expression(String lhs, Operators op, String rhs);
}
