package com.expr.brule.newtests;

import java.io.IOException;

import com.expr.brule.pattern.RulePatternMatcher;

public class PatternTest {

	public static void main(String[] args) throws IOException {
		String rule = "( ( ( AMOUNT > 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		String pattern= "AMOUNT = 1010.00";
		pattern="<VARIABLE> <GT> <VARIABLE>";
		
//		pattern="<LEFTPAREN> <VARIABLE> = <VARIABLE><RIGHTPAREN>";
		
		RulePatternMatcher rmat = new RulePatternMatcher(rule, pattern);
		rmat.parseRule();
		
	}

}
