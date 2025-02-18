grammar TSmm;

/* Syntactic analyser (LAB 4) */

program: expression '+' expression
       ;

expression: INT_LITERAL
       | ID
       ;

/* Lexical analyser (LAB 3) */

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
