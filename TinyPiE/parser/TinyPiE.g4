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

unaryExpr: VALUE			# literalExpr
	| IDENTIFIER			# varExpr
	| '(' expr ')'			# parenExpr
	;
	

BITOP: '&'|'|';
ADDOP: '+'|'-';
MULOP: '*'|'/';

IDENTIFIER: 'x'|'y'|'z';
VALUE: [1-9][0-9]+|[0];
WS: [ \t\r\n] -> skip;
