package com.expr.brule.newtests;

import java.util.Iterator;

import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.Difference;

import com.expr.brule.xml.RuleToXMLCoverter;

/**
 * test rule to xml conversion
 * 
 * @author ssdImmanuel
 *
 */
public class RuleConvTest2 {

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

		String rule1 = "ind=Y and amount = 1000000";

		RuleToXMLCoverter conv1 = new RuleToXMLCoverter(rule1);
		conv1.parseRule();
		System.out.println(conv1.getXmlString());
		x2 = conv1.getXmlString();

		Diff diff = DiffBuilder
				.compare(x1)
				.withTest(x2)
				.ignoreComments()
				.ignoreWhitespace()
				.build();
		
		Iterator<Difference> it = diff.getDifferences().iterator();
		
		while(it.hasNext()) {
			Difference diffs = it.next();
			diffs.getComparison().getControlDetails().getParentXPath();
			System.out.println(diffs);
		}
		

	}

}
