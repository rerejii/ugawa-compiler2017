// antlr4 -package parser -o antlr-generated  -no-listener parser/PiLang.g4
grammar PiLang;

prog: varDecls funcDecl*
	;

funcDecl: 'function' IDENTIFIER '(' params ')' '{' varDecls stmt* '}'
    ;

params:   /* no parameter */
    | IDENTIFIER (',' IDENTIFIER)*
    ;

varDecls: ('var' IDENTIFIER ';')*
    ;

stmt: '{' stmt* '}'							# compoundStmt
	| IDENTIFIER '=' expr ';'				# assignStmt
	| 'if' '(' expr ')' stmt 'else' stmt	# ifStmt
	| 'while' '(' expr ')' stmt				# whileStmt
	| 'return' expr ';'						# returnStmt
	| 'print' expr ';'					# printStmt
	;

expr: orExpr
      ;

orExpr: orExpr OROP andExpr
	| andExpr
	;

andExpr: andExpr ANDOP addExpr
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
	| '(' expr ')'			# parenExpr
	| IDENTIFIER '(' args ')' # callExpr
	;

args: /* no arguments */
	| expr ( ',' expr )*
	;

OROP: '|';
ANDOP: '&';
ADDOP: '+';
MINOP: '-';
NOTOP: '~';
MULOP: '*'|'/';
IDENTIFIER: [a-z_][a-z1-9_]*|'answer';
VALUE: [1-9][0-9]*|[0];
WS: [ \t\r\n] -> skip;
