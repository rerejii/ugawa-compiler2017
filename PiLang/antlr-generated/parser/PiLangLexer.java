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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OROP=15, ANDOP=16, ADDOP=17, 
		MINOP=18, NOTOP=19, MULOP=20, IDENTIFIER=21, VALUE=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "OROP", "ANDOP", "ADDOP", 
		"MINOP", "NOTOP", "MULOP", "IDENTIFIER", "VALUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "'var'", "';'", 
		"'='", "'if'", "'else'", "'while'", "'return'", "'print'", "'|'", "'&'", 
		"'+'", "'-'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "OROP", "ANDOP", "ADDOP", "MINOP", "NOTOP", "MULOP", 
		"IDENTIFIER", "VALUE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\7\26v\n\26\f\26\16\26y\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0081\n\26\3\27\3\27\7\27\u0085\n\27\f\27\16\27\u0088"+
		"\13\27\3\27\5\27\u008b\n\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\3\2\t\4\2,,\61\61\4\2aac|\5\2\63;aac|\3\2\63;\3"+
		"\2\62;\3\2\62\62\5\2\13\f\17\17\"\"\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5:\3\2\2\2\7"+
		"<\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23"+
		"J\3\2\2\2\25L\3\2\2\2\27O\3\2\2\2\31T\3\2\2\2\33Z\3\2\2\2\35a\3\2\2\2"+
		"\37g\3\2\2\2!i\3\2\2\2#k\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)q\3\2\2\2+\u0080"+
		"\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\62\7h\2\2\62\63\7w\2\2\63\64"+
		"\7p\2\2\64\65\7e\2\2\65\66\7v\2\2\66\67\7k\2\2\678\7q\2\289\7p\2\29\4"+
		"\3\2\2\2:;\7*\2\2;\6\3\2\2\2<=\7+\2\2=\b\3\2\2\2>?\7}\2\2?\n\3\2\2\2@"+
		"A\7\177\2\2A\f\3\2\2\2BC\7.\2\2C\16\3\2\2\2DE\7x\2\2EF\7c\2\2FG\7t\2\2"+
		"G\20\3\2\2\2HI\7=\2\2I\22\3\2\2\2JK\7?\2\2K\24\3\2\2\2LM\7k\2\2MN\7h\2"+
		"\2N\26\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2S\30\3\2\2\2TU\7y\2"+
		"\2UV\7j\2\2VW\7k\2\2WX\7n\2\2XY\7g\2\2Y\32\3\2\2\2Z[\7t\2\2[\\\7g\2\2"+
		"\\]\7v\2\2]^\7w\2\2^_\7t\2\2_`\7p\2\2`\34\3\2\2\2ab\7r\2\2bc\7t\2\2cd"+
		"\7k\2\2de\7p\2\2ef\7v\2\2f\36\3\2\2\2gh\7~\2\2h \3\2\2\2ij\7(\2\2j\"\3"+
		"\2\2\2kl\7-\2\2l$\3\2\2\2mn\7/\2\2n&\3\2\2\2op\7\u0080\2\2p(\3\2\2\2q"+
		"r\t\2\2\2r*\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x\u0081\3\2\2\2yw\3\2\2\2z{\7c\2\2{|\7p\2\2|}\7u\2\2}~\7y\2"+
		"\2~\177\7g\2\2\177\u0081\7t\2\2\u0080s\3\2\2\2\u0080z\3\2\2\2\u0081,\3"+
		"\2\2\2\u0082\u0086\t\5\2\2\u0083\u0085\t\6\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008b\t\7\2\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b.\3\2\2\2\u008c\u008d\t\b\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008f\b\30\2\2\u008f\60\3\2\2\2\7\2w\u0080\u0086\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}