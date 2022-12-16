grammar Binary;

file: commands+;
commands: print+;
print: CLG '(' expr ')';
expr:
	operation = CONVERTIR expr	# plusSubtraction
	| BINARY					# binary;

CONVERTIR: '>';

CLG: 'console.log';
BINARY: [01]+;
SPACES: [ \t\r\n]+ -> skip;