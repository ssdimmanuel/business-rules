// Generated from BusinessRule.g4 by ANTLR 4.4

package com.expr.brule.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BusinessRuleParser}.
 */
public interface BusinessRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(@NotNull BusinessRuleParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(@NotNull BusinessRuleParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enclosedExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedExpression(@NotNull BusinessRuleParser.EnclosedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enclosedExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedExpression(@NotNull BusinessRuleParser.EnclosedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFalse(@NotNull BusinessRuleParser.BooleanFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFalse(@NotNull BusinessRuleParser.BooleanFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BusinessRuleParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull BusinessRuleParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessRuleParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull BusinessRuleParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull BusinessRuleParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull BusinessRuleParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(@NotNull BusinessRuleParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(@NotNull BusinessRuleParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull BusinessRuleParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull BusinessRuleParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BusinessRuleParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(@NotNull BusinessRuleParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessRuleParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(@NotNull BusinessRuleParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BusinessRuleParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull BusinessRuleParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessRuleParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull BusinessRuleParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull BusinessRuleParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull BusinessRuleParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrue(@NotNull BusinessRuleParser.BooleanTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrue(@NotNull BusinessRuleParser.BooleanTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BusinessRuleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull BusinessRuleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessRuleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull BusinessRuleParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanVariable}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariable(@NotNull BusinessRuleParser.BooleanVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanVariable}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariable(@NotNull BusinessRuleParser.BooleanVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BusinessRuleParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(@NotNull BusinessRuleParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BusinessRuleParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(@NotNull BusinessRuleParser.BinopContext ctx);
}