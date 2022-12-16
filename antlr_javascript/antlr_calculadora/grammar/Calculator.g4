grammar Calculator;

file: commands+;
commands: print+ | asign ';';
print: CLG '(' expr ')';
asign: VARIABLE '=' expr;
expr:
	expr operation = (TIMES | DIV) expr		# timesDiv
	| expr operation = (PLUS | MINUS) expr	# plusSubtraction
	| VARIABLE								# variable
	| NUMBER								# number
	| '(' expr ')'							# parent;

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
CLG: 'console.log';
NUMBER: '-'? DIGIT+ ('.' DIGIT+)?;
VARIABLE: LETTER+;
COMMENTS: '"' .*? '"' -> skip;
SPACES: [ \t\r\n]+ -> skip;

fragment LETTER: [a-zA-Z];

fragment DIGIT: [0-9];
//\t\r\n +-> skip map <k, v>