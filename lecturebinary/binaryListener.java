// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link binaryParser}.
 */
public interface binaryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link binaryParser#decimal_number}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_number(binaryParser.Decimal_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link binaryParser#decimal_number}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_number(binaryParser.Decimal_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link binaryParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(binaryParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link binaryParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(binaryParser.NumbersContext ctx);
}