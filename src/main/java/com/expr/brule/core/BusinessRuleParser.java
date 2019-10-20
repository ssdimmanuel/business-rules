// Generated from BusinessRule.g4 by ANTLR 4.4

package com.expr.brule.core;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BusinessRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, STRING=4, QUOTE=5, LEFTPAREN=6, RIGHTPAREN=7, 
		EQUAL=8, LT=9, GT=10, LTE=11, GTE=12, NE=13, AND=14, OR=15, VARIABLE=16, 
		NUMBER=17, SPACE=18;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "TRUE", "FALSE", "STRING", "'\"'", "'('", "')'", "EQUAL", 
		"LT", "GT", "LTE", "GTE", "NE", "AND", "OR", "VARIABLE", "NUMBER", "SPACE"
	};
	public static final int
		RULE_parse = 0, RULE_expr = 1, RULE_binop = 2, RULE_compop = 3, RULE_function = 4, 
		RULE_args = 5;
	public static final String[] ruleNames = {
		"parse", "expr", "binop", "compop", "function", "args"
	};

	@Override
	public String getGrammarFileName() { return "BusinessRule.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
			setState(12); expr(0);
			setState(13); match(EOF);
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
	public static class StringExpressionContext extends ExprContext {
		public Token lhs;
		public Token rhs;
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BusinessRuleParser.STRING, 0); }
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
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
	public static class EnclosedExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(BusinessRuleParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTPAREN() { return getToken(BusinessRuleParser.LEFTPAREN, 0); }
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
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16); ((VariableExpressionContext)_localctx).lhs = match(VARIABLE);
				setState(17); compop();
				setState(18); ((VariableExpressionContext)_localctx).rhs = match(VARIABLE);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20); ((StringExpressionContext)_localctx).lhs = match(VARIABLE);
				setState(21); compop();
				setState(22); ((StringExpressionContext)_localctx).rhs = match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24); ((NumberExpressionContext)_localctx).lhs = match(VARIABLE);
				setState(25); compop();
				setState(26); ((NumberExpressionContext)_localctx).rhs = match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28); function();
				}
				break;
			case 5:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30); match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new BooleanVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); match(VARIABLE);
				}
				break;
			case 8:
				{
				_localctx = new EnclosedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32); match(LEFTPAREN);
				setState(33); expr(0);
				setState(34); match(RIGHTPAREN);
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
					setState(39); binop();
					setState(40); expr(10);
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
			consume();
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

	public static class CompopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(BusinessRuleParser.EQUAL, 0); }
		public TerminalNode LT() { return getToken(BusinessRuleParser.LT, 0); }
		public TerminalNode GTE() { return getToken(BusinessRuleParser.GTE, 0); }
		public TerminalNode GT() { return getToken(BusinessRuleParser.GT, 0); }
		public TerminalNode NE() { return getToken(BusinessRuleParser.NE, 0); }
		public TerminalNode LTE() { return getToken(BusinessRuleParser.LTE, 0); }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode RIGHTPAREN() { return getToken(BusinessRuleParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTPAREN() { return getToken(BusinessRuleParser.LEFTPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
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
			setState(51); match(VARIABLE);
			setState(52); match(LEFTPAREN);
			setState(54);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(53); args();
				}
			}

			setState(56); match(RIGHTPAREN);
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(BusinessRuleParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(BusinessRuleParser.STRING); }
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
			setState(58); match(STRING);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(59); match(T__0);
				setState(60); match(STRING);
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
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'\n\3"+
		"\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\5\69\n\6\3\6\3\6\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7\3\7\2\3\4\b\2\4"+
		"\6\b\n\f\2\4\3\2\20\21\3\2\n\17H\2\16\3\2\2\2\4&\3\2\2\2\6\61\3\2\2\2"+
		"\b\63\3\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3"+
		"\3\2\2\2\21\22\b\3\1\2\22\23\7\22\2\2\23\24\5\b\5\2\24\25\7\22\2\2\25"+
		"\'\3\2\2\2\26\27\7\22\2\2\27\30\5\b\5\2\30\31\7\6\2\2\31\'\3\2\2\2\32"+
		"\33\7\22\2\2\33\34\5\b\5\2\34\35\7\23\2\2\35\'\3\2\2\2\36\'\5\n\6\2\37"+
		"\'\7\4\2\2 \'\7\5\2\2!\'\7\22\2\2\"#\7\b\2\2#$\5\4\3\2$%\7\t\2\2%\'\3"+
		"\2\2\2&\21\3\2\2\2&\26\3\2\2\2&\32\3\2\2\2&\36\3\2\2\2&\37\3\2\2\2& \3"+
		"\2\2\2&!\3\2\2\2&\"\3\2\2\2\'.\3\2\2\2()\f\13\2\2)*\5\6\4\2*+\5\4\3\f"+
		"+-\3\2\2\2,(\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3"+
		"\2\2\2\61\62\t\2\2\2\62\7\3\2\2\2\63\64\t\3\2\2\64\t\3\2\2\2\65\66\7\22"+
		"\2\2\668\7\b\2\2\679\5\f\7\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\t\2\2"+
		";\13\3\2\2\2<A\7\6\2\2=>\7\3\2\2>@\7\6\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2B\r\3\2\2\2CA\3\2\2\2\6&.8A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}