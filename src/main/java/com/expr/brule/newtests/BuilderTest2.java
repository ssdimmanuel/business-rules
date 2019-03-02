package com.expr.brule.newtests;

import com.expr.brule.builder.Operators;
import com.expr.brule.builder.RuleBuilder;

public class BuilderTest2 {

	public static void main(String[] args) {
		
		RuleBuilder builder = RuleBuilder.newBuilder();
		builder.expression("A", Operators.NotEqual, "B")
		.and()
		.expression("C", Operators.EQUAL, "D")
		;
		
		System.out.println("Rule: "+builder.build());

	}

}
