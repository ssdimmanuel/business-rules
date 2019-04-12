package com.expr.brule.xml;

import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RuleXMLHandler extends DefaultHandler {

	public RuleXMLHandler() {
	}
	
	private String originalRule="";
	Stack<String> opstack = new Stack<>();

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("final: "+originalRule);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.println(localName);
		if(localName.equals(RuleNodeType.and.toString())) {
			originalRule+="(";
			opstack.add(localName);
		}
		
		if(localName.equals(RuleNodeType.or.toString())) {
			originalRule+="(";
			opstack.add(localName);
		}
		
		if(localName.equals(RuleNodeType.NumberExpression.toString())
				||localName.equals(RuleNodeType.StringExpression.toString())
				||localName.equals(RuleNodeType.VariableExpression.toString())
				||localName.equals(RuleNodeType.BooleanExpression.toString())) {
			originalRule+=attributes.getValue("text");
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(localName.equals(RuleNodeType.and.toString())
		 ||localName.equals(RuleNodeType.or.toString())) {
			originalRule+=" )";
		}else {
			if(!opstack.isEmpty()) {
				originalRule+=" "+opstack.pop()+" ";
			}
		}
		
	}
	
	

}
