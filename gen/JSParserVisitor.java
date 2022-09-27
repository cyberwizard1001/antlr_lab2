// Generated from C:/Users/nirma/IdeaProjects/antlr_lab2/src\JSParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSParserParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(JSParserParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JSParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(JSParserParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JSParserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(JSParserParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(JSParserParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(JSParserParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(JSParserParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParserParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(JSParserParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(JSParserParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(JSParserParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(JSParserParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomic}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(JSParserParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(JSParserParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(JSParserParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(JSParserParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(JSParserParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(JSParserParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additive}
	 * labeled alternative in {@link JSParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(JSParserParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(JSParserParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JSParserParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(JSParserParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(JSParserParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JSParserParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link JSParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(JSParserParser.NilContext ctx);
}