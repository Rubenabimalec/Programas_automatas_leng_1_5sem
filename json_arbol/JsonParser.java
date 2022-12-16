// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYINICIO=1, KEYFIN=2, COMILLAONE=3, TWOPOINTS=4, COMA=5, IGUAL=6, SLASH=7, 
		ASTERISCO=8, BARRAINICIO=9, BARRAFIN=10, PARENTINICIO=11, PARENTFIN=12, 
		NUM=13, STRING=14, SPACE=15;
	public static final int
		RULE_json = 0, RULE_file = 1, RULE_text = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "file", "text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'\"'", "':'", "','", "'='", "'/'", "'*'", "'['", 
			"']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYINICIO", "KEYFIN", "COMILLAONE", "TWOPOINTS", "COMA", "IGUAL", 
			"SLASH", "ASTERISCO", "BARRAINICIO", "BARRAFIN", "PARENTINICIO", "PARENTFIN", 
			"NUM", "STRING", "SPACE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			file();
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
	public static class FileContext extends ParserRuleContext {
		public TerminalNode KEYINICIO() { return getToken(JsonParser.KEYINICIO, 0); }
		public TerminalNode KEYFIN() { return getToken(JsonParser.KEYFIN, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode BARRAINICIO() { return getToken(JsonParser.BARRAINICIO, 0); }
		public TerminalNode BARRAFIN() { return getToken(JsonParser.BARRAFIN, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYINICIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(KEYINICIO);
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16898L) != 0) {
					{
					setState(9);
					text(0);
					}
				}

				setState(12);
				match(KEYFIN);
				}
				break;
			case BARRAINICIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(BARRAINICIO);
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16898L) != 0) {
					{
					setState(14);
					text(0);
					}
				}

				setState(17);
				match(BARRAFIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(JsonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JsonParser.STRING, i);
		}
		public TerminalNode TWOPOINTS() { return getToken(JsonParser.TWOPOINTS, 0); }
		public TerminalNode NUM() { return getToken(JsonParser.NUM, 0); }
		public TerminalNode KEYINICIO() { return getToken(JsonParser.KEYINICIO, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TerminalNode KEYFIN() { return getToken(JsonParser.KEYFIN, 0); }
		public TerminalNode BARRAINICIO() { return getToken(JsonParser.BARRAINICIO, 0); }
		public TerminalNode BARRAFIN() { return getToken(JsonParser.BARRAFIN, 0); }
		public List<TerminalNode> COMA() { return getTokens(JsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(JsonParser.COMA, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		return text(0);
	}

	private TextContext text(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TextContext _localctx = new TextContext(_ctx, _parentState);
		TextContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_text, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(21);
				match(STRING);
				setState(22);
				match(TWOPOINTS);
				setState(23);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(24);
				match(STRING);
				setState(25);
				match(TWOPOINTS);
				setState(26);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(27);
				match(STRING);
				setState(28);
				match(TWOPOINTS);
				setState(29);
				match(KEYINICIO);
				setState(30);
				text(0);
				setState(31);
				match(KEYFIN);
				}
				break;
			case 4:
				{
				setState(33);
				match(STRING);
				setState(34);
				match(TWOPOINTS);
				setState(35);
				match(BARRAINICIO);
				setState(36);
				text(0);
				setState(37);
				match(BARRAFIN);
				}
				break;
			case 5:
				{
				setState(39);
				match(KEYINICIO);
				setState(40);
				match(STRING);
				setState(41);
				match(TWOPOINTS);
				setState(42);
				text(0);
				setState(43);
				match(KEYFIN);
				}
				break;
			case 6:
				{
				setState(45);
				match(BARRAINICIO);
				setState(46);
				match(STRING);
				setState(47);
				match(TWOPOINTS);
				setState(48);
				text(0);
				setState(49);
				match(BARRAFIN);
				}
				break;
			case 7:
				{
				setState(51);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_text);
					setState(54);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(55);
							match(COMA);
							setState(56);
							text(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(59); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return text_sempred((TextContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean text_sempred(TextContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fC\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u000b\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		":\b\u0002\u000b\u0002\f\u0002;\u0005\u0002>\b\u0002\n\u0002\f\u0002A\t"+
		"\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002\u0004\u0000\u0000"+
		"J\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000"+
		"\u00044\u0001\u0000\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007"+
		"\u0001\u0001\u0000\u0000\u0000\b\n\u0005\u0001\u0000\u0000\t\u000b\u0003"+
		"\u0004\u0002\u0000\n\t\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0013\u0005\u0002\u0000\u0000"+
		"\r\u000f\u0005\t\u0000\u0000\u000e\u0010\u0003\u0004\u0002\u0000\u000f"+
		"\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0005\n\u0000\u0000\u0012\b"+
		"\u0001\u0000\u0000\u0000\u0012\r\u0001\u0000\u0000\u0000\u0013\u0003\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0006\u0002\uffff\uffff\u0000\u0015\u0016"+
		"\u0005\u000e\u0000\u0000\u0016\u0017\u0005\u0004\u0000\u0000\u00175\u0005"+
		"\u000e\u0000\u0000\u0018\u0019\u0005\u000e\u0000\u0000\u0019\u001a\u0005"+
		"\u0004\u0000\u0000\u001a5\u0005\r\u0000\u0000\u001b\u001c\u0005\u000e"+
		"\u0000\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d\u001e\u0005\u0001"+
		"\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0002\u0000"+
		"\u0000 5\u0001\u0000\u0000\u0000!\"\u0005\u000e\u0000\u0000\"#\u0005\u0004"+
		"\u0000\u0000#$\u0005\t\u0000\u0000$%\u0003\u0004\u0002\u0000%&\u0005\n"+
		"\u0000\u0000&5\u0001\u0000\u0000\u0000\'(\u0005\u0001\u0000\u0000()\u0005"+
		"\u000e\u0000\u0000)*\u0005\u0004\u0000\u0000*+\u0003\u0004\u0002\u0000"+
		"+,\u0005\u0002\u0000\u0000,5\u0001\u0000\u0000\u0000-.\u0005\t\u0000\u0000"+
		"./\u0005\u000e\u0000\u0000/0\u0005\u0004\u0000\u000001\u0003\u0004\u0002"+
		"\u000012\u0005\n\u0000\u000025\u0001\u0000\u0000\u000035\u0005\u000e\u0000"+
		"\u00004\u0014\u0001\u0000\u0000\u00004\u0018\u0001\u0000\u0000\u00004"+
		"\u001b\u0001\u0000\u0000\u00004!\u0001\u0000\u0000\u00004\'\u0001\u0000"+
		"\u0000\u00004-\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005?\u0001"+
		"\u0000\u0000\u000069\n\u0002\u0000\u000078\u0005\u0005\u0000\u00008:\u0003"+
		"\u0004\u0002\u000097\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=6\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000\u0006\n\u000f\u00124;?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}