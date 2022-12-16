grammar Json;

json: file;
file: KEYINICIO text? KEYFIN | BARRAINICIO text? BARRAFIN;
text:
	STRING TWOPOINTS STRING
	| STRING TWOPOINTS NUM
	//objeto
	| STRING TWOPOINTS KEYINICIO text KEYFIN
	//array
	| STRING TWOPOINTS BARRAINICIO text BARRAFIN
	//objeto
	| KEYINICIO STRING TWOPOINTS text KEYFIN
	//array
	| BARRAINICIO STRING TWOPOINTS text BARRAFIN
	//varios objetos separados por comas
	| text (COMA text)+
	//string solo
	| STRING;

//Tokens
KEYINICIO: '{';
KEYFIN: '}';
COMILLAONE: '"';
TWOPOINTS: ':';
COMA: ',';
IGUAL: '=';
SLASH: '/';
ASTERISCO: '*';
BARRAINICIO: '[';
BARRAFIN: ']';
PARENTINICIO: '(';
PARENTFIN: ')';
NUM: [0-9]+;
STRING: '"' .*? '"';
SPACE: [\t\r\n]+ -> skip;

