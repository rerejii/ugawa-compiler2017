// antlr4 -package parser -o antlr-generated  -no-listener parser/TinyPiE.g4
grammar TinyPiE;

expr: bitExpr
      ;

bitExpr: bitExpr BITOP addExpr
	| addExpr
	;

addExpr: addExpr ADDOP mulExpr
	| mulExpr
	;

mulExpr: mulExpr MULOP unaryExpr
	| unaryExpr
	;

unaryExpr: NEGOP? VALUE			# literalExpr
	| NEGOP? IDENTIFIER			# varExpr
	| NEGOP? '(' expr ')'			# parenExpr
	;


BITOP: '&'|'|';
ADDOP: '+'|'-';
MULOP: '*'|'/';
NEGOP: '~'|'-';

IDENTIFIER: [xyz];
VALUE: [1-9][0-9]*|[0];
WS: [ \t\r\n] -> skip;
