package com.expr.brule.newtests;


import java.io.File;

import com.expr.brule.xml.RuleToXMLCoverter;

/**
 * test rule to xml conversion
 * @author ssdImmanuel
 *
 */
public class RuleExecTest5 {

	public static void main(String[] args) throws Exception {

		String rule = "ispresent and a=100 and amount = 900 and usertype = 2 and (userlocationcode = 33 or userlocationcode = 36)";
		
		System.out.println("Input rule: "+rule);
		
		RuleToXMLCoverter conv = new RuleToXMLCoverter(rule, new File("rule.xml"));
		conv.parseRule();
		
		System.out.println("");
		
	}

}
