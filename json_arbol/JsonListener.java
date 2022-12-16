// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JsonParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JsonParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(JsonParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(JsonParser.TextContext ctx);
}