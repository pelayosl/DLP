grammar TSmm;

/* Syntactic analyser (LAB 4) */

program: definition+ EOF
       ;
// un array access no es un ID porque puedes tener array[][]

definition: variable_definition+
          | function_definition+
          ;

variable_definition: 'let' ID (',' ID)* ':' type ';'
       ;

function_definition: 'function' ID '(' (ID ':' BUILT_IN_TYPE)?
                    (',' ID ':' BUILT_IN_TYPE)* ')' ':' (BUILT_IN_TYPE|'void')
                    '{' variable_definition* statement* '}'
                    ;
function_invocation: ID '(' expression* (',' expression)* ')';

statement: 'log' expression (',' expression)* ';'
       | 'input' expression (',' expression)* ';'
       | expression '=' expression ';'
       | 'while' '(' expression ')' block
       | 'if' '(' expression ')' block ('else' block)?
       | 'return' expression ';'
       | function_invocation ';'
       ;

block: statement
       | '{' statement* '}'
       ;
expression: '(' expression ')'
       | expression '[' expression ']'
       | expression '.' ID
       |  '(' expression 'as' type ')'
       | '-' expression
       | '!' expression
       | expression ('*'|'/'|'%') expression
       | expression ('+'|'-') expression
       | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
       | expression ('&&'|'||') expression
       | function_invocation
       | ID
       | INT_LITERAL
       | CHAR_LITERAL
       | NUMBER_LITERAL
       ;

type: BUILT_IN_TYPE
    | '[' INT_LITERAL ']' type
    |  '[' (variable_definition)* ']'
    ;

/* Lexical analyser (LAB 3) */

BUILT_IN_TYPE: 'number'
    | 'int'
    | 'char'
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
