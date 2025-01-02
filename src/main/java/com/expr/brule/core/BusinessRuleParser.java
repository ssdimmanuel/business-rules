// Generated from C:/Dev Work/business-rule-parser/BusinessRule.g4 by ANTLR 4.13.2

package com.expr.brule.core;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BusinessRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, STRING=4, RULEDELIM=5, QUOTE=6, LEFTPAREN=7, 
		RIGHTPAREN=8, EQUAL=9, LT=10, GT=11, LTE=12, GTE=13, NE=14, AND=15, OR=16, 
		VARIABLE=17, NUMBER=18, SPACE=19;
	public static final int
		RULE_parse = 0, RULE_expr = 1, RULE_binop = 2, RULE_compop = 3, RULE_function = 4, 
		RULE_args = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "expr", "binop", "compop", "function", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, "';'", "'\"'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TRUE", "FALSE", "STRING", "RULEDELIM", "QUOTE", "LEFTPAREN", 
			"RIGHTPAREN", "EQUAL", "LT", "GT", "LTE", "GTE", "NE", "AND", "OR", "VARIABLE", 
			"NUMBER", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BusinessRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BusinessRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BusinessRuleParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			expr(0);
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExprContext {
		public Token lhs;
		public Token rhs;
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public TerminalNode STRING() { return getToken(BusinessRuleParser.STRING, 0); }
		public StringExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExprContext {
		public Token lhs;
		public Token rhs;
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(BusinessRuleParser.NUMBER, 0); }
		public NumberExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(BusinessRuleParser.TRUE, 0); }
		public BooleanTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterBooleanTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitBooleanTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitBooleanTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnclosedExpressionContext extends ExprContext {
		public TerminalNode LEFTPAREN() { return getToken(BusinessRuleParser.LEFTPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(BusinessRuleParser.RIGHTPAREN, 0); }
		public EnclosedExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterEnclosedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitEnclosedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitEnclosedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(BusinessRuleParser.FALSE, 0); }
		public BooleanFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterBooleanFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitBooleanFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitBooleanFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanVariableContext extends ExprContext {
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public BooleanVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterBooleanVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitBooleanVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitBooleanVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public LogicalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExpressionContext extends ExprContext {
		public Token lhs;
		public Token rhs;
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(BusinessRuleParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(BusinessRuleParser.VARIABLE, i);
		}
		public VariableExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16);
				((VariableExpressionContext)_localctx).lhs = match(VARIABLE);
				setState(17);
				compop();
				setState(18);
				((VariableExpressionContext)_localctx).rhs = match(VARIABLE);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				((StringExpressionContext)_localctx).lhs = match(VARIABLE);
				setState(21);
				compop();
				setState(22);
				((StringExpressionContext)_localctx).rhs = match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				((NumberExpressionContext)_localctx).lhs = match(VARIABLE);
				setState(25);
				compop();
				setState(26);
				((NumberExpressionContext)_localctx).rhs = match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				function();
				}
				break;
			case 5:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new BooleanVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(VARIABLE);
				}
				break;
			case 8:
				{
				_localctx = new EnclosedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(LEFTPAREN);
				setState(33);
				expr(0);
				setState(34);
				match(RIGHTPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(38);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(39);
					binop();
					setState(40);
					expr(10);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(BusinessRuleParser.AND, 0); }
		public TerminalNode OR() { return getToken(BusinessRuleParser.OR, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(BusinessRuleParser.EQUAL, 0); }
		public TerminalNode LT() { return getToken(BusinessRuleParser.LT, 0); }
		public TerminalNode GT() { return getToken(BusinessRuleParser.GT, 0); }
		public TerminalNode LTE() { return getToken(BusinessRuleParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(BusinessRuleParser.GTE, 0); }
		public TerminalNode NE() { return getToken(BusinessRuleParser.NE, 0); }
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitCompop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitCompop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(BusinessRuleParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(BusinessRuleParser.RIGHTPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(VARIABLE);
			setState(52);
			match(LEFTPAREN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(53);
				args();
				}
			}

			setState(56);
			match(RIGHTPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(BusinessRuleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BusinessRuleParser.STRING, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BusinessRuleListener ) ((BusinessRuleListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleVisitor ) return ((BusinessRuleVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(STRING);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(59);
				match(T__0);
				setState(60);
				match(STRING);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013C\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u00047\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005>\b\u0005\n\u0005\f\u0005A\t\u0005\u0001"+
		"\u0005\u0000\u0001\u0002\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0002"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\t\u000eF\u0000\f\u0001\u0000\u0000"+
		"\u0000\u0002$\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000"+
		"\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e"+
		"\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0006\u0001\uffff\uffff\u0000"+
		"\u0010\u0011\u0005\u0011\u0000\u0000\u0011\u0012\u0003\u0006\u0003\u0000"+
		"\u0012\u0013\u0005\u0011\u0000\u0000\u0013%\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0005\u0011\u0000\u0000\u0015\u0016\u0003\u0006\u0003\u0000\u0016"+
		"\u0017\u0005\u0004\u0000\u0000\u0017%\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0011\u0000\u0000\u0019\u001a\u0003\u0006\u0003\u0000\u001a\u001b"+
		"\u0005\u0012\u0000\u0000\u001b%\u0001\u0000\u0000\u0000\u001c%\u0003\b"+
		"\u0004\u0000\u001d%\u0005\u0002\u0000\u0000\u001e%\u0005\u0003\u0000\u0000"+
		"\u001f%\u0005\u0011\u0000\u0000 !\u0005\u0007\u0000\u0000!\"\u0003\u0002"+
		"\u0001\u0000\"#\u0005\b\u0000\u0000#%\u0001\u0000\u0000\u0000$\u000f\u0001"+
		"\u0000\u0000\u0000$\u0014\u0001\u0000\u0000\u0000$\u0018\u0001\u0000\u0000"+
		"\u0000$\u001c\u0001\u0000\u0000\u0000$\u001d\u0001\u0000\u0000\u0000$"+
		"\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001"+
		"\u0000\u0000\u0000%,\u0001\u0000\u0000\u0000&\'\n\t\u0000\u0000\'(\u0003"+
		"\u0004\u0002\u0000()\u0003\u0002\u0001\n)+\u0001\u0000\u0000\u0000*&\u0001"+
		"\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000/0\u0007\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"12\u0007\u0001\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0005\u0011"+
		"\u0000\u000046\u0005\u0007\u0000\u000057\u0003\n\u0005\u000065\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005"+
		"\b\u0000\u00009\t\u0001\u0000\u0000\u0000:?\u0005\u0004\u0000\u0000;<"+
		"\u0005\u0001\u0000\u0000<>\u0005\u0004\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@\u000b\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"\u0004$,6?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}