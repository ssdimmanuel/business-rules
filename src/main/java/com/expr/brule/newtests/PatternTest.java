package com.expr.brule.newtests;

import java.io.IOException;

import com.expr.brule.pattern.RulePatternMatcher;

public class PatternTest {

	public static void main(String[] args) throws IOException {
		String rule = "( ( ( AMOUNT > 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		String rule1= "AMOUNT = 1010.00";
		rule1="<VARIABLE> = <VARIABLE>";
		
		rule1="<LEFTPAREN>ind1 = <VARIABLE><RIGHTPAREN>";
		
		RulePatternMatcher rmat = new RulePatternMatcher(rule, rule1);
		rmat.parseRule();
		
	}

}
