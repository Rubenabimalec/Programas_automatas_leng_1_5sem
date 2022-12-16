grammar IPaddress;

// Author : ME Xenia P Date : Oct 18 2022

// Create a IP grammar Instructions: The grammar will be able to list IP address from a file
// Communications server: diagnosis guide (testFile.dat) IBM log file example:
// https://www.ibm.com/docs/en/zos/2.1.0?topic=problems-example-log-file
programa:
	address+ {
};
address:
	notIP IP notIP {
	    System.out.println("IP: "+$IP.getText());
			if($IP.getText().equals){
	
		}else{
			if($){
			
		}
		}
};

IP: INT '.' INT '.' INT '.' INT; // 192.168.100.20
notIP: .*?;
INT: [0-9]+; // Match IP
STRING:
	[:.#,*()/_=-] -> skip; // matches the HTTP protocol command
NL: '\n'; // match log file record terminator
WS: ' ' -> skip; // ignore spaces
LETRA: [a-zA-Z]+ -> skip;
C: '[' -> skip;
C1: ']' -> skip;