package com.expr.brule.newtests;

import java.io.IOException;

import com.expr.brule.stats.ExtractExpression;

public class ExtractTest {

	public static void main(String[] args) throws IOException {
		String rule = "( ( ( AMOUNT > 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		//rule= " ( AMOUNT = 1010.00 )";
		rule=" (AMOUNT > 200000.00 AND  IND1 = Y) or ( ind2 = I";
		
		//rule = "( a = b & c = 10.0) & b";
		ExtractExpression bal = new ExtractExpression(rule);
		bal.parseRule();
		
		System.out.println("Before: "+bal.getExpressions());
		System.out.println("After:  "+bal.getLatestRule().trim());
	}

}
