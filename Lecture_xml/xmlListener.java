// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmlParser}.
 */
public interface xmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmlParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(xmlParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(xmlParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(xmlParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(xmlParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(xmlParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(xmlParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tag(xmlParser.Open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tag(xmlParser.Open_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(xmlParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(xmlParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterClose_tag(xmlParser.Close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitClose_tag(xmlParser.Close_tagContext ctx);
}