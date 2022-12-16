// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import BinaryVisitor from './BinaryVisitor.js';

const serializedATN = [4,1,6,29,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,4,0,
10,8,0,11,0,12,0,11,1,1,4,1,15,8,1,11,1,12,1,16,1,2,1,2,1,2,1,2,1,2,1,3,
1,3,1,3,3,3,27,8,3,1,3,0,0,4,0,2,4,6,0,0,27,0,9,1,0,0,0,2,14,1,0,0,0,4,18,
1,0,0,0,6,26,1,0,0,0,8,10,3,2,1,0,9,8,1,0,0,0,10,11,1,0,0,0,11,9,1,0,0,0,
11,12,1,0,0,0,12,1,1,0,0,0,13,15,3,4,2,0,14,13,1,0,0,0,15,16,1,0,0,0,16,
14,1,0,0,0,16,17,1,0,0,0,17,3,1,0,0,0,18,19,5,4,0,0,19,20,5,1,0,0,20,21,
3,6,3,0,21,22,5,2,0,0,22,5,1,0,0,0,23,24,5,3,0,0,24,27,3,6,3,0,25,27,5,5,
0,0,26,23,1,0,0,0,26,25,1,0,0,0,27,7,1,0,0,0,3,11,16,26];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class BinaryParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, "'('", "')'", "'>'", "'console.log'" ];
    static symbolicNames = [ null, null, null, "CONVERTIR", "CLG", "BINARY", 
                             "SPACES" ];
    static ruleNames = [ "file", "commands", "print", "expr" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = BinaryParser.ruleNames;
        this.literalNames = BinaryParser.literalNames;
        this.symbolicNames = BinaryParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	file() {
	    let localctx = new FileContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, BinaryParser.RULE_file);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 9; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 8;
	            this.commands();
	            this.state = 11; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===4);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	commands() {
	    let localctx = new CommandsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, BinaryParser.RULE_commands);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 14; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 13;
	        		this.print();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 16; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,1, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	print() {
	    let localctx = new PrintContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, BinaryParser.RULE_print);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 18;
	        this.match(BinaryParser.CLG);
	        this.state = 19;
	        this.match(BinaryParser.T__0);
	        this.state = 20;
	        this.expr();
	        this.state = 21;
	        this.match(BinaryParser.T__1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expr() {
	    let localctx = new ExprContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, BinaryParser.RULE_expr);
	    try {
	        this.state = 26;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 3:
	            localctx = new PlusSubtractionContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 23;
	            localctx.operation = this.match(BinaryParser.CONVERTIR);
	            this.state = 24;
	            this.expr();
	            break;
	        case 5:
	            localctx = new BinaryContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 25;
	            this.match(BinaryParser.BINARY);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

BinaryParser.EOF = antlr4.Token.EOF;
BinaryParser.T__0 = 1;
BinaryParser.T__1 = 2;
BinaryParser.CONVERTIR = 3;
BinaryParser.CLG = 4;
BinaryParser.BINARY = 5;
BinaryParser.SPACES = 6;

BinaryParser.RULE_file = 0;
BinaryParser.RULE_commands = 1;
BinaryParser.RULE_print = 2;
BinaryParser.RULE_expr = 3;

class FileContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = BinaryParser.RULE_file;
    }

	commands = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommandsContext);
	    } else {
	        return this.getTypedRuleContext(CommandsContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof BinaryVisitor ) {
	        return visitor.visitFile(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CommandsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = BinaryParser.RULE_commands;
    }

	print = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PrintContext);
	    } else {
	        return this.getTypedRuleContext(PrintContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof BinaryVisitor ) {
	        return visitor.visitCommands(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrintContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = BinaryParser.RULE_print;
    }

	CLG() {
	    return this.getToken(BinaryParser.CLG, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof BinaryVisitor ) {
	        return visitor.visitPrint(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExprContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = BinaryParser.RULE_expr;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class BinaryContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	BINARY() {
	    return this.getToken(BinaryParser.BINARY, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof BinaryVisitor ) {
	        return visitor.visitBinary(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

BinaryParser.BinaryContext = BinaryContext;

class PlusSubtractionContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        this.operation = null; // Token;
        super.copyFrom(ctx);
    }

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	CONVERTIR() {
	    return this.getToken(BinaryParser.CONVERTIR, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof BinaryVisitor ) {
	        return visitor.visitPlusSubtraction(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

BinaryParser.PlusSubtractionContext = PlusSubtractionContext;


BinaryParser.FileContext = FileContext; 
BinaryParser.CommandsContext = CommandsContext; 
BinaryParser.PrintContext = PrintContext; 
BinaryParser.ExprContext = ExprContext; 
