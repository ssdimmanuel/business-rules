// Generated from C:/Dev Work/business-rule-parser/BusinessRule.g4 by ANTLR 4.13.2

package com.expr.brule.core;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BusinessRuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, STRING=4, RULEDELIM=5, QUOTE=6, LEFTPAREN=7, 
		RIGHTPAREN=8, EQUAL=9, LT=10, GT=11, LTE=12, GTE=13, NE=14, AND=15, OR=16, 
		VARIABLE=17, NUMBER=18, SPACE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TRUE", "FALSE", "STRING", "RULEDELIM", "QUOTE", "LEFTPAREN", 
			"RIGHTPAREN", "EQUAL", "LT", "GT", "LTE", "GTE", "NE", "AND", "OR", "VARIABLE", 
			"NUMBER", "SPACE"
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


	public BusinessRuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BusinessRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003B\b\u0003\n\u0003"+
		"\f\u0003E\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bT\b\b\u0001\t\u0001\t\u0001\t\u0003\tY\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n^\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bd\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fj\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rp\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"y\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0080\b\u000f\u0001\u0010\u0004\u0010\u0083\b\u0010\u000b"+
		"\u0010\f\u0010\u0084\u0001\u0010\u0005\u0010\u0088\b\u0010\n\u0010\f\u0010"+
		"\u008b\t\u0010\u0001\u0011\u0004\u0011\u008e\b\u0011\u000b\u0011\f\u0011"+
		"\u008f\u0001\u0011\u0001\u0011\u0004\u0011\u0094\b\u0011\u000b\u0011\f"+
		"\u0011\u0095\u0003\u0011\u0098\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\u0001\u0000\u0005\u0003\u0000\t\n\r\r\"\"\u0002\u0000AZaz\u0005\u0000"+
		"-.09AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u00ae\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'"+
		"\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005=\u0001\u0000"+
		"\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000"+
		"\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001"+
		"\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000"+
		"\u0000\u0015]\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019"+
		"i\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001dx\u0001"+
		"\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0082\u0001\u0000"+
		"\u0000\u0000#\u008d\u0001\u0000\u0000\u0000%\u0099\u0001\u0000\u0000\u0000"+
		"\'(\u0005,\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005t\u0000\u0000"+
		"*+\u0005r\u0000\u0000+,\u0005u\u0000\u0000,2\u0005e\u0000\u0000-.\u0005"+
		"T\u0000\u0000./\u0005R\u0000\u0000/0\u0005U\u0000\u000002\u0005E\u0000"+
		"\u00001)\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00002\u0004\u0001"+
		"\u0000\u0000\u000034\u0005f\u0000\u000045\u0005a\u0000\u000056\u0005l"+
		"\u0000\u000067\u0005s\u0000\u00007>\u0005e\u0000\u000089\u0005F\u0000"+
		"\u00009:\u0005A\u0000\u0000:;\u0005L\u0000\u0000;<\u0005S\u0000\u0000"+
		"<>\u0005E\u0000\u0000=3\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000"+
		">\u0006\u0001\u0000\u0000\u0000?C\u0003\u000b\u0005\u0000@B\b\u0000\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FG\u0003\u000b\u0005\u0000G\b\u0001\u0000\u0000\u0000"+
		"HI\u0005;\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005\"\u0000\u0000"+
		"K\f\u0001\u0000\u0000\u0000LM\u0005(\u0000\u0000M\u000e\u0001\u0000\u0000"+
		"\u0000NO\u0005)\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PT\u0005=\u0000"+
		"\u0000QR\u0005E\u0000\u0000RT\u0005Q\u0000\u0000SP\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000T\u0012\u0001\u0000\u0000\u0000UY\u0005<\u0000"+
		"\u0000VW\u0005L\u0000\u0000WY\u0005T\u0000\u0000XU\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z^\u0005>\u0000"+
		"\u0000[\\\u0005G\u0000\u0000\\^\u0005T\u0000\u0000]Z\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0005"+
		"<\u0000\u0000`d\u0005=\u0000\u0000ab\u0005L\u0000\u0000bd\u0005E\u0000"+
		"\u0000c_\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000d\u0018\u0001"+
		"\u0000\u0000\u0000ef\u0005>\u0000\u0000fj\u0005=\u0000\u0000gh\u0005G"+
		"\u0000\u0000hj\u0005E\u0000\u0000ie\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000j\u001a\u0001\u0000\u0000\u0000kl\u0005!\u0000\u0000lp\u0005"+
		"=\u0000\u0000mn\u0005N\u0000\u0000np\u0005E\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000p\u001c\u0001\u0000\u0000\u0000"+
		"qr\u0005A\u0000\u0000rs\u0005N\u0000\u0000sy\u0005D\u0000\u0000ty\u0005"+
		"&\u0000\u0000uv\u0005a\u0000\u0000vw\u0005n\u0000\u0000wy\u0005d\u0000"+
		"\u0000xq\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000xu\u0001\u0000"+
		"\u0000\u0000y\u001e\u0001\u0000\u0000\u0000z{\u0005O\u0000\u0000{\u0080"+
		"\u0005R\u0000\u0000|}\u0005o\u0000\u0000}\u0080\u0005r\u0000\u0000~\u0080"+
		"\u0005|\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f|\u0001\u0000"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080 \u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0007\u0001\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0007\u0002\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\"\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0003\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0097\u0001\u0000\u0000\u0000\u0091\u0093\u0005.\u0000\u0000\u0092\u0094"+
		"\u0007\u0003\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0091"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098$\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0007\u0004\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0006\u0012\u0000\u0000\u009c&\u0001\u0000"+
		"\u0000\u0000\u0011\u00001=CSX]ciox\u007f\u0084\u0089\u008f\u0095\u0097"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}