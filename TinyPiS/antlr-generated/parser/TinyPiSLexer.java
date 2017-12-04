// Generated from parser/TinyPiS.g4 by ANTLR 4.6
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
public class TinyPiSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OROP=11, ANDOP=12, ADDOP=13, MINOP=14, NOTOP=15, MULOP=16, IDENTIFIER=17, 
		VALUE=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "OROP", "ANDOP", "ADDOP", "MINOP", "NOTOP", "MULOP", "IDENTIFIER", 
		"VALUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", 
		"'while'", "'|'", "'&'", "'+'", "'-'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "OROP", 
		"ANDOP", "ADDOP", "MINOP", "NOTOP", "MULOP", "IDENTIFIER", "VALUE", "WS"
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


	public TinyPiSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyPiS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\7\22V\n\22\f\22\16\22Y\13\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22a\n\22"+
		"\3\23\3\23\7\23e\n\23\f\23\16\23h\13\23\3\23\5\23k\n\23\3\24\3\24\3\24"+
		"\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\t\4\2,,\61\61\4\2aac|\5\2\63;"+
		"aac|\3\2\63;\3\2\62;\3\2\62\62\5\2\13\f\17\17\"\"s\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65"+
		"\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25A\3\2\2\2\27G\3\2\2\2\31"+
		"I\3\2\2\2\33K\3\2\2\2\35M\3\2\2\2\37O\3\2\2\2!Q\3\2\2\2#`\3\2\2\2%j\3"+
		"\2\2\2\'l\3\2\2\2)*\7x\2\2*+\7c\2\2+,\7t\2\2,\4\3\2\2\2-.\7=\2\2.\6\3"+
		"\2\2\2/\60\7}\2\2\60\b\3\2\2\2\61\62\7\177\2\2\62\n\3\2\2\2\63\64\7?\2"+
		"\2\64\f\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67\16\3\2\2\289\7*\2\29\20\3"+
		"\2\2\2:;\7+\2\2;\22\3\2\2\2<=\7g\2\2=>\7n\2\2>?\7u\2\2?@\7g\2\2@\24\3"+
		"\2\2\2AB\7y\2\2BC\7j\2\2CD\7k\2\2DE\7n\2\2EF\7g\2\2F\26\3\2\2\2GH\7~\2"+
		"\2H\30\3\2\2\2IJ\7(\2\2J\32\3\2\2\2KL\7-\2\2L\34\3\2\2\2MN\7/\2\2N\36"+
		"\3\2\2\2OP\7\u0080\2\2P \3\2\2\2QR\t\2\2\2R\"\3\2\2\2SW\t\3\2\2TV\t\4"+
		"\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xa\3\2\2\2YW\3\2\2\2Z[\7c"+
		"\2\2[\\\7p\2\2\\]\7u\2\2]^\7y\2\2^_\7g\2\2_a\7t\2\2`S\3\2\2\2`Z\3\2\2"+
		"\2a$\3\2\2\2bf\t\5\2\2ce\t\6\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gk\3\2\2\2hf\3\2\2\2ik\t\7\2\2jb\3\2\2\2ji\3\2\2\2k&\3\2\2\2lm\t\b\2"+
		"\2mn\3\2\2\2no\b\24\2\2o(\3\2\2\2\7\2W`fj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}