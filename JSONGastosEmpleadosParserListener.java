// Generated from JSONGastosEmpleadosParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONGastosEmpleadosParserParser}.
 */
public interface JSONGastosEmpleadosParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONGastosEmpleadosParserParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JSONGastosEmpleadosParserParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGastosEmpleadosParserParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JSONGastosEmpleadosParserParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGastosEmpleadosParserParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JSONGastosEmpleadosParserParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGastosEmpleadosParserParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JSONGastosEmpleadosParserParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGastosEmpleadosParserParser#empleados}.
	 * @param ctx the parse tree
	 */
	void enterEmpleados(JSONGastosEmpleadosParserParser.EmpleadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGastosEmpleadosParserParser#empleados}.
	 * @param ctx the parse tree
	 */
	void exitEmpleados(JSONGastosEmpleadosParserParser.EmpleadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONGastosEmpleadosParserParser#gastos}.
	 * @param ctx the parse tree
	 */
	void enterGastos(JSONGastosEmpleadosParserParser.GastosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONGastosEmpleadosParserParser#gastos}.
	 * @param ctx the parse tree
	 */
	void exitGastos(JSONGastosEmpleadosParserParser.GastosContext ctx);
}