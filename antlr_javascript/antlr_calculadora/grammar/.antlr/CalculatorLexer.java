// Generated from c:\Users\ruben\Desktop\antlr_javascript\antlr_calculadora\grammar\Calculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, CLG=9, 
		NUMBER=10, VARIABLE=11, COMMENTS=12, SPACES=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "PLUS", "MINUS", "TIMES", "DIV", "CLG", 
			"NUMBER", "VARIABLE", "COMMENTS", "SPACES", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "'console.log'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PLUS", "MINUS", "TIMES", "DIV", "CLG", 
			"NUMBER", "VARIABLE", "COMMENTS", "SPACES"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13?\n\13\3\13\6\13B\n\13\r\13\16\13C\3\13"+
		"\3\13\6\13H\n\13\r\13\16\13I\5\13L\n\13\3\f\6\fO\n\f\r\f\16\fP\3\r\3\r"+
		"\7\rU\n\r\f\r\16\rX\13\r\3\r\3\r\3\r\3\r\3\16\6\16_\n\16\r\16\16\16`\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3V\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2\3\2\5\5\2\13\f\17\17\"\"\4\2"+
		"C\\c|\3\2\62;\2l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2"+
		"\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\61"+
		"\3\2\2\2\25>\3\2\2\2\27N\3\2\2\2\31R\3\2\2\2\33^\3\2\2\2\35d\3\2\2\2\37"+
		"f\3\2\2\2!\"\7=\2\2\"\4\3\2\2\2#$\7*\2\2$\6\3\2\2\2%&\7+\2\2&\b\3\2\2"+
		"\2\'(\7?\2\2(\n\3\2\2\2)*\7-\2\2*\f\3\2\2\2+,\7/\2\2,\16\3\2\2\2-.\7,"+
		"\2\2.\20\3\2\2\2/\60\7\61\2\2\60\22\3\2\2\2\61\62\7e\2\2\62\63\7q\2\2"+
		"\63\64\7p\2\2\64\65\7u\2\2\65\66\7q\2\2\66\67\7n\2\2\678\7g\2\289\7\60"+
		"\2\29:\7n\2\2:;\7q\2\2;<\7i\2\2<\24\3\2\2\2=?\7/\2\2>=\3\2\2\2>?\3\2\2"+
		"\2?A\3\2\2\2@B\5\37\20\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DK\3\2"+
		"\2\2EG\7\60\2\2FH\5\37\20\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL"+
		"\3\2\2\2KE\3\2\2\2KL\3\2\2\2L\26\3\2\2\2MO\5\35\17\2NM\3\2\2\2OP\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RV\7$\2\2SU\13\2\2\2TS\3\2\2\2UX\3\2"+
		"\2\2VW\3\2\2\2VT\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7$\2\2Z[\3\2\2\2[\\\b\r"+
		"\2\2\\\32\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab"+
		"\3\2\2\2bc\b\16\2\2c\34\3\2\2\2de\t\3\2\2e\36\3\2\2\2fg\t\4\2\2g \3\2"+
		"\2\2\n\2>CIKPV`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}