// Generated from BusinessRule.g4 by ANTLR 4.4

package com.expr.brule.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BusinessRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BusinessRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(@NotNull BusinessRuleParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enclosedExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnclosedExpression(@NotNull BusinessRuleParser.EnclosedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanFalse}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalse(@NotNull BusinessRuleParser.BooleanFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessRuleParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull BusinessRuleParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(@NotNull BusinessRuleParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull BusinessRuleParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull BusinessRuleParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessRuleParser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(@NotNull BusinessRuleParser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessRuleParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull BusinessRuleParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull BusinessRuleParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanTrue}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTrue(@NotNull BusinessRuleParser.BooleanTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessRuleParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull BusinessRuleParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanVariable}
	 * labeled alternative in {@link BusinessRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariable(@NotNull BusinessRuleParser.BooleanVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BusinessRuleParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(@NotNull BusinessRuleParser.BinopContext ctx);
}