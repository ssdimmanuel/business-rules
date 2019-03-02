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
			.leftParenthesis()
			.variable("C")
			.equals()
			.variable("D")
			.rightParenthesis()
			.and()
			.expression("A", "=", "Z")
			.or()
			.leftParenthesis()
			.variable("aaa")
			.rightParenthesis()
			/*.and()
			.leftParenthesis()
			.expression("C", "=", "D")
			.rightParenthesis()*/
		;
		
		System.out.println("Rule: "+builder.build());

	}

}
