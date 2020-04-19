package com.expr.brule.newtests;

import java.util.HashMap;

import com.expr.brule.evaluate.ExecutionEngine;

public class RuleExecTest {

	public static void main(String[] args) throws Exception {

		String rule = "( ( IND1 = 1)  OR ( IND2 > 2 ) )";

		rule = "ispresent and (a=100 and amount = 900 ) and usertype = 2 and (userlocationcode = 33 or userlocationcode = 36 or userlocationcode = 37 or userlocationcode = 38 or userlocationcode = 39 or userlocationcode = 40 or userlocationcode = 41 or userlocationcode = 42 )";

		//rule = "ispresent";
		System.out.println("Input rule: " + rule);

		HashMap<String, Object> values = new HashMap();
		values.put("IND1", 1.0);
		values.put("IND2", 22.1);
		values.put("ispresent", true);

		ExecutionEngine eng = new ExecutionEngine(rule, values);
		eng.evaluate();

		System.out.println(eng.getRuleResult());

	}

}
