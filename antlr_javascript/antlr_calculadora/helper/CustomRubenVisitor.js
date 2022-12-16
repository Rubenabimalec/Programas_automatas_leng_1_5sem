import CalculatorVisitor from "../rubenjs/CalculatorVisitor.js";
import CalculatorParser from "../rubenjs/CalculatorParser.js";
export default class customRubenVisitor extends CalculatorVisitor {
  memory = new Map();
  // Visit a parse tree produced by CalculatorParser#file.
  visitFile(ctx) {
    return this.visitChildren(ctx);
  }
  //visitar para imprimir
  visitPrint(ctx) {
    console.log("ESTOY EN LA IMPRESION");
    console.log(this.visit(ctx.expr()));
    return null;
  }

  // Visit a parse tree produced by CalculatorParser#asign.
  visitAsign(ctx) {
    const variablename = ctx.VARIABLE().getText();
    const value = this.visit(ctx.expr());
    this.memory.set(variablename, value);
    //investigar  como usar el map en javascript
    return "";
  }

  // Visit a parse tree produced by CalculatorParser#timesDiv.
  visitTimesDiv(ctx) {
    console.log("estoy en MULT/DIV");
    const NumA = this.visit(ctx.expr(0));
    const NumB = this.visit(ctx.expr(1));
    if (ctx.operation.type === CalculatorParser.TIMES) {
      return NumA * NumB;
    }
    return NumA / NumB;
    // return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CalculatorParser#number.
  visitNumber(ctx) {
    //console.log(typeof ctx.NUMBER().getText());
    return Number(ctx.NUMBER().getText());
  }
  // Visit a parse tree produced by CalculatorParser#parent.
  visitParent(ctx) {
    return this.visit(ctx.expr());
  }

  // Visit a parse tree produced by CalculatorParser#plusSubtraction.
  visitPlusSubtraction(ctx) {
    console.log("estoy en sum/res");
    const NumA = this.visit(ctx.expr(0));
    const NumB = this.visit(ctx.expr(1));
    if (ctx.operation.type === CalculatorParser.PLUS) {
      return NumA + NumB;
    }
    return NumA - NumB;
    //const NumC = NumA + NumB;
    //console.log(this.visit(ctx.expr()));
    //return this.visitChildren(ctx);
  }
  // Visit a parse tree produced by CalculatorParser#variable.
  visitVariable(ctx) {
    const variablename = ctx.VARIABLE().getText();
    if (this.memory.has(variablename)) {
      return this.memory.get(variablename);
    }
    throw new Error("la variable no existe");
  }
}
