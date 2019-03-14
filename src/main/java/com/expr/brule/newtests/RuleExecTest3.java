package com.expr.brule.newtests;


import java.io.File;

import com.expr.brule.evaluate.ExecutionEngine;

public class RuleExecTest3 {

	public static void main(String[] args) throws Exception {

		String rule = "a=100";
		
		System.out.println("Input rule: "+rule);
		
		ExecutionEngine eng = new ExecutionEngine(rule, new File("ruledata.properties"));
		eng.evaluate();
		
		System.out.println(eng.getRuleResult());
		
	}

}
