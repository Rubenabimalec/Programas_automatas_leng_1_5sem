import BinaryVisitor from "../rubenjs/BinaryVisitor.js";
import BinaryParser from "../rubenjs/BinaryParser.js";
export default class CustomRubenVisitor extends BinaryVisitor {
  // Visit a parse tree produced by BinaryParser#file.
  visitFile(ctx) {
    console.log("estoy en file");
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by BinaryParser#print.
  visitPrint(ctx) {
    console.log("estoy en imprimiendo");
    console.log(this.visit(ctx.expr(0)));
    return null;
  }
  // Visit a parse tree produced by BinaryParser#plusSubtraction.
  visitPlusSubtraction(ctx) {
    console.log("Convirtiendo binario a decimal.....");
    const NumA = this.visit(ctx.expr());
    const bitCount = NumA.length;
    let decimal = 0;
    for (let i = 0; i < bitCount; i++) {
      let posicion = bitCount - 1 - i; //posision de al inversa de i
      let potencia_base = 2 ** i; //elevando a la base de el valor i
      decimal = decimal + NumA[posicion] * potencia_base;
    }
    return decimal;
    /**console.log(
      "El numero en binario es: " + NumA + "y en decimal es: " + decimal
    )*/
    // forma facil y rapida return parseInt(NumA,2);
  }

  // Visit a parse tree produced by BinaryParser#binary.
  visitBinary(ctx) {
    //console.log(ctx.BINARY().getText());
    //const NumA = this.visit(ctx.expr(0));
    //console.log(ctx.BINARY().getText());
    return ctx.BINARY().getText();
  }
}
