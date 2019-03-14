package com.expr.brule.newtests;


import java.io.File;

import com.expr.brule.builder.RuleBuilder;
import com.expr.brule.evaluate.ExecutionEngine;

public class RuleExecTest4 {

	public static void main(String[] args) throws Exception {

		String rule = "a=100";
		
		RuleBuilder rb = RuleBuilder.newBuilder();
		rb
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "200")
		.or()
		.expression("a", "=", "300")
		.or()
		.expression("a", "=", "400")
		.or()
		.expression("a", "=", "500")
		.or()
		.expression("a", "=", "600")
		.or()
		.expression("a", "=", "700")
		.or()
		.expression("a", "=", "800")
		.or()
		.expression("a", "=", "900")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")
		.or()
		.expression("a", "=", "100")		
		;
		
		System.out.println("Input rule: "+rule);
		
		ExecutionEngine eng = new ExecutionEngine(rb.build(), new File("ruledata.properties"));
		eng.evaluate();
		
		System.out.println(eng.getRuleResult());
		
	}

}
