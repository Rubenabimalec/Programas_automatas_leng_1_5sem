// Generated from c:\Users\ruben\Documents\6to semestre\lenguajes_y_automatas_antlr4\lectura_03_CreditCart\creditCard.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class creditCardLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATE=1, PIN=2, QUARTER=3, SPACEWITH=4, ESPACIOS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DATE", "PIN", "QUARTER", "SPACEWITH", "ESPACIOS"
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
			null, "DATE", "PIN", "QUARTER", "SPACEWITH", "ESPACIOS"
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


	public creditCardLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "creditCard.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3"+
		"\5\3%\n\3\3\3\5\3(\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\62\n\4\r\4"+
		"\16\4\63\3\5\3\5\3\5\3\5\3\6\6\6;\n\6\r\6\16\6<\3\6\3\6\2\2\7\3\3\5\4"+
		"\7\5\t\6\13\7\3\2\b\4\2\62\62;;\3\2\61\61\3\2\62;\4\2\13\13\"\"\3\2\""+
		"\"\5\2\13\f\17\17\"\"\2F\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\3\16\3\2\2\2\5\32\3\2\2\2\7\61\3\2\2\2\t\65\3\2\2\2\13"+
		":\3\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21"+
		"\3\2\2\2\21\22\3\2\2\2\22\24\t\3\2\2\23\25\t\4\2\2\24\23\3\2\2\2\25\26"+
		"\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4"+
		"\3\2\2\2\32\33\7R\2\2\33\34\7K\2\2\34\35\7P\2\2\35\37\3\2\2\2\36 \t\5"+
		"\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\7=\2"+
		"\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&(\7<\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2"+
		"\2\2)*\t\4\2\2*+\t\4\2\2+,\t\4\2\2,-\t\4\2\2-.\3\2\2\2./\b\3\2\2/\6\3"+
		"\2\2\2\60\62\t\4\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\b\3\2\2\2\65\66\n\6\2\2\66\67\3\2\2\2\678\b\5\2\28\n\3\2\2\2"+
		"9;\t\7\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\6\2\2"+
		"?\f\3\2\2\2\n\2\20\26!$\'\63<\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}