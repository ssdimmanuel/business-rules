package com.expr.brule.newtests;

import java.io.IOException;

import com.expr.brule.pattern.FullRuleMatcher;

public class ReplaceTest4 {

	public static void main(String[] args) throws IOException {
		String rule = "( ( ( AMOUNT > 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		String rule1= "AMOUNT = 1010.00";
		rule1="<VARIABLE> = <VARIABLE>";
		rule1 = "( ( ( AMOUNT <GT> 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		
		FullRuleMatcher rmat = new FullRuleMatcher(rule, rule1);
		rmat.parseRule();
		
	}

}
