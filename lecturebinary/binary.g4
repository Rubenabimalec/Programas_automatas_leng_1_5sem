grammar binary;
@member::header {
	import Converter;
}
//gramatica
decimal_number: numbers+;
numbers:
	BINARY {
    Converter convertBin = new Converter();
	int decimal=convertBin.binaryToDecimal($BINARY.getText());
    System.out.println(decimal);
    };
//lexemas
BINARY: [01]+;
NOT: ~[01]+ -> skip;
CON: '/*' .*? '*/' -> skip;
