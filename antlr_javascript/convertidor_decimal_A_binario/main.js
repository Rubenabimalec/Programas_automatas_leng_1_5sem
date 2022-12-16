"use strict";
import antlr4 from "antlr4";
import BinaryLexer from "../binary/rubenjs/BinaryLexer.js";
import BinaryParser from "../binary/rubenjs/BinaryParser.js";
import CustomRubenVisitor from "./helper/CustomRubenVisitor.js";
//import CalculatorVisitor from "../antlr_calculadora/rubenjs/CalculatorVisitor.js";
//import CustomVisitor from "./rubenjs/CalculatorVisitor";
// document.querySelector('.user-input').textContent = 'hi from antlr4'

const input = `
console.log(>0100110001)
console.log(>01001)

`;
const chars = new antlr4.InputStream(input);
const lexer = new BinaryLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new BinaryParser(tokens);
parser.buildParseTrees = true;
const tree = parser.file();
const visitor = new CustomRubenVisitor(); //ponemos nuestro custome generado por el usuario
visitor.visitFile(tree);
