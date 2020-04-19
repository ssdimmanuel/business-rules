package com.expr.brule.newtests;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.expr.brule.common.ParseWrapper;
import com.expr.brule.core.BusinessRuleParser;
import com.expr.brule.edits.RuleBalancer;
import com.expr.codecomp.CodeCompletionCore;
import com.expr.codecomp.CodeCompletionCore.CandidatesCollection;

public class CompletionTest {

	public static void main(String[] args) throws IOException {
		String rule = "( ( ( AMOUNT > 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		rule=" (AMOUNT > 200000.00 AND  IND1 = Y) or ( ind2  ";
		
		//rule = "( a = b & c = 10.0) & b";
		//RuleBalancer bal = new RuleBalancer(rule);
		//bal.parseRule();
		
		ParseWrapper pa = new ParseWrapper(rule);
		pa.parseRule();
		int lastinx = pa.getTokens().size()-1;
		System.out.println("Before: "+rule);
		System.out.println("After:  "+pa.getLatestRule().trim());
		
		CodeCompletionCore cc = new CodeCompletionCore(pa.getParser(), null, null);
		CandidatesCollection cc1 = cc.collectCandidates(lastinx, pa.getParser().getContext());
		
		System.out.println(cc1.tokens);
		
		Map<Integer, List<Integer>>  next = cc1.tokens;

		Set<Integer> tokens = next.keySet();
		
		for(int val : tokens) {
			System.out.println(">> "+val+"; "+BusinessRuleParser.VOCABULARY.getSymbolicName(val));
		}
		
	}

}
