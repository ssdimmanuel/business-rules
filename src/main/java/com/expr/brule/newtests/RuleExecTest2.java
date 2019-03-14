package com.expr.brule.newtests;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.expr.brule.evaluate.RuleExecutionContext;
import com.expr.brule.evaluate.RuleSetExecutor;

public class RuleExecTest2 {

	public static void main(String[] args) throws Exception {

		List<RuleExecutionContext> ctxs = new ArrayList<RuleExecutionContext>();
		String rule = "( ( IND1 = 1)  OR ( IND2 > 2 ) )";
		System.out.println("Input rule: "+rule);

		HashMap<String, Object> values = new HashMap();
		values.put("IND1", 1.0);
		values.put("IND2", 22.1);
		RuleExecutionContext ctx = new RuleExecutionContext(rule,values);
		ctxs.add(ctx);
		
		rule = "( ( IND1 = 1)  OR ( IND2 > 2 ) )";
		values = new HashMap();
		values.put("IND1", 1.0);
		values.put("IND2", 100);
		ctx = new RuleExecutionContext(rule,values);
		ctxs.add(ctx);
		
		rule = "( ( IND1 = 1)  OR ( IND2 > 2 ) )";
		values = new HashMap();
		values.put("IND1", 1.0);
		values.put("IND2", 50);
		ctx = new RuleExecutionContext(rule,values);
		ctxs.add(ctx);
		
		rule = "( ( IND1 = 1)  OR ( IND2 > 2 ) )";
		values = new HashMap();
		values.put("IND1", 1.0);
		values.put("IND2", 800);
		ctx = new RuleExecutionContext(rule,values);
		ctxs.add(ctx);
		
		
		RuleSetExecutor exec = new RuleSetExecutor(ctxs);
		exec.execute();
		
		System.out.println("Time diff: "+exec.getDiff()+" msec");
		
	}

}
