// antlr4 -package parser -o antlr-generated  -no-listener parser/TinyPiE.g4
grammar TinyPiE;

expr: bitExpr
      ;

bitExpr: bitExpr BITOP addExpr
	| addExpr
	;

addExpr: addExpr ADDOP mulExpr
	| addExpr MINOP mulExpr
	| mulExpr
	;

mulExpr: mulExpr MULOP unaryExpr
	| unaryExpr
	;

unaryExpr: VALUE			# literalExpr
	| IDENTIFIER			# varExpr
	| '(' expr ')'		# parenExpr
	| MINOP unaryExpr	# minExpr
	| NOTOP unaryExpr	# notExpr
	;

BITOP: '&'|'|';
ADDOP: '+';
MINOP: '-';
NOTOP: '~';
MULOP: '*'|'/';


IDENTIFIER: [xyz];
VALUE: [1-9][0-9]*|[0];
WS: [ \t\r\n] -> skip;
