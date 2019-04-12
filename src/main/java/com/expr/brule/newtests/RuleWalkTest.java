package com.expr.brule.newtests;

import java.util.HashMap;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.expr.brule.xml.RuleToXMLCoverter;
import com.expr.brule.xml.RuleXMLEvaluate;

/**
 * test rule to xml conversion
 * 
 * @author ssdImmanuel
 *
 */
public class RuleWalkTest {

	public static void main(String[] args) throws Exception {

		String rule = "ispresent and a=100 and amount = 900 and usertype = 2 and (userlocationcode = 33 or userlocationcode = 36)";

		rule = "a = 100 or b = 400 and c = 200 and a = b";
		
		rule="a = \"100\" AND b=300 and ind = \"Y\"" ;
		System.out.println("Input rule: " + rule);

		RuleToXMLCoverter conv = new RuleToXMLCoverter(rule);
		conv.parseRule();

		System.out.println("" + conv.getXmlString());

		System.out.println("--------------------------------------------");
		String xml = conv.getXmlString();
		
		HashMap<String, Object> data = new HashMap<>();
		data.put("a", 100);
		data.put("b", 300);
		data.put("c", 200);
		//data.put("ind", "Y");
		RuleXMLEvaluate eval = new RuleXMLEvaluate(xml, data);
		eval.evaluate();
	}
	
	public static void doSomething(Node node, String indent) {
	    // do something with the current node instead of System.out
		
		String name = node.getNodeName();
		
		if(name.equals("and")||name.equals("or")) {
			System.out.println(indent + node.getNodeName());
		}else {
			NamedNodeMap map = node.getAttributes(); 
			System.out.println(indent + node.getNodeName()+" - "+map.getNamedItem("lhs"));
		}

	    NodeList nodeList = node.getChildNodes();
	    for (int i = 0; i < nodeList.getLength(); i++) {
	        Node currentNode = nodeList.item(i);
	        if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
	            doSomething(currentNode, indent+"  ");
	        }
	    }
	}

}
