package com.expr.brule.xml;

import java.io.File;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.expr.brule.common.ParseWrapper;
import com.expr.brule.core.BusinessRuleParser.BinopContext;
import com.expr.brule.core.BusinessRuleParser.BooleanVariableContext;
import com.expr.brule.core.BusinessRuleParser.ExprContext;
import com.expr.brule.core.BusinessRuleParser.LogicalExpressionContext;
import com.expr.brule.core.BusinessRuleParser.NumberExpressionContext;
import com.expr.brule.core.BusinessRuleParser.ParseContext;
import com.expr.brule.core.BusinessRuleParser.StringExpressionContext;
import com.expr.brule.core.BusinessRuleParser.VariableExpressionContext;

/**
 * Convert a business rule to its equivalent XML representation
 * This enables easier comparison of 2 rules
 * @author ssdImmanuel
 *
 */
public class RuleToXMLCoverter extends ParseWrapper {
	
	public RuleToXMLCoverter(String rule) {
		this(ConvertorConfigBuilder.getDefaultConfig(rule));
	}

	public RuleToXMLCoverter(ConvertorConfigBuilder config) {
		super(config.getRule());
		this.config = config;
	}

	private Document doc;
	private Element root;
	private ConvertorConfigBuilder config;
	
	/**
	 * Stack datastructure to keep track of nesting of expressions
	 */
	private Stack<Element> rootStack = new Stack<Element>();
	private HashSet<String> lhsused = new HashSet<String>();
	private File output;
	private int expressionCount=0;
	private int depth=0;
	private String xmlString;
	
	/**
	 * Create XML document at the start of rule processing
	 */
	@Override
	public void enterParse(ParseContext ctx) {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.newDocument();
			root = doc.createElement(RuleNodeType.businessRule.toString());
			doc.appendChild(root);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Write the XML to a File or String when the parsing is complete
	 */
	@Override
	public void exitParse(ParseContext ctx) {
		root.setAttribute("variables", lhsused.toString());
		root.setAttribute("expressionCount", String.valueOf(expressionCount));
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
			
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	        DOMSource source = new DOMSource(doc);

	        if(this.config.isWriteToFile()) {
	        	StreamResult file = new StreamResult(this.config.getOutfile());
		        transformer.transform(source, file);
	        }

	        //write data
	        StreamResult str = new StreamResult(new StringWriter());
	        transformer.transform(source, str);

	        this.xmlString = str.getWriter().toString();
	        System.out.println("DONE");
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
        
	}
	
	@Override
	public void enterBinop(BinopContext ctx) {
	}

	@Override
	public void exitBinop(BinopContext ctx) {
	}
	
	@Override
	public void enterLogicalExpression(LogicalExpressionContext ctx) {
		depth++;
		String tagname ="BinaryExpression";
		if(ctx.binop().getText().equals("&")) {
			tagname = RuleNodeType.and.toString();
		}else if(ctx.binop().getText().equals("|")) {
			tagname = RuleNodeType.or.toString();
		}else {
			tagname = ctx.binop().getText().toLowerCase();
		}
		Element newroot = doc.createElement(tagname);
		if (config.isIncludeDepth()) {
			newroot.setAttribute("depth", String.valueOf(depth));
		}
		
		root.appendChild(newroot);
		this.rootStack.push(root);
		root = newroot;
	}

	@Override
	public void exitLogicalExpression(LogicalExpressionContext ctx) {
		root = this.rootStack.pop();
		depth--;
	}

	@Override
	public void enterStringExpression(StringExpressionContext ctx) {
		this.expressionCount++;
		Element node = doc.createElement(RuleNodeType.StringExpression.toString());
		this.setupNodes(ctx, node);
		String remquot = ctx.rhs.getText();
		remquot = remquot.replaceAll("^\"|\"$", "");
		node.setAttribute("text", ctx.getText());
		node.setAttribute("lhs", ctx.lhs.getText());
		node.setAttribute("rhs", remquot);
		node.setAttribute("operator", ctx.compop().getText());
		root.appendChild(node);
		lhsused.add(ctx.lhs.getText());
	}

	@Override
	public void enterNumberExpression(NumberExpressionContext ctx) {
		this.expressionCount++;
		Element node = doc.createElement(RuleNodeType.NumberExpression.toString());
		this.setupNodes(ctx, node);
		node.setAttribute("text", ctx.getText());
		node.setAttribute("lhs", ctx.lhs.getText());
		node.setAttribute("rhs", ctx.rhs.getText());
		node.setAttribute("operator", ctx.compop().getText());
		root.appendChild(node);
		lhsused.add(ctx.lhs.getText());
	}

	@Override
	public void enterBooleanVariable(BooleanVariableContext ctx) {
		this.expressionCount++;
		Element node = doc.createElement("BooleanExpression");
		this.setupNodes(ctx, node);
		node.setAttribute("text", ctx.getText());
		root.appendChild(node);
	}

	@Override
	public void enterVariableExpression(VariableExpressionContext ctx) {
		this.expressionCount++;
		Element node = doc.createElement(RuleNodeType.VariableExpression.toString());
		this.setupNodes(ctx, node);
		node.setAttribute("text", ctx.getText());
		node.setAttribute("lhs", ctx.lhs.getText());
		node.setAttribute("rhs", ctx.rhs.getText());
		node.setAttribute("operator", ctx.compop().getText());
		root.appendChild(node);
		lhsused.add(ctx.lhs.getText());
	}
	
	
	private void setupNodes(ExprContext ctx, Element node) {
		
		if(this.config.isIncludeSequence()) {
			node.setAttribute("position", String.valueOf(expressionCount));
		}
		if(this.config.isIncludeDepth()) {
			node.setAttribute("depth", String.valueOf(depth));
		}
	}


	public String getXmlString() {
		return xmlString;
	}


	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}

}
