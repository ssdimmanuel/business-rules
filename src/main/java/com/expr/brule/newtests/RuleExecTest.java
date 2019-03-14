package com.expr.brule.newtests;


import java.util.HashMap;

import com.expr.brule.evaluate.ExecutionEngine;

public class RuleExecTest {

	public static void main(String[] args) throws Exception {

		String rule = "( ( IND1 = 1)  OR ( IND2 > 2 ) )";
		
		
		System.out.println("Input rule: "+rule);
		
		HashMap<String, Object> values = new HashMap();
		values.put("IND1", 1.0);
		values.put("IND2", 22.1);
		
		ExecutionEngine eng = new ExecutionEngine(rule, values);
		eng.evaluate();
		
		System.out.println(eng.getRuleResult());
		
	}

}
