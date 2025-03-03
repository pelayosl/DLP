// Generated from C:/Users/pelay/Documents/EII/3º Software/DLP/DLP/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import ast.*;
import ast.locatables.*;
import ast.expressions.*;
import ast.statements.*;
import ast.definitions.*;
import ast.types.*;
import java.util.*;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		COMMENT=39, WS=40, INT_LITERAL=41, CHAR_LITERAL=42, NUMBER_LITERAL=43, 
		ID=44;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_variable_definition = 2, RULE_variableList = 3, 
		RULE_function_definition = 4, RULE_function_parameters = 5, RULE_function_invocation = 6, 
		RULE_function_invocation_statement = 7, RULE_expressionList = 8, RULE_statement = 9, 
		RULE_block = 10, RULE_expression = 11, RULE_type = 12, RULE_built_in_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "variable_definition", "variableList", "function_definition", 
			"function_parameters", "function_invocation", "function_invocation_statement", 
			"expressionList", "statement", "block", "expression", "type", "built_in_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "':'", "';'", "','", "'function'", "'('", "')'", "'void'", 
			"'{'", "'}'", "'log'", "'input'", "'='", "'while'", "'if'", "'else'", 
			"'return'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'number'", "'int'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "COMMENT", "WS", "INT_LITERAL", "CHAR_LITERAL", "NUMBER_LITERAL", 
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
		public Program ast;
		public List<Definition> definitions = new ArrayList<>();
		public DefinitionContext definition;
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				{
				setState(29); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(28);
						((ProgramContext)_localctx).definition = definition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(31); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.definitions.addAll(((ProgramContext)_localctx).definition.ast);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.definitions);
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
		public List<Definition> ast = new ArrayList<>();
		public Variable_definitionContext vars;
		public Function_definitionContext funcs;
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(43);
						((DefinitionContext)_localctx).vars = variable_definition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(46); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.ast.addAll(((DefinitionContext)_localctx).vars.ast);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(50);
						((DefinitionContext)_localctx).funcs = function_definition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(53); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.ast.add(((DefinitionContext)_localctx).funcs.ast);
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
		public List<Definition> ast = new ArrayList<>();
		public Token ID;
		public VariableListContext variableList;
		public TypeContext t;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			((Variable_definitionContext)_localctx).ID = match(ID);
			setState(61);
			((Variable_definitionContext)_localctx).variableList = variableList();
			setState(62);
			match(T__1);
			setState(63);
			((Variable_definitionContext)_localctx).t = type();
			setState(64);
			match(T__2);

			                   _localctx.ast.add(new VarDefinition(
			                       ((Variable_definitionContext)_localctx).ID.getLine(),
			                       ((Variable_definitionContext)_localctx).ID.getCharPositionInLine()+1,
			                       ((Variable_definitionContext)_localctx).t.ast,
			                       (((Variable_definitionContext)_localctx).ID!=null?((Variable_definitionContext)_localctx).ID.getText():null)
			                       )
			                   );

			                   for(Token id : ((Variable_definitionContext)_localctx).variableList.ast) {
			                       _localctx.ast.add(
			                           new VarDefinition(
			                               id.getLine(),
			                               id.getCharPositionInLine()+1,
			                               ((Variable_definitionContext)_localctx).t.ast,
			                               id.getText()
			                           )
			                       );
			                   }
			              
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
	public static class VariableListContext extends ParserRuleContext {
		public List<Token> ast;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableListContext)_localctx).ast =  new ArrayList<>();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(68);
				match(T__3);
				setState(69);
				((VariableListContext)_localctx).ID = match(ID);
				 _localctx.ast.add(((VariableListContext)_localctx).ID); 
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public Definition ast;
		public Type returnType;
		public List<Definition> vars = new ArrayList<>();
		public List<Statement> stmts = new ArrayList<>();
		public List<Definition> params = new ArrayList<>();
		public Token ID;
		public Function_parametersContext function_parameters;
		public Built_in_typeContext t;
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
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
		enterRule(_localctx, 8, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__4);
			setState(77);
			((Function_definitionContext)_localctx).ID = match(ID);
			setState(78);
			match(T__5);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(79);
				((Function_definitionContext)_localctx).function_parameters = function_parameters();
				_localctx.params.addAll(((Function_definitionContext)_localctx).function_parameters.ast);
				}
			}

			setState(84);
			match(T__6);
			setState(85);
			match(T__1);
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				{
				setState(86);
				((Function_definitionContext)_localctx).t = built_in_type();
				((Function_definitionContext)_localctx).returnType = ((Function_definitionContext)_localctx).t.ast;
				}
				break;
			case T__7:
				{
				setState(89);
				match(T__7);
				((Function_definitionContext)_localctx).returnType = new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			match(T__8);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(94);
				((Function_definitionContext)_localctx).variable_definition = variable_definition();
				_localctx.vars.addAll(((Function_definitionContext)_localctx).variable_definition.ast);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985361602624L) != 0)) {
				{
				{
				setState(102);
				((Function_definitionContext)_localctx).statement = statement();
				_localctx.stmts.addAll(((Function_definitionContext)_localctx).statement.ast);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__9);


			                        ((Function_definitionContext)_localctx).ast =  new FuncDefinition(
			                            ((Function_definitionContext)_localctx).ID.getLine(),
			                            ((Function_definitionContext)_localctx).ID.getCharPositionInLine()+1,
			                            _localctx.vars,
			                            _localctx.stmts,
			                            new FunctionType(
			                                _localctx.returnType,
			                                _localctx.params
			                            ),
			                            (((Function_definitionContext)_localctx).ID!=null?((Function_definitionContext)_localctx).ID.getText():null)
			                        );
			                    
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
	public static class Function_parametersContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public Token ID;
		public Built_in_typeContext built_in_type;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<Built_in_typeContext> built_in_type() {
			return getRuleContexts(Built_in_typeContext.class);
		}
		public Built_in_typeContext built_in_type(int i) {
			return getRuleContext(Built_in_typeContext.class,i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((Function_parametersContext)_localctx).ID = match(ID);
			setState(114);
			match(T__1);
			setState(115);
			((Function_parametersContext)_localctx).built_in_type = built_in_type();
			 _localctx.ast.add(
			            new VarDefinition(
			                  ((Function_parametersContext)_localctx).ID.getLine(),
			                  ((Function_parametersContext)_localctx).ID.getCharPositionInLine()+1,
			                  ((Function_parametersContext)_localctx).built_in_type.ast,
			                  (((Function_parametersContext)_localctx).ID!=null?((Function_parametersContext)_localctx).ID.getText():null)
			                  )
			            );
			            
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(117);
				match(T__3);
				setState(118);
				((Function_parametersContext)_localctx).ID = match(ID);
				setState(119);
				match(T__1);
				setState(120);
				((Function_parametersContext)_localctx).built_in_type = built_in_type();
				 _localctx.ast.add(new VarDefinition(
				                   ((Function_parametersContext)_localctx).ID.getLine(),
				                   ((Function_parametersContext)_localctx).ID.getCharPositionInLine()+1,
				                   ((Function_parametersContext)_localctx).built_in_type.ast,
				                   (((Function_parametersContext)_localctx).ID!=null?((Function_parametersContext)_localctx).ID.getText():null)
				                   )
				                );
				            
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public Expression ast;
		public Token ID;
		public ExpressionListContext expressionList;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Function_invocationContext)_localctx).ID = match(ID);
			setState(129);
			match(T__5);
			setState(130);
			((Function_invocationContext)_localctx).expressionList = expressionList();
			setState(131);
			match(T__6);

			            ((Function_invocationContext)_localctx).ast =  new FunctionInvocation(
			                 ((Function_invocationContext)_localctx).ID.getLine(),
			                 ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1,
			                 new Variable(((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1, (((Function_invocationContext)_localctx).ID!=null?((Function_invocationContext)_localctx).ID.getText():null)),
			                 ((Function_invocationContext)_localctx).expressionList.ast
			                 );
			            
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
	public static class Function_invocation_statementContext extends ParserRuleContext {
		public Statement ast;
		public Token ID;
		public ExpressionListContext expressionList;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Function_invocation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation_statement; }
	}

	public final Function_invocation_statementContext function_invocation_statement() throws RecognitionException {
		Function_invocation_statementContext _localctx = new Function_invocation_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_invocation_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((Function_invocation_statementContext)_localctx).ID = match(ID);
			setState(135);
			match(T__5);
			setState(136);
			((Function_invocation_statementContext)_localctx).expressionList = expressionList();
			setState(137);
			match(T__6);

			                        ((Function_invocation_statementContext)_localctx).ast =  new FunctionInvocation(
			                             ((Function_invocation_statementContext)_localctx).ID.getLine(),
			                             ((Function_invocation_statementContext)_localctx).ID.getCharPositionInLine()+1,
			                             new Variable(((Function_invocation_statementContext)_localctx).ID.getLine(), ((Function_invocation_statementContext)_localctx).ID.getCharPositionInLine()+1, (((Function_invocation_statementContext)_localctx).ID!=null?((Function_invocation_statementContext)_localctx).ID.getText():null)),
			                             ((Function_invocation_statementContext)_localctx).expressionList.ast
			                             );
			                        
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).ast =  new ArrayList<>();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985361416256L) != 0)) {
				{
				setState(141);
				((ExpressionListContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionListContext)_localctx).e1.ast);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(143);
					match(T__3);
					setState(144);
					((ExpressionListContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ExpressionListContext)_localctx).e2.ast);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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
		public List<Statement> ast = new ArrayList<>();
		public ExpressionListContext expressionList;
		public ExpressionContext ex1;
		public ExpressionContext ex2;
		public ExpressionContext expression;
		public BlockContext block;
		public BlockContext b1;
		public BlockContext b2;
		public Function_invocation_statementContext function_invocation_statement;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
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
		public Function_invocation_statementContext function_invocation_statement() {
			return getRuleContext(Function_invocation_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__10);
				setState(155);
				((StatementContext)_localctx).expressionList = expressionList();
				setState(156);
				match(T__2);

				                    for(Expression exp : ((StatementContext)_localctx).expressionList.ast){
				                                            _localctx.ast.add(
				                                                new WriteStatement(
				                                                    exp.getLine(),
				                                                    exp.getColumn(),
				                                                    exp
				                                                )
				                                            );
				                                       }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__11);
				setState(160);
				((StatementContext)_localctx).expressionList = expressionList();
				setState(161);
				match(T__2);

				                   for(Expression exp : ((StatementContext)_localctx).expressionList.ast){
				                        _localctx.ast.add(
				                            new ReadStatement(
				                                exp.getLine(),
				                                exp.getColumn(),
				                                exp
				                            )
				                        );
				                   }
				       
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				((StatementContext)_localctx).ex1 = expression(0);
				setState(165);
				match(T__12);
				setState(166);
				((StatementContext)_localctx).ex2 = expression(0);
				setState(167);
				match(T__2);

				                       _localctx.ast.add(new Assignment(
				                            ((StatementContext)_localctx).ex1.ast.getLine(),
				                            ((StatementContext)_localctx).ex2.ast.getColumn(),
				                            ((StatementContext)_localctx).ex1.ast,
				                            ((StatementContext)_localctx).ex2.ast
				                       ));
				       
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__13);
				setState(171);
				match(T__5);
				setState(172);
				((StatementContext)_localctx).expression = expression(0);
				setState(173);
				match(T__6);
				setState(174);
				((StatementContext)_localctx).block = block();

				                       _localctx.ast.add(new WhileStatement(
				                            ((StatementContext)_localctx).expression.ast.getLine(),
				                            ((StatementContext)_localctx).expression.ast.getColumn(),
				                            ((StatementContext)_localctx).expression.ast,
				                            ((StatementContext)_localctx).block.ast
				                       )
				                       );
				       
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__14);
				setState(178);
				match(T__5);
				setState(179);
				((StatementContext)_localctx).expression = expression(0);
				setState(180);
				match(T__6);
				setState(181);
				((StatementContext)_localctx).b1 = block();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(182);
					match(T__15);
					setState(183);
					((StatementContext)_localctx).b2 = block();
					}
					break;
				}

				                      _localctx.ast.add(new ConditionalStatement(
				                            ((StatementContext)_localctx).expression.ast.getLine(),
				                            ((StatementContext)_localctx).expression.ast.getColumn(),
				                            ((StatementContext)_localctx).b1.ast,
				                            ((StatementContext)_localctx).b2.ast,
				                            ((StatementContext)_localctx).expression.ast
				                      )
				                      );
				       
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__16);
				setState(189);
				((StatementContext)_localctx).expression = expression(0);
				setState(190);
				match(T__2);

				                     _localctx.ast.add(new ReturnStatement(
				                            ((StatementContext)_localctx).expression.ast.getLine(),
				                            ((StatementContext)_localctx).expression.ast.getColumn(),
				                            ((StatementContext)_localctx).expression.ast
				                     )
				                     );
				       
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				((StatementContext)_localctx).function_invocation_statement = function_invocation_statement();
				setState(194);
				match(T__2);
				 _localctx.ast.add(((StatementContext)_localctx).function_invocation_statement.ast); 
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
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s1;
		public StatementContext s2;
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			setState(211);
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
				setState(199);
				((BlockContext)_localctx).s1 = statement();
				 _localctx.ast.addAll(((BlockContext)_localctx).s1.ast); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__8);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985361602624L) != 0)) {
					{
					{
					setState(203);
					((BlockContext)_localctx).s2 = statement();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 _localctx.ast.addAll(((BlockContext)_localctx).s2.ast); 
				setState(210);
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
		public Expression ast;
		public ExpressionContext ex1;
		public ExpressionContext e1;
		public ExpressionContext expression;
		public TypeContext type;
		public Function_invocationContext function_invocation;
		public Token ID;
		public Token INT_LITERAL;
		public Token CHAR_LITERAL;
		public Token NUMBER_LITERAL;
		public ExpressionContext ex2;
		public Token op;
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(214);
				match(T__5);
				setState(215);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(216);
				match(T__6);

				                      ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				                      
				}
				break;
			case 2:
				{
				setState(219);
				match(T__5);
				setState(220);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(221);
				match(T__20);
				setState(222);
				((ExpressionContext)_localctx).type = type();
				setState(223);
				match(T__6);

				                      ((ExpressionContext)_localctx).ast =  new Cast(
				                          ((ExpressionContext)_localctx).expression.ast.getLine(),
				                          ((ExpressionContext)_localctx).expression.ast.getColumn(),
				                          ((ExpressionContext)_localctx).expression.ast,
				                          ((ExpressionContext)_localctx).type.ast
				                          );
				                      
				}
				break;
			case 3:
				{
				setState(226);
				match(T__21);
				setState(227);
				((ExpressionContext)_localctx).expression = expression(11);

				                      ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				                          ((ExpressionContext)_localctx).expression.ast.getLine(),
				                          ((ExpressionContext)_localctx).expression.ast.getColumn(),
				                          ((ExpressionContext)_localctx).expression.ast
				                          );
				                      
				}
				break;
			case 4:
				{
				setState(230);
				match(T__22);
				setState(231);
				((ExpressionContext)_localctx).expression = expression(10);

				                      ((ExpressionContext)_localctx).ast =  new UnaryNot(
				                          ((ExpressionContext)_localctx).expression.ast.getLine(),
				                          ((ExpressionContext)_localctx).expression.ast.getColumn(),
				                          ((ExpressionContext)_localctx).expression.ast
				                          );
				                      
				}
				break;
			case 5:
				{
				setState(234);
				((ExpressionContext)_localctx).function_invocation = function_invocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).function_invocation.ast; 
				}
				break;
			case 6:
				{
				setState(237);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 7:
				{
				setState(239);
				((ExpressionContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_LITERAL.getLine(),
				                      ((ExpressionContext)_localctx).INT_LITERAL.getCharPositionInLine()+1,
				                      LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_LITERAL!=null?((ExpressionContext)_localctx).INT_LITERAL.getText():null)));
				                      
				}
				break;
			case 8:
				{
				setState(241);
				((ExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((ExpressionContext)_localctx).ast =  new CharLiteral(
				                      ((ExpressionContext)_localctx).CHAR_LITERAL.getLine(),
				                      ((ExpressionContext)_localctx).CHAR_LITERAL.getCharPositionInLine()+1,
				                      LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_LITERAL!=null?((ExpressionContext)_localctx).CHAR_LITERAL.getText():null)));
				                      
				}
				break;
			case 9:
				{
				setState(243);
				((ExpressionContext)_localctx).NUMBER_LITERAL = match(NUMBER_LITERAL);
				((ExpressionContext)_localctx).ast =  new NumberLiteral(
				                      ((ExpressionContext)_localctx).NUMBER_LITERAL.getLine(),
				                      ((ExpressionContext)_localctx).NUMBER_LITERAL.getCharPositionInLine()+1,
				                      LexerHelper.lexemeToReal((((ExpressionContext)_localctx).NUMBER_LITERAL!=null?((ExpressionContext)_localctx).NUMBER_LITERAL.getText():null)));
				                      
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(248);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(10);

						                                ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                    ((ExpressionContext)_localctx).ex1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).ex2.ast.getColumn(),
						                                    (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),
						                                    ((ExpressionContext)_localctx).ex1.ast,
						                                    ((ExpressionContext)_localctx).ex2.ast
						                                    );
						                                
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(253);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__26) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(9);

						                                ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                    ((ExpressionContext)_localctx).ex1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).ex2.ast.getColumn(),
						                                    (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),
						                                    ((ExpressionContext)_localctx).ex1.ast,
						                                    ((ExpressionContext)_localctx).ex2.ast
						                                    );
						                                
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(258);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(8);

						                                ((ExpressionContext)_localctx).ast =  new Comparison(
						                                    ((ExpressionContext)_localctx).ex1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).ex2.ast.getColumn(),
						                                    (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),
						                                    ((ExpressionContext)_localctx).ex1.ast,
						                                    ((ExpressionContext)_localctx).ex2.ast
						                                    );
						                                
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(263);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(7);

						                                 ((ExpressionContext)_localctx).ast =  new Logic(
						                                     ((ExpressionContext)_localctx).ex1.ast.getLine(),
						                                     ((ExpressionContext)_localctx).ex2.ast.getColumn(),
						                                     (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),
						                                     ((ExpressionContext)_localctx).ex1.ast,
						                                     ((ExpressionContext)_localctx).ex2.ast
						                                     );
						                                 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(268);
						match(T__17);
						setState(269);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(270);
						match(T__18);

						                                ((ExpressionContext)_localctx).ast =  new ArrayAccess(
						                                    ((ExpressionContext)_localctx).ex1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).ex2.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).ex1.ast,
						                                    ((ExpressionContext)_localctx).ex2.ast
						                                    );
						                                
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(274);
						match(T__19);
						setState(275);
						((ExpressionContext)_localctx).ID = match(ID);

						                 System.out.println((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						                                ((ExpressionContext)_localctx).ast =  new FieldAccess(
						                                    ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).e1.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).e1.ast,
						                                    (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)
						                                    );
						                                
						}
						break;
					}
					} 
				}
				setState(281);
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
		public Type ast;
		public List<RecordField> recordFields = new ArrayList<>();
		public Built_in_typeContext built_in_type;
		public Token INT_LITERAL;
		public TypeContext type;
		public Token ID;
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(TSmmParser.INT_LITERAL, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((TypeContext)_localctx).built_in_type = built_in_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).built_in_type.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__17);
				setState(286);
				((TypeContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(287);
				match(T__18);
				setState(288);
				((TypeContext)_localctx).type = type();

				                      ((TypeContext)_localctx).ast =  new ArrayType(
				                      ((TypeContext)_localctx).type.ast,
				                      LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_LITERAL!=null?((TypeContext)_localctx).INT_LITERAL.getText():null))
				                      );
				                      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(T__17);
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(292);
					match(T__0);
					setState(293);
					((TypeContext)_localctx).ID = match(ID);
					setState(294);
					match(T__1);
					setState(295);
					((TypeContext)_localctx).type = type();
					setState(296);
					match(T__2);
					 _localctx.recordFields.add( new RecordField( ((TypeContext)_localctx).ID.getLine(),
					                                    ((TypeContext)_localctx).ID.getCharPositionInLine()+1,
					                                    ((TypeContext)_localctx).type.ast,
					                                    (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null)
					                                    ) ); 
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(303);
				match(T__18);

				                      ((TypeContext)_localctx).ast =  new RecordType(
				                          _localctx.recordFields
				                      );
				    
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
	public static class Built_in_typeContext extends ParserRuleContext {
		public Type ast;
		public Built_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_type; }
	}

	public final Built_in_typeContext built_in_type() throws RecognitionException {
		Built_in_typeContext _localctx = new Built_in_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_built_in_type);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(T__35);
				 ((Built_in_typeContext)_localctx).ast =  NumberType.getInstance(); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(T__36);
				 ((Built_in_typeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(T__37);
				 ((Built_in_typeContext)_localctx).ast =  CharType.getInstance(); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
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
		"\u0004\u0001,\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004S\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004\n\u0004"+
		"\f\u0004m\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u0094\b\b\n\b\f\b\u0097\t\b\u0003\b\u0099\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b9\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c6\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00cd\b\n\n\n\f\n\u00d0\t\n\u0001\n\u0001\n"+
		"\u0003\n\u00d4\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f6\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0116\b\u000b\n\u000b\f\u000b\u0119\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u012c\b\f\u000b\f\f"+
		"\f\u012d\u0001\f\u0001\f\u0001\f\u0003\f\u0133\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u013b\b\r\u0001\r\u0000\u0001\u0016"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0004\u0001\u0000\u0018\u001a\u0002\u0000\u0016\u0016\u001b"+
		"\u001b\u0001\u0000\u001c!\u0001\u0000\"#\u0157\u0000%\u0001\u0000\u0000"+
		"\u0000\u00029\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006"+
		"C\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000"+
		"\u0000\f\u0080\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000"+
		"\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u00c5\u0001\u0000\u0000\u0000"+
		"\u0014\u00d3\u0001\u0000\u0000\u0000\u0016\u00f5\u0001\u0000\u0000\u0000"+
		"\u0018\u0132\u0001\u0000\u0000\u0000\u001a\u013a\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0006\u0000"+
		"\uffff\uffff\u0000\"$\u0001\u0000\u0000\u0000#\u001d\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005"+
		"\u0000\u0000\u0001)*\u0006\u0000\uffff\uffff\u0000*\u0001\u0001\u0000"+
		"\u0000\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000001\u0006\u0001\uffff\uffff\u00001:\u0001\u0000"+
		"\u0000\u000024\u0003\b\u0004\u000032\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0006\u0001\uffff\uffff\u00008:\u0001\u0000\u0000"+
		"\u00009,\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0001\u0000\u0000<=\u0005,\u0000\u0000=>\u0003"+
		"\u0006\u0003\u0000>?\u0005\u0002\u0000\u0000?@\u0003\u0018\f\u0000@A\u0005"+
		"\u0003\u0000\u0000AB\u0006\u0002\uffff\uffff\u0000B\u0005\u0001\u0000"+
		"\u0000\u0000CI\u0006\u0003\uffff\uffff\u0000DE\u0005\u0004\u0000\u0000"+
		"EF\u0005,\u0000\u0000FH\u0006\u0003\uffff\uffff\u0000GD\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0005\u0000\u0000MN\u0005,\u0000\u0000NR\u0005\u0006\u0000\u0000"+
		"OP\u0003\n\u0005\u0000PQ\u0006\u0004\uffff\uffff\u0000QS\u0001\u0000\u0000"+
		"\u0000RO\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0007\u0000\u0000U[\u0005\u0002\u0000\u0000VW\u0003"+
		"\u001a\r\u0000WX\u0006\u0004\uffff\uffff\u0000X\\\u0001\u0000\u0000\u0000"+
		"YZ\u0005\b\u0000\u0000Z\\\u0006\u0004\uffff\uffff\u0000[V\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]c\u0005"+
		"\t\u0000\u0000^_\u0003\u0004\u0002\u0000_`\u0006\u0004\uffff\uffff\u0000"+
		"`b\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dk\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0003\u0012\t\u0000gh\u0006\u0004"+
		"\uffff\uffff\u0000hj\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\n\u0000"+
		"\u0000op\u0006\u0004\uffff\uffff\u0000p\t\u0001\u0000\u0000\u0000qr\u0005"+
		",\u0000\u0000rs\u0005\u0002\u0000\u0000st\u0003\u001a\r\u0000t}\u0006"+
		"\u0005\uffff\uffff\u0000uv\u0005\u0004\u0000\u0000vw\u0005,\u0000\u0000"+
		"wx\u0005\u0002\u0000\u0000xy\u0003\u001a\r\u0000yz\u0006\u0005\uffff\uffff"+
		"\u0000z|\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u000b\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005,\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0003"+
		"\u0010\b\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u0085\u0006\u0006"+
		"\uffff\uffff\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005,"+
		"\u0000\u0000\u0087\u0088\u0005\u0006\u0000\u0000\u0088\u0089\u0003\u0010"+
		"\b\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008b\u0006\u0007\uffff"+
		"\uffff\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u0098\u0006\b\uffff"+
		"\uffff\u0000\u008d\u008e\u0003\u0016\u000b\u0000\u008e\u0095\u0006\b\uffff"+
		"\uffff\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0091\u0003\u0016"+
		"\u000b\u0000\u0091\u0092\u0006\b\uffff\uffff\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u008d\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u000b"+
		"\u0000\u0000\u009b\u009c\u0003\u0010\b\u0000\u009c\u009d\u0005\u0003\u0000"+
		"\u0000\u009d\u009e\u0006\t\uffff\uffff\u0000\u009e\u00c6\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\f\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000"+
		"\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0006\t\uffff\uffff\u0000"+
		"\u00a3\u00c6\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u0016\u000b\u0000"+
		"\u00a5\u00a6\u0005\r\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7"+
		"\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0006\t\uffff\uffff\u0000\u00a9"+
		"\u00c6\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0006\u0000\u0000\u00ac\u00ad\u0003\u0016\u000b\u0000\u00ad"+
		"\u00ae\u0005\u0007\u0000\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af\u00b0"+
		"\u0006\t\uffff\uffff\u0000\u00b0\u00c6\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u000f\u0000\u0000\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b4"+
		"\u0003\u0016\u000b\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000\u00b5\u00b8"+
		"\u0003\u0014\n\u0000\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b9\u0003"+
		"\u0014\n\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0006\t\uffff"+
		"\uffff\u0000\u00bb\u00c6\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0011"+
		"\u0000\u0000\u00bd\u00be\u0003\u0016\u000b\u0000\u00be\u00bf\u0005\u0003"+
		"\u0000\u0000\u00bf\u00c0\u0006\t\uffff\uffff\u0000\u00c0\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3\u0005\u0003"+
		"\u0000\u0000\u00c3\u00c4\u0006\t\uffff\uffff\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u009a\u0001\u0000\u0000\u0000\u00c5\u009f\u0001\u0000"+
		"\u0000\u0000\u00c5\u00a4\u0001\u0000\u0000\u0000\u00c5\u00aa\u0001\u0000"+
		"\u0000\u0000\u00c5\u00b1\u0001\u0000\u0000\u0000\u00c5\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6\u0013\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0003\u0012\t\u0000\u00c8\u00c9\u0006\n\uffff"+
		"\uffff\u0000\u00c9\u00d4\u0001\u0000\u0000\u0000\u00ca\u00ce\u0005\t\u0000"+
		"\u0000\u00cb\u00cd\u0003\u0012\t\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u0006\n\uffff\uffff\u0000"+
		"\u00d2\u00d4\u0005\n\u0000\u0000\u00d3\u00c7\u0001\u0000\u0000\u0000\u00d3"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0006\u000b\uffff\uffff\u0000\u00d6\u00d7\u0005\u0006\u0000\u0000"+
		"\u00d7\u00d8\u0003\u0016\u000b\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000"+
		"\u00d9\u00da\u0006\u000b\uffff\uffff\u0000\u00da\u00f6\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc\u00dd\u0003\u0016\u000b"+
		"\u0000\u00dd\u00de\u0005\u0015\u0000\u0000\u00de\u00df\u0003\u0018\f\u0000"+
		"\u00df\u00e0\u0005\u0007\u0000\u0000\u00e0\u00e1\u0006\u000b\uffff\uffff"+
		"\u0000\u00e1\u00f6\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0016\u0000"+
		"\u0000\u00e3\u00e4\u0003\u0016\u000b\u000b\u00e4\u00e5\u0006\u000b\uffff"+
		"\uffff\u0000\u00e5\u00f6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0017"+
		"\u0000\u0000\u00e7\u00e8\u0003\u0016\u000b\n\u00e8\u00e9\u0006\u000b\uffff"+
		"\uffff\u0000\u00e9\u00f6\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003\f\u0006"+
		"\u0000\u00eb\u00ec\u0006\u000b\uffff\uffff\u0000\u00ec\u00f6\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005,\u0000\u0000\u00ee\u00f6\u0006\u000b\uffff"+
		"\uffff\u0000\u00ef\u00f0\u0005)\u0000\u0000\u00f0\u00f6\u0006\u000b\uffff"+
		"\uffff\u0000\u00f1\u00f2\u0005*\u0000\u0000\u00f2\u00f6\u0006\u000b\uffff"+
		"\uffff\u0000\u00f3\u00f4\u0005+\u0000\u0000\u00f4\u00f6\u0006\u000b\uffff"+
		"\uffff\u0000\u00f5\u00d5\u0001\u0000\u0000\u0000\u00f5\u00db\u0001\u0000"+
		"\u0000\u0000\u00f5\u00e2\u0001\u0000\u0000\u0000\u00f5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ea\u0001\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u0117\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\n\t\u0000\u0000\u00f8\u00f9\u0007\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0003\u0016\u000b\n\u00fa\u00fb\u0006\u000b\uffff\uffff"+
		"\u0000\u00fb\u0116\u0001\u0000\u0000\u0000\u00fc\u00fd\n\b\u0000\u0000"+
		"\u00fd\u00fe\u0007\u0001\u0000\u0000\u00fe\u00ff\u0003\u0016\u000b\t\u00ff"+
		"\u0100\u0006\u000b\uffff\uffff\u0000\u0100\u0116\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\n\u0007\u0000\u0000\u0102\u0103\u0007\u0002\u0000\u0000\u0103"+
		"\u0104\u0003\u0016\u000b\b\u0104\u0105\u0006\u000b\uffff\uffff\u0000\u0105"+
		"\u0116\u0001\u0000\u0000\u0000\u0106\u0107\n\u0006\u0000\u0000\u0107\u0108"+
		"\u0007\u0003\u0000\u0000\u0108\u0109\u0003\u0016\u000b\u0007\u0109\u010a"+
		"\u0006\u000b\uffff\uffff\u0000\u010a\u0116\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\n\u000e\u0000\u0000\u010c\u010d\u0005\u0012\u0000\u0000\u010d\u010e"+
		"\u0003\u0016\u000b\u0000\u010e\u010f\u0005\u0013\u0000\u0000\u010f\u0110"+
		"\u0006\u000b\uffff\uffff\u0000\u0110\u0116\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\n\r\u0000\u0000\u0112\u0113\u0005\u0014\u0000\u0000\u0113\u0114"+
		"\u0005,\u0000\u0000\u0114\u0116\u0006\u000b\uffff\uffff\u0000\u0115\u00f7"+
		"\u0001\u0000\u0000\u0000\u0115\u00fc\u0001\u0000\u0000\u0000\u0115\u0101"+
		"\u0001\u0000\u0000\u0000\u0115\u0106\u0001\u0000\u0000\u0000\u0115\u010b"+
		"\u0001\u0000\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0116\u0119"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u0017\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u001a\r\u0000\u011b\u011c\u0006"+
		"\f\uffff\uffff\u0000\u011c\u0133\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0012\u0000\u0000\u011e\u011f\u0005)\u0000\u0000\u011f\u0120\u0005\u0013"+
		"\u0000\u0000\u0120\u0121\u0003\u0018\f\u0000\u0121\u0122\u0006\f\uffff"+
		"\uffff\u0000\u0122\u0133\u0001\u0000\u0000\u0000\u0123\u012b\u0005\u0012"+
		"\u0000\u0000\u0124\u0125\u0005\u0001\u0000\u0000\u0125\u0126\u0005,\u0000"+
		"\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0128\u0003\u0018\f\u0000"+
		"\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012a\u0006\f\uffff\uffff\u0000"+
		"\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0124\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0005\u0013\u0000\u0000\u0130\u0131\u0006\f\uffff\uffff\u0000"+
		"\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u011a\u0001\u0000\u0000\u0000"+
		"\u0132\u011d\u0001\u0000\u0000\u0000\u0132\u0123\u0001\u0000\u0000\u0000"+
		"\u0133\u0019\u0001\u0000\u0000\u0000\u0134\u0135\u0005$\u0000\u0000\u0135"+
		"\u013b\u0006\r\uffff\uffff\u0000\u0136\u0137\u0005%\u0000\u0000\u0137"+
		"\u013b\u0006\r\uffff\uffff\u0000\u0138\u0139\u0005&\u0000\u0000\u0139"+
		"\u013b\u0006\r\uffff\uffff\u0000\u013a\u0134\u0001\u0000\u0000\u0000\u013a"+
		"\u0136\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u001b\u0001\u0000\u0000\u0000\u0017\u001f%.59IR[ck}\u0095\u0098\u00b8"+
		"\u00c5\u00ce\u00d3\u00f5\u0115\u0117\u012d\u0132\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}