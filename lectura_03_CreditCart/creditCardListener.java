// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link creditCardParser}.
 */
public interface creditCardListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link creditCardParser#creditCard}.
	 * @param ctx the parse tree
	 */
	void enterCreditCard(creditCardParser.CreditCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link creditCardParser#creditCard}.
	 * @param ctx the parse tree
	 */
	void exitCreditCard(creditCardParser.CreditCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link creditCardParser#cards}.
	 * @param ctx the parse tree
	 */
	void enterCards(creditCardParser.CardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link creditCardParser#cards}.
	 * @param ctx the parse tree
	 */
	void exitCards(creditCardParser.CardsContext ctx);
}