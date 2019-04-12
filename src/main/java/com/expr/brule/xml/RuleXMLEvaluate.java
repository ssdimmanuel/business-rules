package com.expr.brule.xml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RuleXMLEvaluate {

	public RuleXMLEvaluate(String xml, HashMap<String, Object> data) {
		this.xml = xml;
		this.data = data;
	}

	/**
	 * Rule in xml format
	 */
	private String xml;
	private HashMap<String, Object> data;

	public void evaluate() throws SAXException, IOException, ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		Document doc = db.parse(new ByteArrayInputStream(xml.getBytes()));

		traverse(doc.getDocumentElement(), "");
		System.out.println("-----------------------------------");

		System.out.println(doc.getDocumentElement());
		DOMSource domSource = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);
		System.out.println("XML IN String format is: \n" + writer.toString());
	}

	/**
	 * Traverse rule xml and evaluate
	 * @param node
	 * @param indent
	 * @return result
	 */
	public boolean traverse(Node node, String indent) {

		String name = node.getNodeName();
		NodeList nodeList = node.getChildNodes();
		boolean result = false;
		boolean result1;
		boolean result2;

		Node lhsnode = null;
		Node rhsnode = null;

		if (name.equals(RuleNodeType.businessRule.toString())) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node currentNode = nodeList.item(i);
				if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
					result = traverse(currentNode, indent + "  ");
				}
			}
		} else if (name.equals(RuleNodeType.and.toString()) || name.equals(RuleNodeType.or.toString())) {
			System.out.println(indent + name);
			ArrayList<Node> nodes = getExpressions(nodeList);

			lhsnode = nodes.get(0);
			rhsnode = nodes.get(1);
			result1 = traverse(lhsnode, indent + "  ");
			result2 = traverse(rhsnode, indent + "  ");
			System.out.println(indent + result1 + " " + result2);
			if (name.equals(RuleNodeType.and.toString())) {
				result = result1 && result2;
			} else {
				result = result1 || result2;
			}

			updateResult(node, lhsnode, rhsnode, result, result1, result2);
		} else {
			NamedNodeMap map = node.getAttributes();
			System.out.println(indent + node.getNodeName() + " - " + map.getNamedItem("text"));

			Node _lhs = map.getNamedItem("lhs");
			Node _rhs = map.getNamedItem("rhs");
			Node _op = map.getNamedItem("operator");

			String lhsvar = _lhs.getNodeValue();
			Object runtimelhs = data.get(lhsvar);

			if (runtimelhs == null) {
				throw new RuntimeException("Value not passed for variable: " + lhsvar);
			}

			String passedLHS = runtimelhs.toString();
			String rhsval = _rhs.getNodeValue();

			if (name.equals(RuleNodeType.NumberExpression.toString())) {
				Double lhsnum = Double.parseDouble(passedLHS);
				Double rhsnum = Double.parseDouble(rhsval);
				result= handleNumberExp(lhsnum, rhsnum, _op.getNodeValue());
			} else if (name.equals(RuleNodeType.VariableExpression.toString())) {
				Object runtimerhs = data.get(rhsval);
				if (runtimerhs == null) {
					throw new RuntimeException("Value not passed for variable: " + rhsval);
				}

				String passedRHS = runtimerhs.toString();
				result= handleStringExp(passedLHS, passedRHS, _op.getNodeValue());
			} else if (name.equals(RuleNodeType.StringExpression.toString())) {
				result= handleStringExp(passedLHS, rhsval, _op.getNodeValue());
			}

		}

		return result;
	}

	/**
	 * Get the 2 expression for a 'and' or 'or' node
	 * @param nodeList
	 * @return
	 */
	private ArrayList<Node> getExpressions(NodeList nodeList) {
		ArrayList<Node> nodes = new ArrayList<>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node currentNode = nodeList.item(i);
			if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
				nodes.add(currentNode);
			}
		}

		if (nodes.size() > 2 || nodes.size() < 2) {
			throw new RuntimeException("Error");
		}
		return nodes;
	}

	/**
	 * update the result of evaluation on xml nodes
	 * @param node
	 * @param lhsnode
	 * @param rhsnode
	 * @param result
	 * @param result1
	 * @param result2
	 */
	private void updateResult(Node node, Node lhsnode, Node rhsnode, boolean result, boolean result1, boolean result2) {
		Element e = (Element) node;
		Element e1 = (Element) lhsnode;
		Element e2 = (Element) rhsnode;

		e.setAttribute("result", String.valueOf(result));
		e1.setAttribute("result", String.valueOf(result1));
		e2.setAttribute("result", String.valueOf(result2));
	}

	
	private boolean handleStringExp(String lhs, String rhs, String op) {
		boolean value = false;
		if (op.equals("=")) {
			value = lhs.equals(rhs);
		}
		if (op.equals(">")) {
		}
		if (op.equals("<")) {
		}

		return value;
	}

	/**
	 * Evaluate number expression
	 * @param lhsnum
	 * @param rhsnum
	 * @param op
	 * @return
	 */
	private boolean handleNumberExp(double lhsnum, double rhsnum, String op) {
		boolean value = false;
		if (op.equals("=")) {
			value = lhsnum == rhsnum;
		}
		if (op.equals(">")) {
			value = lhsnum > rhsnum;
		}
		if (op.equals("<")) {
			value = lhsnum < rhsnum;
		}
		
		if (op.equals("<=")) {
			value = lhsnum <= rhsnum;
		}
		if (op.equals(">=")) {
			value = lhsnum >= rhsnum;
		}
		if (op.equals("!=")) {
			value = lhsnum != rhsnum;
		}

		return value;
	}

}
