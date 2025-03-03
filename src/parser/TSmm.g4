grammar TSmm;

@header {
import ast.*;
import ast.locatables.*;
import ast.expressions.*;
import ast.statements.*;
import ast.definitions.*;
import ast.types.*;
import java.util.*;
}


/* Syntactic analyser (LAB 4) / Embedded actions (LAB 5) */

program returns [Program ast] locals [List<Definition> definitions = new ArrayList<>()]:
       (definition+ {$definitions.addAll($definition.ast);})* EOF { $ast = new Program($definitions);}
       ;
// un array access no es un ID porque puedes tener array[][]

definition returns [List<Definition> ast = new ArrayList<>()]:
            vars=variable_definition+ {$ast.addAll($vars.ast);}
          | funcs=function_definition+ {$ast.add($funcs.ast);}
          ;



variable_definition returns [List<Definition> ast = new ArrayList<>()]:
       'let' ID variableList ':' t=type ';' {
                   $ast.add(new VarDefinition(
                       $ID.getLine(),
                       $ID.getCharPositionInLine()+1,
                       $t.ast,
                       $ID.text
                       )
                   );

                   for(Token id : $variableList.ast) {
                       $ast.add(
                           new VarDefinition(
                               id.getLine(),
                               id.getCharPositionInLine()+1,
                               $t.ast,
                               id.getText()
                           )
                       );
                   }
              }
              ;

variableList returns [List<Token> ast]:
        {$ast = new ArrayList<>();}
       (',' ID { $ast.add($ID); })*
       ;

function_definition returns [Definition ast] locals [Type returnType,
                                                    List<Definition> vars = new ArrayList<>(),
                                                    List<Statement> stmts = new ArrayList<>(),
                                                    List<Definition> params = new ArrayList<>()]:
                     'function' ID '(' (function_parameters {$params.addAll($function_parameters.ast);})? ')' ':' (t=built_in_type{$returnType=$t.ast;}|'void'{$returnType=new VoidType();})
                    '{' (variable_definition{$vars.addAll($variable_definition.ast);})* (statement{$stmts.addAll($statement.ast);})* '}' {

                        $ast = new FuncDefinition(
                            $ID.getLine(),
                            $ID.getCharPositionInLine()+1,
                            $vars,
                            $stmts,
                            new FunctionType(
                                $returnType,
                                $params
                            ),
                            $ID.text
                        );
                    }
                    ;

function_parameters returns [List<Definition> ast = new ArrayList<>()]:
            ID ':' built_in_type { $ast.add(
            new VarDefinition(
                  $ID.getLine(),
                  $ID.getCharPositionInLine()+1,
                  $built_in_type.ast,
                  $ID.text
                  )
            );
            } (',' ID ':' built_in_type { $ast.add(new VarDefinition(
                   $ID.getLine(),
                   $ID.getCharPositionInLine()+1,
                   $built_in_type.ast,
                   $ID.text
                   )
                );
            })*
            ;

function_invocation returns [Expression ast]:
        ID '(' expressionList ')' {
            $ast = new FunctionInvocation(
                 $ID.getLine(),
                 $ID.getCharPositionInLine()+1,
                 new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
                 $expressionList.ast
                 );
            }
        ;
function_invocation_statement returns [Statement ast]:
            ID '(' expressionList ')' {
                        $ast = new FunctionInvocation(
                             $ID.getLine(),
                             $ID.getCharPositionInLine()+1,
                             new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
                             $expressionList.ast
                             );
                        }
            ;

expressionList returns [List<Expression> ast]:
        {$ast = new ArrayList<>();}
        (e1=expression {$ast.add($e1.ast);} (',' e2=expression{$ast.add($e2.ast);})*)?
        ;

statement returns [List<Statement> ast = new ArrayList<>()]:
        'log' expressionList ';' {
                    for(Expression exp : $expressionList.ast){
                                            $ast.add(
                                                new WriteStatement(
                                                    exp.getLine(),
                                                    exp.getColumn(),
                                                    exp
                                                )
                                            );
                                       }
        }
       | 'input' expressionList ';'{
                   for(Expression exp : $expressionList.ast){
                        $ast.add(
                            new ReadStatement(
                                exp.getLine(),
                                exp.getColumn(),
                                exp
                            )
                        );
                   }
       }
       | ex1=expression '=' ex2=expression ';' {
                       $ast.add(new Assignment(
                            $ex1.ast.getLine(),
                            $ex2.ast.getColumn(),
                            $ex1.ast,
                            $ex2.ast
                       ));
       }
       | 'while' '(' expression ')' block {
                       $ast.add(new WhileStatement(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast,
                            $block.ast
                       )
                       );
       }
       | 'if' '(' expression ')' b1=block ('else' b2=block)? {
                      $ast.add(new ConditionalStatement(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $b1.ast,
                            $b2.ast,
                            $expression.ast
                      )
                      );
       }
       | 'return' expression ';' {
                     $ast.add(new ReturnStatement(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast
                     )
                     );
       }
       | function_invocation_statement ';' { $ast.add($function_invocation_statement.ast); }
       ;

block returns [List<Statement> ast = new ArrayList<>()]:
        s1=statement { $ast.addAll($s1.ast); }
       | '{' s2=statement* { $ast.addAll($s2.ast); } '}'
       ;
/* We can use $a.ast.getColumn() or $a.start.getCharPositionInLine() + 1 for non-terminals */
expression returns [Expression ast]:
        '(' expression ')' {
                      $ast = $expression.ast;
                      }
       | ex1=expression '[' ex2=expression ']' {
                      $ast = new ArrayAccess(
                          $ex1.ast.getLine(),
                          $ex2.ast.getColumn(),
                          $ex1.ast,
                          $ex2.ast
                          );
                      }
       | e1=expression '.' ID {
       System.out.println($ID.text);
                      $ast = new FieldAccess(
                          $e1.ast.getLine(),
                          $e1.ast.getColumn(),
                          $e1.ast,
                          $ID.text
                          );
                      }
       |  '(' expression 'as' type ')' {
                      $ast = new Cast(
                          $expression.ast.getLine(),
                          $expression.ast.getColumn(),
                          $expression.ast,
                          $type.ast
                          );
                      }
       | '-' expression {
                      $ast = new UnaryMinus(
                          $expression.ast.getLine(),
                          $expression.ast.getColumn(),
                          $expression.ast
                          );
                      }
       | '!' expression {
                      $ast = new UnaryNot(
                          $expression.ast.getLine(),
                          $expression.ast.getColumn(),
                          $expression.ast
                          );
                      }
       | ex1=expression ('*'|'/'|'%') ex2=expression {
                      $ast = new Arithmetic(
                          $ex1.ast.getLine(),
                          $ex2.ast.getColumn(),
                          $op.text,
                          $ex1.ast,
                          $ex2.ast
                          );
                      }
       | ex1=expression op=('+'|'-') ex2=expression {
                      $ast = new Arithmetic(
                          $ex1.ast.getLine(),
                          $ex2.ast.getColumn(),
                          $op.text,
                          $ex1.ast,
                          $ex2.ast
                          );
                      }
       | ex1=expression ('>'|'>='|'<'|'<='|'!='|'==') ex2=expression {
                      $ast = new Comparison(
                          $ex1.ast.getLine(),
                          $ex2.ast.getColumn(),
                          $op.text,
                          $ex1.ast,
                          $ex2.ast
                          );
                      }
       | ex1=expression ('&&'|'||') ex2=expression {
                       $ast = new Logic(
                           $ex1.ast.getLine(),
                           $ex2.ast.getColumn(),
                           $op.text,
                           $ex1.ast,
                           $ex2.ast
                           );
                       }
       | function_invocation { $ast = $function_invocation.ast; }
       | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
       | INT_LITERAL {$ast = new IntLiteral($INT_LITERAL.getLine(),
                      $INT_LITERAL.getCharPositionInLine()+1,
                      LexerHelper.lexemeToInt($INT_LITERAL.text));
                      }
       | CHAR_LITERAL {$ast = new CharLiteral(
                      $CHAR_LITERAL.getLine(),
                      $CHAR_LITERAL.getCharPositionInLine()+1,
                      LexerHelper.lexemeToChar($CHAR_LITERAL.text));
                      }
       | NUMBER_LITERAL {$ast = new NumberLiteral(
                      $NUMBER_LITERAL.getLine(),
                      $NUMBER_LITERAL.getCharPositionInLine()+1,
                      LexerHelper.lexemeToReal($NUMBER_LITERAL.text));
                      }
       ;

type returns [Type ast] locals [List<RecordField> recordFields = new ArrayList<>()]:
       built_in_type { $ast = $built_in_type.ast; }
    | '[' INT_LITERAL ']' type {
                      $ast = new ArrayType(
                      $type.ast,
                      LexerHelper.lexemeToInt($INT_LITERAL.text)
                      );
                      }
    |  '[' ('let' ID ':' type ';' { $recordFields.add( new RecordField( $ID.getLine(),
                                    $ID.getCharPositionInLine()+1,
                                    $type.ast,
                                    $ID.text
                                    ) ); } )+ ']' {
                      $ast = new RecordType(
                          $recordFields
                      );
    }
    ;

/* Lexical analyser (LAB 3) */

built_in_type returns [Type ast]: 'number' { $ast = NumberType.getInstance(); }
    | 'int' { $ast = IntType.getInstance(); }
    | 'char' { $ast = CharType.getInstance(); }
    ;

COMMENT: ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;

WS: [ \t\n\r]+ -> skip
  ;

fragment
DIGIT: [0-9]
     ;

INT_LITERAL: '0'
           | [1-9] DIGIT*
           ;

CHAR_LITERAL: '\'' . '\''
            | '\'' '\\'[nt] '\''
            | '\'' '\\'DIGIT* '\''
            ;
fragment
MANTISSA: INT_LITERAL '.' INT_LITERAL*
        | INT_LITERAL* '.' INT_LITERAL
        | INT_LITERAL
        ;

NUMBER_LITERAL: MANTISSA
              | MANTISSA 'E-' INT_LITERAL
              | MANTISSA 'e' '+'? INT_LITERAL
              ;

ID: [a-zA-Z_][a-zA-Z_0-9]*
  ;
