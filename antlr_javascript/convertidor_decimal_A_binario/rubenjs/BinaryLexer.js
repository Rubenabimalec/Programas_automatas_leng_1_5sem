// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,6,43,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,
7,4,2,5,7,5,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,
1,3,1,3,1,3,1,4,4,4,33,8,4,11,4,12,4,34,1,5,4,5,38,8,5,11,5,12,5,39,1,5,
1,5,0,0,6,1,1,3,2,5,3,7,4,9,5,11,6,1,0,2,1,0,48,49,3,0,9,10,13,13,32,32,
44,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,
0,0,1,13,1,0,0,0,3,15,1,0,0,0,5,17,1,0,0,0,7,19,1,0,0,0,9,32,1,0,0,0,11,
37,1,0,0,0,13,14,5,40,0,0,14,2,1,0,0,0,15,16,5,41,0,0,16,4,1,0,0,0,17,18,
5,62,0,0,18,6,1,0,0,0,19,20,5,99,0,0,20,21,5,111,0,0,21,22,5,110,0,0,22,
23,5,115,0,0,23,24,5,111,0,0,24,25,5,108,0,0,25,26,5,101,0,0,26,27,5,46,
0,0,27,28,5,108,0,0,28,29,5,111,0,0,29,30,5,103,0,0,30,8,1,0,0,0,31,33,7,
0,0,0,32,31,1,0,0,0,33,34,1,0,0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,10,1,0,
0,0,36,38,7,1,0,0,37,36,1,0,0,0,38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,
0,40,41,1,0,0,0,41,42,6,5,0,0,42,12,1,0,0,0,3,0,34,39,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class BinaryLexer extends antlr4.Lexer {

    static grammarFileName = "Binary.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "'('", "')'", "'>'", "'console.log'" ];
	static symbolicNames = [ null, null, null, "CONVERTIR", "CLG", "BINARY", 
                          "SPACES" ];
	static ruleNames = [ "T__0", "T__1", "CONVERTIR", "CLG", "BINARY", "SPACES" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    }

    get atn() {
        return atn;
    }
}

BinaryLexer.EOF = antlr4.Token.EOF;
BinaryLexer.T__0 = 1;
BinaryLexer.T__1 = 2;
BinaryLexer.CONVERTIR = 3;
BinaryLexer.CLG = 4;
BinaryLexer.BINARY = 5;
BinaryLexer.SPACES = 6;



