// Generated from c:\Users\ruben\Documents\6to semestre\lenguajes_y_automatas_antlr4\gramma01\gramar1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramar1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, MAY=2, MEN=3, IGUAL=4, COMILLA=5, SLASH=6, ESPACIOS=7;
	public static final int
		RULE_programa = 0, RULE_gramar1 = 1, RULE_tags = 2, RULE_open_tag = 3, 
		RULE_data = 4, RULE_close_tag = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "gramar1", "tags", "open_tag", "data", "close_tag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", "'>'", "'='", "'\"'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "MAY", "MEN", "IGUAL", "COMILLA", "SLASH", "ESPACIOS"
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
	public String getGrammarFileName() { return "gramar1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramar1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Gramar1Context gramar1() {
			return getRuleContext(Gramar1Context.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			gramar1();
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

	public static class Gramar1Context extends ParserRuleContext {
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public Gramar1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramar1; }
	}

	public final Gramar1Context gramar1() throws RecognitionException {
		Gramar1Context _localctx = new Gramar1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_gramar1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			tags();
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

	public static class TagsContext extends ParserRuleContext {
		public Open_tagContext open_tag() {
			return getRuleContext(Open_tagContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Close_tagContext close_tag() {
			return getRuleContext(Close_tagContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			open_tag();
			setState(17);
			data();
			setState(18);
			close_tag();
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

	public static class Open_tagContext extends ParserRuleContext {
		public TerminalNode MEN() { return getToken(gramar1Parser.MEN, 0); }
		public List<TerminalNode> TEXT() { return getTokens(gramar1Parser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(gramar1Parser.TEXT, i);
		}
		public TerminalNode MAY() { return getToken(gramar1Parser.MAY, 0); }
		public TerminalNode IGUAL() { return getToken(gramar1Parser.IGUAL, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(gramar1Parser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(gramar1Parser.COMILLA, i);
		}
		public Open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_tag; }
	}

	public final Open_tagContext open_tag() throws RecognitionException {
		Open_tagContext _localctx = new Open_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_open_tag);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(MEN);
				setState(21);
				match(TEXT);
				setState(22);
				match(MAY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(MEN);
				setState(24);
				match(TEXT);
				setState(25);
				match(IGUAL);
				setState(26);
				match(COMILLA);
				setState(27);
				match(TEXT);
				setState(28);
				match(COMILLA);
				setState(29);
				match(MAY);
				}
				break;
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

	public static class DataContext extends ParserRuleContext {
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(gramar1Parser.TEXT, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data);
		try {
			int _alt;
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(32);
						tags();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(35); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(TEXT);
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

	public static class Close_tagContext extends ParserRuleContext {
		public TerminalNode MEN() { return getToken(gramar1Parser.MEN, 0); }
		public TerminalNode SLASH() { return getToken(gramar1Parser.SLASH, 0); }
		public TerminalNode TEXT() { return getToken(gramar1Parser.TEXT, 0); }
		public TerminalNode MAY() { return getToken(gramar1Parser.MAY, 0); }
		public Close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_tag; }
	}

	public final Close_tagContext close_tag() throws RecognitionException {
		Close_tagContext _localctx = new Close_tagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_close_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(MEN);
			setState(41);
			match(SLASH);
			setState(42);
			match(TEXT);
			setState(43);
			match(MAY);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5!\n\5\3\6\6\6$\n\6\r\6\16\6"+
		"%\3\6\5\6)\n\6\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2,\2\16\3"+
		"\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b \3\2\2\2\n(\3\2\2\2\f*\3\2\2\2\16\17"+
		"\5\4\3\2\17\3\3\2\2\2\20\21\5\6\4\2\21\5\3\2\2\2\22\23\5\b\5\2\23\24\5"+
		"\n\6\2\24\25\5\f\7\2\25\7\3\2\2\2\26\27\7\5\2\2\27\30\7\3\2\2\30!\7\4"+
		"\2\2\31\32\7\5\2\2\32\33\7\3\2\2\33\34\7\6\2\2\34\35\7\7\2\2\35\36\7\3"+
		"\2\2\36\37\7\7\2\2\37!\7\4\2\2 \26\3\2\2\2 \31\3\2\2\2!\t\3\2\2\2\"$\5"+
		"\6\4\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\')\7\3\2\2("+
		"#\3\2\2\2(\'\3\2\2\2)\13\3\2\2\2*+\7\5\2\2+,\7\b\2\2,-\7\3\2\2-.\7\4\2"+
		"\2.\r\3\2\2\2\5 %(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}