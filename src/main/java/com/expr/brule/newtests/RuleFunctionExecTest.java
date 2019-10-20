package com.expr.brule.newtests;


import java.util.HashMap;

import com.expr.brule.evaluate.ExecutionEngine;
import com.expr.brule.evaluate.IFunctionHandler;

public class RuleFunctionExecTest {

	public static void main(String[] args) throws Exception {

		String rule = "( ( alwaystrue(\"Y\",\"This is a second arg\") )  OR ( IND2 > 2 ) )";
		
		
		System.out.println("Input rule: "+rule);
		
		HashMap<String, Object> values = new HashMap<String, Object>();
		values.put("IND1", 1.0);
		values.put("IND2", 22.1);
		values.put("alwaystrue", new IFunctionHandler() {
			
			@Override
			public boolean execute() {
				return false;
			}

			@Override
			public boolean isValidationSuccess(String... args) {
				return true;
			}
			
		});
		
		ExecutionEngine eng = new ExecutionEngine(rule, values);
		eng.evaluate();
		
		System.out.println(eng.getRuleResult());
		
	}

}
