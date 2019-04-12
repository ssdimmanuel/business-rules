package com.expr.brule.pattern;

import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import com.expr.brule.common.ParseWrapper;
import com.expr.brule.core.BusinessRuleParser.EnclosedExpressionContext;
import com.expr.brule.core.BusinessRuleParser.LogicalExpressionContext;
import com.expr.brule.core.BusinessRuleParser.ParseContext;

public class FullRuleMatcher extends ParseWrapper {

	public FullRuleMatcher(String rule, String pattern) {
		super(rule);
		this.pattern = pattern;
	}

	private String pattern;
	
	@Override
	public void enterParse(ParseContext ctx) {}

	@Override
	public void enterEnclosedExpression(EnclosedExpressionContext ctx) {
		ParseTreePattern p = parser.compileParseTreePattern(pattern, ctx.getRuleIndex());
		ParseTreeMatch m = p.match(ctx);
		if (m.succeeded()) {
			System.out.println("matched: " + m.getTree().getText());
		}
	}

	@Override
	public void enterLogicalExpression(LogicalExpressionContext ctx) {
		ParseTreePattern p = parser.compileParseTreePattern(pattern, ctx.getRuleIndex());
		ParseTreeMatch m = p.match(ctx);
		if (m.succeeded()) {
			System.out.println("matched: " + m.getTree().getText());
		}
	}
	
	

}
