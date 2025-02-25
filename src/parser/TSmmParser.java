// Generated from C:/Users/pelay/Documents/EII/3º Software/DLP/DLP/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, BUILT_IN_TYPE=36, COMMENT=37, 
		WS=38, INT_LITERAL=39, CHAR_LITERAL=40, NUMBER_LITERAL=41, ID=42;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_variable_definition = 2, RULE_function_definition = 3, 
		RULE_function_invocation = 4, RULE_statement = 5, RULE_block = 6, RULE_expression = 7, 
		RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "variable_definition", "function_definition", 
			"function_invocation", "statement", "block", "expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "','", "':'", "';'", "'function'", "'('", "')'", "'void'", 
			"'{'", "'}'", "'log'", "'input'", "'='", "'while'", "'if'", "'else'", 
			"'return'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BUILT_IN_TYPE", "COMMENT", "WS", "INT_LITERAL", "CHAR_LITERAL", "NUMBER_LITERAL", 
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

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TSmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				definition();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__4 );
			setState(23);
			match(EOF);
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
	public static class DefinitionContext extends ParserRuleContext {
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			int _alt;
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(25);
						variable_definition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(28); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(30);
						function_definition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(33); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Variable_definitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(39);
				match(T__1);
				setState(40);
				match(ID);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__2);
			setState(47);
			type();
			setState(48);
			match(T__3);
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
	public static class Function_definitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<TerminalNode> BUILT_IN_TYPE() { return getTokens(TSmmParser.BUILT_IN_TYPE); }
		public TerminalNode BUILT_IN_TYPE(int i) {
			return getToken(TSmmParser.BUILT_IN_TYPE, i);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			match(ID);
			setState(52);
			match(T__5);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__2);
				setState(55);
				match(BUILT_IN_TYPE);
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(58);
				match(T__1);
				setState(59);
				match(ID);
				setState(60);
				match(T__2);
				setState(61);
				match(BUILT_IN_TYPE);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__6);
			setState(68);
			match(T__2);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==BUILT_IN_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(T__8);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(71);
				variable_definition();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246349977664L) != 0)) {
				{
				{
				setState(77);
				statement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__9);
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
	public static class Function_invocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(86);
			match(T__5);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246349791296L) != 0)) {
				{
				{
				setState(87);
				expression(0);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(93);
				match(T__1);
				setState(94);
				expression(0);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__6);
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
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__10);
				setState(103);
				expression(0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(104);
					match(T__1);
					setState(105);
					expression(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__11);
				setState(114);
				expression(0);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(115);
					match(T__1);
					setState(116);
					expression(0);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				expression(0);
				setState(125);
				match(T__12);
				setState(126);
				expression(0);
				setState(127);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__13);
				setState(130);
				match(T__5);
				setState(131);
				expression(0);
				setState(132);
				match(T__6);
				setState(133);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(T__14);
				setState(136);
				match(T__5);
				setState(137);
				expression(0);
				setState(138);
				match(T__6);
				setState(139);
				block();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(140);
					match(T__15);
					setState(141);
					block();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(T__16);
				setState(145);
				expression(0);
				setState(146);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				function_invocation();
				setState(149);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__16:
			case T__21:
			case T__22:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case NUMBER_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				statement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__8);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246349977664L) != 0)) {
					{
					{
					setState(155);
					statement();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__9);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(TSmmParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(TSmmParser.CHAR_LITERAL, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(TSmmParser.NUMBER_LITERAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(165);
				match(T__5);
				setState(166);
				expression(0);
				setState(167);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(169);
				match(T__5);
				setState(170);
				expression(0);
				setState(171);
				match(T__20);
				setState(172);
				type();
				setState(173);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(175);
				match(T__21);
				setState(176);
				expression(11);
				}
				break;
			case 4:
				{
				setState(177);
				match(T__22);
				setState(178);
				expression(10);
				}
				break;
			case 5:
				{
				setState(179);
				function_invocation();
				}
				break;
			case 6:
				{
				setState(180);
				match(ID);
				}
				break;
			case 7:
				{
				setState(181);
				match(INT_LITERAL);
				}
				break;
			case 8:
				{
				setState(182);
				match(CHAR_LITERAL);
				}
				break;
			case 9:
				{
				setState(183);
				match(NUMBER_LITERAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(199);
						match(T__17);
						setState(200);
						expression(0);
						setState(201);
						match(T__18);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(204);
						match(T__19);
						setState(205);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BUILT_IN_TYPE() { return getToken(TSmmParser.BUILT_IN_TYPE, 0); }
		public TerminalNode INT_LITERAL() { return getToken(TSmmParser.INT_LITERAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(BUILT_IN_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__17);
				setState(213);
				match(INT_LITERAL);
				setState(214);
				match(T__18);
				setState(215);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__17);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(217);
					variable_definition();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__18);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b\u0001"+
		"\f\u0001\u001c\u0001\u0001\u0004\u0001 \b\u0001\u000b\u0001\f\u0001!\u0003"+
		"\u0001$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003I\b"+
		"\u0003\n\u0003\f\u0003L\t\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003"+
		"\f\u0003R\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005k\b"+
		"\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008f\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0098\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009d"+
		"\b\u0006\n\u0006\f\u0006\u00a0\t\u0006\u0001\u0006\u0003\u0006\u00a3\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b9\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00cf\b\u0007\n\u0007\f\u0007\u00d2\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00db\b\b\n\b"+
		"\f\b\u00de\t\b\u0001\b\u0003\b\u00e1\b\b\u0001\b\u0000\u0001\u000e\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0005\u0002\u0000\b\b$$\u0001"+
		"\u0000\u0018\u001a\u0002\u0000\u0016\u0016\u001b\u001b\u0001\u0000\u001c"+
		"!\u0001\u0000\"#\u0100\u0000\u0013\u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000"+
		"\u0000\bU\u0001\u0000\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000\f\u00a2"+
		"\u0001\u0000\u0000\u0000\u000e\u00b8\u0001\u0000\u0000\u0000\u0010\u00e0"+
		"\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001"+
		"\u0001\u0000\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d$\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#\u001a\u0001\u0000"+
		"\u0000\u0000#\u001f\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0001\u0000\u0000&+\u0005*\u0000\u0000\'(\u0005\u0002\u0000\u0000"+
		"(*\u0005*\u0000\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0003\u0000\u0000/0\u0003\u0010"+
		"\b\u000001\u0005\u0004\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005"+
		"\u0005\u0000\u000034\u0005*\u0000\u000048\u0005\u0006\u0000\u000056\u0005"+
		"*\u0000\u000067\u0005\u0003\u0000\u000079\u0005$\u0000\u000085\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009@\u0001\u0000\u0000\u0000:;\u0005"+
		"\u0002\u0000\u0000;<\u0005*\u0000\u0000<=\u0005\u0003\u0000\u0000=?\u0005"+
		"$\u0000\u0000>:\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0005\u0003\u0000"+
		"\u0000EF\u0007\u0000\u0000\u0000FJ\u0005\t\u0000\u0000GI\u0003\u0004\u0002"+
		"\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KP\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MO\u0003\n\u0005\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\n\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000UV\u0005*\u0000\u0000VZ\u0005\u0006\u0000"+
		"\u0000WY\u0003\u000e\u0007\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[a\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0002\u0000\u0000"+
		"^`\u0003\u000e\u0007\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0007\u0000\u0000e\t\u0001"+
		"\u0000\u0000\u0000fg\u0005\u000b\u0000\u0000gl\u0003\u000e\u0007\u0000"+
		"hi\u0005\u0002\u0000\u0000ik\u0003\u000e\u0007\u0000jh\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005"+
		"\u0004\u0000\u0000p\u0098\u0001\u0000\u0000\u0000qr\u0005\f\u0000\u0000"+
		"rw\u0003\u000e\u0007\u0000st\u0005\u0002\u0000\u0000tv\u0003\u000e\u0007"+
		"\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0004\u0000\u0000{\u0098\u0001\u0000\u0000"+
		"\u0000|}\u0003\u000e\u0007\u0000}~\u0005\r\u0000\u0000~\u007f\u0003\u000e"+
		"\u0007\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0098\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082\u0083\u0005\u0006"+
		"\u0000\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\u0085\u0005\u0007"+
		"\u0000\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0098\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u000f\u0000\u0000\u0088\u0089\u0005\u0006\u0000"+
		"\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u008b\u0005\u0007\u0000"+
		"\u0000\u008b\u008e\u0003\f\u0006\u0000\u008c\u008d\u0005\u0010\u0000\u0000"+
		"\u008d\u008f\u0003\f\u0006\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0098\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u0011\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092"+
		"\u0093\u0005\u0004\u0000\u0000\u0093\u0098\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0003\b\u0004\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097f\u0001\u0000\u0000\u0000\u0097q\u0001\u0000"+
		"\u0000\u0000\u0097|\u0001\u0000\u0000\u0000\u0097\u0081\u0001\u0000\u0000"+
		"\u0000\u0097\u0087\u0001\u0000\u0000\u0000\u0097\u0090\u0001\u0000\u0000"+
		"\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u000b\u0001\u0000\u0000"+
		"\u0000\u0099\u00a3\u0003\n\u0005\u0000\u009a\u009e\u0005\t\u0000\u0000"+
		"\u009b\u009d\u0003\n\u0005\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005\n\u0000\u0000\u00a2\u0099"+
		"\u0001\u0000\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a3\r\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0006\u0007\uffff\uffff\u0000\u00a5\u00a6"+
		"\u0005\u0006\u0000\u0000\u00a6\u00a7\u0003\u000e\u0007\u0000\u00a7\u00a8"+
		"\u0005\u0007\u0000\u0000\u00a8\u00b9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0006\u0000\u0000\u00aa\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ac"+
		"\u0005\u0015\u0000\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00ae\u0005"+
		"\u0007\u0000\u0000\u00ae\u00b9\u0001\u0000\u0000\u0000\u00af\u00b0\u0005"+
		"\u0016\u0000\u0000\u00b0\u00b9\u0003\u000e\u0007\u000b\u00b1\u00b2\u0005"+
		"\u0017\u0000\u0000\u00b2\u00b9\u0003\u000e\u0007\n\u00b3\u00b9\u0003\b"+
		"\u0004\u0000\u00b4\u00b9\u0005*\u0000\u0000\u00b5\u00b9\u0005\'\u0000"+
		"\u0000\u00b6\u00b9\u0005(\u0000\u0000\u00b7\u00b9\u0005)\u0000\u0000\u00b8"+
		"\u00a4\u0001\u0000\u0000\u0000\u00b8\u00a9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00af\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00d0\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\n\t\u0000\u0000\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc\u00cf"+
		"\u0003\u000e\u0007\n\u00bd\u00be\n\b\u0000\u0000\u00be\u00bf\u0007\u0002"+
		"\u0000\u0000\u00bf\u00cf\u0003\u000e\u0007\t\u00c0\u00c1\n\u0007\u0000"+
		"\u0000\u00c1\u00c2\u0007\u0003\u0000\u0000\u00c2\u00cf\u0003\u000e\u0007"+
		"\b\u00c3\u00c4\n\u0006\u0000\u0000\u00c4\u00c5\u0007\u0004\u0000\u0000"+
		"\u00c5\u00cf\u0003\u000e\u0007\u0007\u00c6\u00c7\n\u000e\u0000\u0000\u00c7"+
		"\u00c8\u0005\u0012\u0000\u0000\u00c8\u00c9\u0003\u000e\u0007\u0000\u00c9"+
		"\u00ca\u0005\u0013\u0000\u0000\u00ca\u00cf\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\n\r\u0000\u0000\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd\u00cf"+
		"\u0005*\u0000\u0000\u00ce\u00ba\u0001\u0000\u0000\u0000\u00ce\u00bd\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c0\u0001\u0000\u0000\u0000\u00ce\u00c3\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u000f\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00e1\u0005"+
		"$\u0000\u0000\u00d4\u00d5\u0005\u0012\u0000\u0000\u00d5\u00d6\u0005\'"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0013\u0000\u0000\u00d7\u00e1\u0003\u0010"+
		"\b\u0000\u00d8\u00dc\u0005\u0012\u0000\u0000\u00d9\u00db\u0003\u0004\u0002"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0005\u0013\u0000\u0000\u00e0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00e0\u00d4\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e1\u0011\u0001\u0000\u0000\u0000\u0016\u0015\u001c!#+8@JPZa"+
		"lw\u008e\u0097\u009e\u00a2\u00b8\u00ce\u00d0\u00dc\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}