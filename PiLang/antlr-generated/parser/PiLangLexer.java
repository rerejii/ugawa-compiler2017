// Generated from parser/PiLang.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, OROP=14, ANDOP=15, ADDOP=16, MINOP=17, 
		NOTOP=18, MULOP=19, IDENTIFIER=20, VALUE=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "OROP", "ANDOP", "ADDOP", "MINOP", 
		"NOTOP", "MULOP", "IDENTIFIER", "VALUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "'var'", "';'", 
		"'='", "'if'", "'else'", "'while'", "'return'", "'|'", "'&'", "'+'", "'-'", 
		"'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "OROP", "ANDOP", "ADDOP", "MINOP", "NOTOP", "MULOP", "IDENTIFIER", 
		"VALUE", "WS"
	};
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


	public PiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25n\n\25\f\25\16"+
		"\25q\13\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25y\n\25\3\26\3\26\7\26}\n"+
		"\26\f\26\16\26\u0080\13\26\3\26\5\26\u0083\n\26\3\27\3\27\3\27\3\27\2"+
		"\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\t\4\2,,\61\61\4\2aac|\5\2\63"+
		";aac|\3\2\63;\3\2\62;\3\2\62\62\5\2\13\f\17\17\"\"\u008b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\58\3\2\2\2\7"+
		":\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21F\3\2\2\2\23"+
		"H\3\2\2\2\25J\3\2\2\2\27M\3\2\2\2\31R\3\2\2\2\33X\3\2\2\2\35_\3\2\2\2"+
		"\37a\3\2\2\2!c\3\2\2\2#e\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)x\3\2\2\2+\u0082"+
		"\3\2\2\2-\u0084\3\2\2\2/\60\7h\2\2\60\61\7w\2\2\61\62\7p\2\2\62\63\7e"+
		"\2\2\63\64\7v\2\2\64\65\7k\2\2\65\66\7q\2\2\66\67\7p\2\2\67\4\3\2\2\2"+
		"89\7*\2\29\6\3\2\2\2:;\7+\2\2;\b\3\2\2\2<=\7}\2\2=\n\3\2\2\2>?\7\177\2"+
		"\2?\f\3\2\2\2@A\7.\2\2A\16\3\2\2\2BC\7x\2\2CD\7c\2\2DE\7t\2\2E\20\3\2"+
		"\2\2FG\7=\2\2G\22\3\2\2\2HI\7?\2\2I\24\3\2\2\2JK\7k\2\2KL\7h\2\2L\26\3"+
		"\2\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2PQ\7g\2\2Q\30\3\2\2\2RS\7y\2\2ST\7j\2"+
		"\2TU\7k\2\2UV\7n\2\2VW\7g\2\2W\32\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7v\2\2["+
		"\\\7w\2\2\\]\7t\2\2]^\7p\2\2^\34\3\2\2\2_`\7~\2\2`\36\3\2\2\2ab\7(\2\2"+
		"b \3\2\2\2cd\7-\2\2d\"\3\2\2\2ef\7/\2\2f$\3\2\2\2gh\7\u0080\2\2h&\3\2"+
		"\2\2ij\t\2\2\2j(\3\2\2\2ko\t\3\2\2ln\t\4\2\2ml\3\2\2\2nq\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2py\3\2\2\2qo\3\2\2\2rs\7c\2\2st\7p\2\2tu\7u\2\2uv\7y\2\2"+
		"vw\7g\2\2wy\7t\2\2xk\3\2\2\2xr\3\2\2\2y*\3\2\2\2z~\t\5\2\2{}\t\6\2\2|"+
		"{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0083\t\7\2\2\u0082z\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		",\3\2\2\2\u0084\u0085\t\b\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\27\2\2"+
		"\u0087.\3\2\2\2\7\2ox~\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}