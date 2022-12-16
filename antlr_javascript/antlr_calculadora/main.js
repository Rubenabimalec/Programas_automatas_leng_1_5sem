"use strict";
import antlr4 from "antlr4";
import CalculatorLexer from "../antlr_calculadora/rubenjs/CalculatorLexer.js";
import CalculatorParser from "../antlr_calculadora/rubenjs/CalculatorParser.js";
import CustomRubenVisitor from "./helper/CustomRubenVisitor.js";
//import CalculatorVisitor from "../antlr_calculadora/rubenjs/CalculatorVisitor.js";
//import CustomVisitor from "./rubenjs/CalculatorVisitor";
// document.querySelector('.user-input').textContent = 'hi from antlr4'

const input = `
a=34;
b=5;
c=a*b;
console.log(c);

`;
const chars = new antlr4.InputStream(input);
const lexer = new CalculatorLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new CalculatorParser(tokens);
parser.buildParseTrees = true;
const tree = parser.file();
const visitor = new CustomRubenVisitor(); //ponemos nuestro custome generado por el usuario
visitor.visitFile(tree);
