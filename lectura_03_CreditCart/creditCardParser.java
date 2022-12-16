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
public class creditCardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATE=1, PIN=2, QUARTER=3, NSPACE=4, ESPACIOS=5;
	public static final int
		RULE_creditCard = 0, RULE_cards = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"creditCard", "cards"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATE", "PIN", "QUARTER", "NSPACE", "ESPACIOS"
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

	public creditCardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreditCardContext extends ParserRuleContext {
		public List<CardsContext> cards() {
			return getRuleContexts(CardsContext.class);
		}
		public CardsContext cards(int i) {
			return getRuleContext(CardsContext.class,i);
		}
		public CreditCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creditCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creditCardListener ) ((creditCardListener)listener).enterCreditCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creditCardListener ) ((creditCardListener)listener).exitCreditCard(this);
		}
	}

	public final CreditCardContext creditCard() throws RecognitionException {
		CreditCardContext _localctx = new CreditCardContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_creditCard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				cards();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUARTER );
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
	public static class CardsContext extends ParserRuleContext {
		public Token q1;
		public Token q2;
		public Token q3;
		public Token q4;
		public List<TerminalNode> QUARTER() { return getTokens(creditCardParser.QUARTER); }
		public TerminalNode QUARTER(int i) {
			return getToken(creditCardParser.QUARTER, i);
		}
		public CardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof creditCardListener ) ((creditCardListener)listener).enterCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof creditCardListener ) ((creditCardListener)listener).exitCards(this);
		}
	}

	public final CardsContext cards() throws RecognitionException {
		CardsContext _localctx = new CardsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			((CardsContext)_localctx).q1 = match(QUARTER);
			setState(10);
			((CardsContext)_localctx).q2 = match(QUARTER);
			setState(11);
			((CardsContext)_localctx).q3 = match(QUARTER);
			setState(12);
			((CardsContext)_localctx).q4 = match(QUARTER);

			        //Create a method for verified credit card
			        CreditCard Tarjeta= new CreditCard();
				boolean NumCard=Tarjeta.validador(((CardsContext)_localctx).q1.getText()+((CardsContext)_localctx).q2.getText()+((CardsContext)_localctx).q3.getText()+((CardsContext)_localctx).q4.getText());
			        System.out.println(NumCard);


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
		"\u0004\u0001\u0005\u0010\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u000e\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0002\t\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002"+
		"\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000\u0006\u0007\u0001\u0000"+
		"\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000"+
		"\u0000\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005\u0003\u0000\u0000\n\u000b"+
		"\u0005\u0003\u0000\u0000\u000b\f\u0005\u0003\u0000\u0000\f\r\u0005\u0003"+
		"\u0000\u0000\r\u000e\u0006\u0001\uffff\uffff\u0000\u000e\u0003\u0001\u0000"+
		"\u0000\u0000\u0001\u0007";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}