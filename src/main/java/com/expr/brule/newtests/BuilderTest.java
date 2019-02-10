package com.expr.brule.newtests;

import com.expr.brule.builder.RuleBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		
		RuleBuilder builder = new RuleBuilder();
		builder.leftParenthesis()
			.variable("A")
			.equals()
			.variable("B")
			.rightParenthesis()
			.and()
			.expression("C", "=", "D")
			.rightParenthesis()
		;
		
		System.out.println(builder.build());

	}

}
