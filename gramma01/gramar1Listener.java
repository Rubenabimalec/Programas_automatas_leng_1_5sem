// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramar1Parser}.
 */
public interface gramar1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramar1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramar1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramar1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramar1Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramar1Parser#gramar1}.
	 * @param ctx the parse tree
	 */
	void enterGramar1(gramar1Parser.Gramar1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramar1Parser#gramar1}.
	 * @param ctx the parse tree
	 */
	void exitGramar1(gramar1Parser.Gramar1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramar1Parser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(gramar1Parser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramar1Parser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(gramar1Parser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramar1Parser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tag(gramar1Parser.Open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramar1Parser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tag(gramar1Parser.Open_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramar1Parser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(gramar1Parser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramar1Parser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(gramar1Parser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramar1Parser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterClose_tag(gramar1Parser.Close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramar1Parser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitClose_tag(gramar1Parser.Close_tagContext ctx);
}