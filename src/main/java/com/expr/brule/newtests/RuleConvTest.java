package com.expr.brule.newtests;

import com.expr.brule.xml.RuleToXMLCoverter;

/**
 * test rule to xml conversion
 * 
 * @author ssdImmanuel
 *
 */
public class RuleConvTest {

	public static void main(String[] args) throws Exception {

		String rule = "ispresent and a=100 and amount = 900 and usertype = 2 and (userlocationcode = 33 or userlocationcode = 36)";

		rule = "ind=Y or amount = 1000000";
		String x1 = "";
		String x2 = "";

		System.out.println("Input rule: " + rule);

		RuleToXMLCoverter conv = new RuleToXMLCoverter(rule);
		conv.parseRule();
		System.out.println(conv.getXmlString());
		x1 = conv.getXmlString();


	}

}
