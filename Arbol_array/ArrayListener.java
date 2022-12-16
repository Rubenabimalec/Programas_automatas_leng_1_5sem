// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayParser}.
 */
public interface ArrayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ArrayParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ArrayParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ArrayParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ArrayParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(ArrayParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(ArrayParser.DataContext ctx);
}