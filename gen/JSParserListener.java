// Generated from C:/Users/nirma/IdeaProjects/antlr_lab2/src\JSParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSParserParser}.
 */
public interface JSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSParserParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(JSParserParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(JSParserParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JSParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JSParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(JSParserParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(JSParserParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JSParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JSParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(JSParserParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(JSParserParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(JSParserParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(JSParserParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(JSParserParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(JSParserParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(JSParserParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(JSParserParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParserParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(JSParserParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParserParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(JSParserParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(JSParserParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(JSParserParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(JSParserParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(JSParserParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(JSParserParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(JSParserParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomic}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(JSParserParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomic}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(JSParserParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(JSParserParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(JSParserParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelational(JSParserParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelational(JSParserParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(JSParserParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(JSParserParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(JSParserParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(JSParserParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(JSParserParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(JSParserParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additive}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(JSParserParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additive}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(JSParserParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPar(JSParserParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPar(JSParserParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JSParserParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JSParserParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(JSParserParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(JSParserParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterId(JSParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitId(JSParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterString(JSParserParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitString(JSParserParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nil}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNil(JSParserParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNil(JSParserParser.NilContext ctx);
}