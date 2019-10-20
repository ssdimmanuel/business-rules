package com.expr.brule.newtests;


import java.io.ByteArrayInputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.expr.brule.xml.RuleToXMLCoverter;
import com.expr.brule.xml.RuleXMLHandler;

/**
 * test rule to xml conversion
 * @author ssdImmanuel
 *
 */
public class RuleXMLToStringTest {

	public static void main(String[] args) throws Exception {

		String rule = "ispresent and a=100 and amount = 900 and usertype = 2 "
				+ "and (userlocationcode = 33 or userlocationcode = 36 "
				+ "or userlocationcode = 37 "
				+ "or userlocationcode = 38 "
				+ "or userlocationcode = 39 "
				+ "or userlocationcode = 40 "
				+ "or userlocationcode = 41 "
				+ "or userlocationcode = 42 "
				+ ")";
		
		rule = "(a=100 and amount = 900 or z = y) ";
		System.out.println("Input rule: "+rule);
		
		RuleToXMLCoverter conv = new RuleToXMLCoverter(rule);
		conv.parseRule();
		
		System.out.println(""+conv.getXmlString());
		
		RuleXMLHandler hand = new RuleXMLHandler();
		 
        //Create parser from factory
        XMLReader parser = XMLReaderFactory.createXMLReader();

        //Register handler with parser
        parser.setContentHandler(hand);

        ByteArrayInputStream is = new ByteArrayInputStream(conv.getXmlString().getBytes());
        //Create an input source from the XML input stream
        InputSource source = new InputSource(is);

        //parse the document
        parser.parse(source);
		
	}

}
