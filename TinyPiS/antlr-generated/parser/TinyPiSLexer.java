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
		T__9=10, T__10=11, OROP=12, ANDOP=13, ADDOP=14, MINOP=15, NOTOP=16, MULOP=17, 
		IDENTIFIER=18, VALUE=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "OROP", "ANDOP", "ADDOP", "MINOP", "NOTOP", "MULOP", 
		"IDENTIFIER", "VALUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", 
		"'while'", "'print'", "'|'", "'&'", "'+'", "'-'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"OROP", "ANDOP", "ADDOP", "MINOP", "NOTOP", "MULOP", "IDENTIFIER", "VALUE", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23^\n\23\f\23\16\23a\13\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23i\n\23\3\24\3\24\7\24m\n\24\f\24\16\24"+
		"p\13\24\3\24\5\24s\n\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\t\4\2,,\61\61\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3"+
		"\2\62\62\5\2\13\f\17\17\"\"{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3"+
		"\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2"+
		"\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25C\3\2\2\2\27I\3\2\2\2\31O\3\2\2"+
		"\2\33Q\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!W\3\2\2\2#Y\3\2\2\2%h\3\2\2\2\'"+
		"r\3\2\2\2)t\3\2\2\2+,\7x\2\2,-\7c\2\2-.\7t\2\2.\4\3\2\2\2/\60\7=\2\2\60"+
		"\6\3\2\2\2\61\62\7}\2\2\62\b\3\2\2\2\63\64\7\177\2\2\64\n\3\2\2\2\65\66"+
		"\7?\2\2\66\f\3\2\2\2\678\7k\2\289\7h\2\29\16\3\2\2\2:;\7*\2\2;\20\3\2"+
		"\2\2<=\7+\2\2=\22\3\2\2\2>?\7g\2\2?@\7n\2\2@A\7u\2\2AB\7g\2\2B\24\3\2"+
		"\2\2CD\7y\2\2DE\7j\2\2EF\7k\2\2FG\7n\2\2GH\7g\2\2H\26\3\2\2\2IJ\7r\2\2"+
		"JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\30\3\2\2\2OP\7~\2\2P\32\3\2\2\2"+
		"QR\7(\2\2R\34\3\2\2\2ST\7-\2\2T\36\3\2\2\2UV\7/\2\2V \3\2\2\2WX\7\u0080"+
		"\2\2X\"\3\2\2\2YZ\t\2\2\2Z$\3\2\2\2[_\t\3\2\2\\^\t\4\2\2]\\\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`i\3\2\2\2a_\3\2\2\2bc\7c\2\2cd\7p\2\2de\7"+
		"u\2\2ef\7y\2\2fg\7g\2\2gi\7t\2\2h[\3\2\2\2hb\3\2\2\2i&\3\2\2\2jn\t\5\2"+
		"\2km\t\6\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pn\3\2\2"+
		"\2qs\t\7\2\2rj\3\2\2\2rq\3\2\2\2s(\3\2\2\2tu\t\b\2\2uv\3\2\2\2vw\b\25"+
		"\2\2w*\3\2\2\2\7\2_hnr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}