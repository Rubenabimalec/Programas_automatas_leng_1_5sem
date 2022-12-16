grammar Array;

programa: array;

array: CORI data? CORF;
// lee de derecha a izq no se puede por que es no ambiguo por que cambir curso
data: STRING | array | NUMERO | BOOLEAN | data ( COMA data)+;

//Tokens
NUMERO: [0-9]+;
STRING: '"' .*? '"';
CORI: '[';
CORF: ']';
COMA: ',';
BOOLEAN: 'true' | 'false';
ESPACIOS: [ \t\r\n]+ -> skip;
