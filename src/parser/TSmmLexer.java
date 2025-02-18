// Generated from C:/Users/pelay/Documents/EII/3º Software/DLP/DLP/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WS=2, INT_LITERAL=3, CHAR_LITERAL=4, NUMBER_LITERAL=5, ID=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "WS", "DIGIT", "INT_LITERAL", "CHAR_LITERAL", "MANTISSA", 
			"NUMBER_LITERAL", "ID"
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
			null, "COMMENT", "WS", "INT_LITERAL", "CHAR_LITERAL", "NUMBER_LITERAL", 
			"ID"
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


	public TSmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

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
		"\u0004\u0000\u0006x\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0016\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000&\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001+\b\u0001\u000b\u0001\f\u0001,\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00036\b\u0003\n\u0003\f\u00039\t\u0003\u0003\u0003;\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004"+
		"J\t\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0005\u0005"+
		"\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006l\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007t\b\u0007\n\u0007\f\u0007w\t\u0007"+
		"\u0001 \u0000\b\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0003\t\u0004"+
		"\u000b\u0000\r\u0005\u000f\u0006\u0001\u0000\u0007\u0002\u0000\n\n\r\r"+
		"\u0003\u0000\t\n\r\r  \u0001\u000009\u0001\u000019\u0002\u0000nntt\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0086\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003*\u0001"+
		"\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000"+
		"\u0000\tL\u0001\u0000\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\ro\u0001"+
		"\u0000\u0000\u0000\u000fq\u0001\u0000\u0000\u0000\u0011\u0012\u0005/\u0000"+
		"\u0000\u0012\u0013\u0005/\u0000\u0000\u0013\u0017\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\b\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018&\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005/\u0000\u0000\u001b\u001c\u0005"+
		"*\u0000\u0000\u001c \u0001\u0000\u0000\u0000\u001d\u001f\t\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!#\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005*\u0000\u0000$&\u0005/"+
		"\u0000\u0000%\u0011\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0006\u0000\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)+\u0007\u0001\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0006\u0001\u0000\u0000/\u0004\u0001\u0000"+
		"\u0000\u000001\u0007\u0002\u0000\u00001\u0006\u0001\u0000\u0000\u0000"+
		"2;\u00050\u0000\u000037\u0007\u0003\u0000\u000046\u0003\u0005\u0002\u0000"+
		"54\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:2\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000;\b\u0001"+
		"\u0000\u0000\u0000<=\u0005\'\u0000\u0000=>\t\u0000\u0000\u0000>M\u0005"+
		"\'\u0000\u0000?@\u0005\'\u0000\u0000@A\u0005\\\u0000\u0000AB\u0007\u0004"+
		"\u0000\u0000BM\u0005\'\u0000\u0000CD\u0005\'\u0000\u0000DH\u0005\\\u0000"+
		"\u0000EG\u0003\u0005\u0002\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0005\'\u0000\u0000L<\u0001"+
		"\u0000\u0000\u0000L?\u0001\u0000\u0000\u0000LC\u0001\u0000\u0000\u0000"+
		"M\n\u0001\u0000\u0000\u0000NO\u0003\u0007\u0003\u0000OS\u0005.\u0000\u0000"+
		"PR\u0003\u0007\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T`\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0003\u0007\u0003\u0000WV\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\]\u0005.\u0000\u0000]`\u0003\u0007\u0003\u0000^`\u0003\u0007\u0003"+
		"\u0000_N\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`\f\u0001\u0000\u0000\u0000ap\u0003\u000b\u0005\u0000bc\u0003"+
		"\u000b\u0005\u0000cd\u0005E\u0000\u0000de\u0005-\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0003\u0007\u0003\u0000gp\u0001\u0000\u0000\u0000hi\u0003"+
		"\u000b\u0005\u0000ik\u0005e\u0000\u0000jl\u0005+\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0003"+
		"\u0007\u0003\u0000np\u0001\u0000\u0000\u0000oa\u0001\u0000\u0000\u0000"+
		"ob\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000p\u000e\u0001\u0000"+
		"\u0000\u0000qu\u0007\u0005\u0000\u0000rt\u0007\u0006\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u0010\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000\u000f\u0000\u0017 %,7:HLSY_kou\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}