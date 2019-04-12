package com.expr.brule.newtests;


import com.expr.brule.xml.RuleToXMLCoverter;

/**
 * test rule to xml conversion
 * @author ssdImmanuel
 *
 */
public class RuleExecTest5 {

	public static void main(String[] args) throws Exception {

		String rule = "ispresent and (a=100 and amount = 900 ) and usertype = 2 "
				+ "and (userlocationcode = 33 or userlocationcode = 36 "
				+ "or userlocationcode = 37 "
				+ "or userlocationcode = 38 "
				+ "or userlocationcode = 39 "
				+ "or userlocationcode = 40 "
				+ "or userlocationcode = 41 "
				+ "or userlocationcode = 42 "
				+ ")";
		
		System.out.println("Input rule: "+rule);
		
		RuleToXMLCoverter conv = new RuleToXMLCoverter(rule);
		conv.parseRule();
		
		System.out.println(""+conv.getXmlString());
		
	}

}
