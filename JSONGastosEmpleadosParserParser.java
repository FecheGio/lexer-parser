// Generated from JSONGastosEmpleadosParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONGastosEmpleadosParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OBJETO_ABRE=1, OBJETO_CIERRA=2, ARREGLO_ABRE=3, ARREGLO_CIERRA=4, SEPARADOR_NOMBRE=5, 
		SEPARADOR_VALOR=6, CADENA_MES_INFORMADO=7, CADENA_CODIGO_PROYECTO=8, CADENA_EMPLEADOS=9, 
		CADENA_NOMBRE=10, CADENA_FECHA_ALTA=11, CADENA_LEGAJO=12, CADENA_GASTOS=13, 
		CADENA_FECHA=14, CADENA_DESCRIPCION=15, CADENA_MONTO=16, VALOR_MES_INFORMADO=17, 
		VALOR_CODIGO_PROYECTO=18, VALOR_NOMBRE=19, VALOR_FECHA_ALTA=20, VALOR_LEGAJO=21, 
		VALOR_FECHA_GASTO=22, VALOR_MONTO=23, VALOR_DESCRIPCION=24, FECHA_USA=25, 
		FECHA=26, DIA=27, MES_NUM=28, ANNO=29, MES_CHAR=30, NOMBRE_APELLIDO=31, 
		STRING_CAP=32, STRING_CAP_ESPACIO=33, LEGAJO=34, STRING_NORMAL=35, CHAR_MAY=36, 
		INT=37, INT_NAT=38, NEWLINE=39, WS=40;
	public static final int
		RULE_programa = 0, RULE_obj = 1, RULE_empleados = 2, RULE_gastos = 3;
	public static final String[] ruleNames = {
		"programa", "obj", "empleados", "gastos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OBJETO_ABRE", "OBJETO_CIERRA", "ARREGLO_ABRE", "ARREGLO_CIERRA", 
		"SEPARADOR_NOMBRE", "SEPARADOR_VALOR", "CADENA_MES_INFORMADO", "CADENA_CODIGO_PROYECTO", 
		"CADENA_EMPLEADOS", "CADENA_NOMBRE", "CADENA_FECHA_ALTA", "CADENA_LEGAJO", 
		"CADENA_GASTOS", "CADENA_FECHA", "CADENA_DESCRIPCION", "CADENA_MONTO", 
		"VALOR_MES_INFORMADO", "VALOR_CODIGO_PROYECTO", "VALOR_NOMBRE", "VALOR_FECHA_ALTA", 
		"VALOR_LEGAJO", "VALOR_FECHA_GASTO", "VALOR_MONTO", "VALOR_DESCRIPCION", 
		"FECHA_USA", "FECHA", "DIA", "MES_NUM", "ANNO", "MES_CHAR", "NOMBRE_APELLIDO", 
		"STRING_CAP", "STRING_CAP_ESPACIO", "LEGAJO", "STRING_NORMAL", "CHAR_MAY", 
		"INT", "INT_NAT", "NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JSONGastosEmpleadosParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONGastosEmpleadosParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			obj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode OBJETO_ABRE() { return getToken(JSONGastosEmpleadosParserParser.OBJETO_ABRE, 0); }
		public TerminalNode CADENA_MES_INFORMADO() { return getToken(JSONGastosEmpleadosParserParser.CADENA_MES_INFORMADO, 0); }
		public List<TerminalNode> SEPARADOR_NOMBRE() { return getTokens(JSONGastosEmpleadosParserParser.SEPARADOR_NOMBRE); }
		public TerminalNode SEPARADOR_NOMBRE(int i) {
			return getToken(JSONGastosEmpleadosParserParser.SEPARADOR_NOMBRE, i);
		}
		public TerminalNode VALOR_MES_INFORMADO() { return getToken(JSONGastosEmpleadosParserParser.VALOR_MES_INFORMADO, 0); }
		public List<TerminalNode> SEPARADOR_VALOR() { return getTokens(JSONGastosEmpleadosParserParser.SEPARADOR_VALOR); }
		public TerminalNode SEPARADOR_VALOR(int i) {
			return getToken(JSONGastosEmpleadosParserParser.SEPARADOR_VALOR, i);
		}
		public TerminalNode CADENA_CODIGO_PROYECTO() { return getToken(JSONGastosEmpleadosParserParser.CADENA_CODIGO_PROYECTO, 0); }
		public TerminalNode VALOR_CODIGO_PROYECTO() { return getToken(JSONGastosEmpleadosParserParser.VALOR_CODIGO_PROYECTO, 0); }
		public TerminalNode CADENA_EMPLEADOS() { return getToken(JSONGastosEmpleadosParserParser.CADENA_EMPLEADOS, 0); }
		public TerminalNode ARREGLO_ABRE() { return getToken(JSONGastosEmpleadosParserParser.ARREGLO_ABRE, 0); }
		public TerminalNode OBJETO_CIERRA() { return getToken(JSONGastosEmpleadosParserParser.OBJETO_CIERRA, 0); }
		public TerminalNode ARREGLO_CIERRA() { return getToken(JSONGastosEmpleadosParserParser.ARREGLO_CIERRA, 0); }
		public List<EmpleadosContext> empleados() {
			return getRuleContexts(EmpleadosContext.class);
		}
		public EmpleadosContext empleados(int i) {
			return getRuleContext(EmpleadosContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(OBJETO_ABRE);
			setState(11);
			match(CADENA_MES_INFORMADO);
			setState(12);
			match(SEPARADOR_NOMBRE);
			setState(13);
			match(VALOR_MES_INFORMADO);
			setState(14);
			match(SEPARADOR_VALOR);
			setState(15);
			match(CADENA_CODIGO_PROYECTO);
			setState(16);
			match(SEPARADOR_NOMBRE);
			setState(17);
			match(VALOR_CODIGO_PROYECTO);
			setState(18);
			match(SEPARADOR_VALOR);
			setState(19);
			match(CADENA_EMPLEADOS);
			setState(20);
			match(SEPARADOR_NOMBRE);
			setState(21);
			match(ARREGLO_ABRE);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					empleados();
					setState(23);
					match(SEPARADOR_VALOR);
					}
					break;
				case 2:
					{
					setState(25);
					empleados();
					}
					break;
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OBJETO_ABRE );
			setState(30);
			match(OBJETO_CIERRA);
			setState(31);
			match(ARREGLO_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmpleadosContext extends ParserRuleContext {
		public TerminalNode OBJETO_ABRE() { return getToken(JSONGastosEmpleadosParserParser.OBJETO_ABRE, 0); }
		public TerminalNode CADENA_NOMBRE() { return getToken(JSONGastosEmpleadosParserParser.CADENA_NOMBRE, 0); }
		public List<TerminalNode> SEPARADOR_NOMBRE() { return getTokens(JSONGastosEmpleadosParserParser.SEPARADOR_NOMBRE); }
		public TerminalNode SEPARADOR_NOMBRE(int i) {
			return getToken(JSONGastosEmpleadosParserParser.SEPARADOR_NOMBRE, i);
		}
		public TerminalNode VALOR_NOMBRE() { return getToken(JSONGastosEmpleadosParserParser.VALOR_NOMBRE, 0); }
		public List<TerminalNode> SEPARADOR_VALOR() { return getTokens(JSONGastosEmpleadosParserParser.SEPARADOR_VALOR); }
		public TerminalNode SEPARADOR_VALOR(int i) {
			return getToken(JSONGastosEmpleadosParserParser.SEPARADOR_VALOR, i);
		}
		public TerminalNode CADENA_FECHA_ALTA() { return getToken(JSONGastosEmpleadosParserParser.CADENA_FECHA_ALTA, 0); }
		public TerminalNode VALOR_FECHA_ALTA() { return getToken(JSONGastosEmpleadosParserParser.VALOR_FECHA_ALTA, 0); }
		public TerminalNode CADENA_LEGAJO() { return getToken(JSONGastosEmpleadosParserParser.CADENA_LEGAJO, 0); }
		public TerminalNode VALOR_LEGAJO() { return getToken(JSONGastosEmpleadosParserParser.VALOR_LEGAJO, 0); }
		public TerminalNode CADENA_GASTOS() { return getToken(JSONGastosEmpleadosParserParser.CADENA_GASTOS, 0); }
		public TerminalNode ARREGLO_ABRE() { return getToken(JSONGastosEmpleadosParserParser.ARREGLO_ABRE, 0); }
		public TerminalNode ARREGLO_CIERRA() { return getToken(JSONGastosEmpleadosParserParser.ARREGLO_CIERRA, 0); }
		public TerminalNode OBJETO_CIERRA() { return getToken(JSONGastosEmpleadosParserParser.OBJETO_CIERRA, 0); }
		public List<GastosContext> gastos() {
			return getRuleContexts(GastosContext.class);
		}
		public GastosContext gastos(int i) {
			return getRuleContext(GastosContext.class,i);
		}
		public EmpleadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empleados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).enterEmpleados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).exitEmpleados(this);
		}
	}

	public final EmpleadosContext empleados() throws RecognitionException {
		EmpleadosContext _localctx = new EmpleadosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_empleados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(OBJETO_ABRE);
			setState(34);
			match(CADENA_NOMBRE);
			setState(35);
			match(SEPARADOR_NOMBRE);
			setState(36);
			match(VALOR_NOMBRE);
			setState(37);
			match(SEPARADOR_VALOR);
			setState(38);
			match(CADENA_FECHA_ALTA);
			setState(39);
			match(SEPARADOR_NOMBRE);
			setState(40);
			match(VALOR_FECHA_ALTA);
			setState(41);
			match(SEPARADOR_VALOR);
			setState(42);
			match(CADENA_LEGAJO);
			setState(43);
			match(SEPARADOR_NOMBRE);
			setState(44);
			match(VALOR_LEGAJO);
			setState(45);
			match(SEPARADOR_VALOR);
			setState(46);
			match(CADENA_GASTOS);
			setState(47);
			match(SEPARADOR_NOMBRE);
			setState(48);
			match(ARREGLO_ABRE);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(49);
					gastos();
					setState(50);
					match(SEPARADOR_VALOR);
					}
					break;
				case 2:
					{
					setState(52);
					gastos();
					}
					break;
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OBJETO_ABRE );
			setState(57);
			match(ARREGLO_CIERRA);
			setState(58);
			match(OBJETO_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GastosContext extends ParserRuleContext {
		public TerminalNode OBJETO_ABRE() { return getToken(JSONGastosEmpleadosParserParser.OBJETO_ABRE, 0); }
		public TerminalNode CADENA_FECHA() { return getToken(JSONGastosEmpleadosParserParser.CADENA_FECHA, 0); }
		public List<TerminalNode> SEPARADOR_NOMBRE() { return getTokens(JSONGastosEmpleadosParserParser.SEPARADOR_NOMBRE); }
		public TerminalNode SEPARADOR_NOMBRE(int i) {
			return getToken(JSONGastosEmpleadosParserParser.SEPARADOR_NOMBRE, i);
		}
		public TerminalNode VALOR_FECHA_GASTO() { return getToken(JSONGastosEmpleadosParserParser.VALOR_FECHA_GASTO, 0); }
		public List<TerminalNode> SEPARADOR_VALOR() { return getTokens(JSONGastosEmpleadosParserParser.SEPARADOR_VALOR); }
		public TerminalNode SEPARADOR_VALOR(int i) {
			return getToken(JSONGastosEmpleadosParserParser.SEPARADOR_VALOR, i);
		}
		public TerminalNode CADENA_DESCRIPCION() { return getToken(JSONGastosEmpleadosParserParser.CADENA_DESCRIPCION, 0); }
		public TerminalNode VALOR_DESCRIPCION() { return getToken(JSONGastosEmpleadosParserParser.VALOR_DESCRIPCION, 0); }
		public TerminalNode CADENA_MONTO() { return getToken(JSONGastosEmpleadosParserParser.CADENA_MONTO, 0); }
		public TerminalNode VALOR_MONTO() { return getToken(JSONGastosEmpleadosParserParser.VALOR_MONTO, 0); }
		public TerminalNode OBJETO_CIERRA() { return getToken(JSONGastosEmpleadosParserParser.OBJETO_CIERRA, 0); }
		public GastosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gastos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).enterGastos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONGastosEmpleadosParserListener ) ((JSONGastosEmpleadosParserListener)listener).exitGastos(this);
		}
	}

	public final GastosContext gastos() throws RecognitionException {
		GastosContext _localctx = new GastosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gastos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(OBJETO_ABRE);
			setState(61);
			match(CADENA_FECHA);
			setState(62);
			match(SEPARADOR_NOMBRE);
			setState(63);
			match(VALOR_FECHA_GASTO);
			setState(64);
			match(SEPARADOR_VALOR);
			setState(65);
			match(CADENA_DESCRIPCION);
			setState(66);
			match(SEPARADOR_NOMBRE);
			setState(67);
			match(VALOR_DESCRIPCION);
			setState(68);
			match(SEPARADOR_VALOR);
			setState(69);
			match(CADENA_MONTO);
			setState(70);
			match(SEPARADOR_NOMBRE);
			setState(71);
			match(VALOR_MONTO);
			setState(72);
			match(OBJETO_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*M\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\48"+
		"\n\4\r\4\16\49\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2L\2\n\3\2\2\2\4\f\3\2\2\2\6#\3\2\2"+
		"\2\b>\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\7\3\2\2\r\16\7\t\2\2\16\17"+
		"\7\7\2\2\17\20\7\23\2\2\20\21\7\b\2\2\21\22\7\n\2\2\22\23\7\7\2\2\23\24"+
		"\7\24\2\2\24\25\7\b\2\2\25\26\7\13\2\2\26\27\7\7\2\2\27\34\7\5\2\2\30"+
		"\31\5\6\4\2\31\32\7\b\2\2\32\35\3\2\2\2\33\35\5\6\4\2\34\30\3\2\2\2\34"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7"+
		"\4\2\2!\"\7\6\2\2\"\5\3\2\2\2#$\7\3\2\2$%\7\f\2\2%&\7\7\2\2&\'\7\25\2"+
		"\2\'(\7\b\2\2()\7\r\2\2)*\7\7\2\2*+\7\26\2\2+,\7\b\2\2,-\7\16\2\2-.\7"+
		"\7\2\2./\7\27\2\2/\60\7\b\2\2\60\61\7\17\2\2\61\62\7\7\2\2\62\67\7\5\2"+
		"\2\63\64\5\b\5\2\64\65\7\b\2\2\658\3\2\2\2\668\5\b\5\2\67\63\3\2\2\2\67"+
		"\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\6\2\2<=\7\4"+
		"\2\2=\7\3\2\2\2>?\7\3\2\2?@\7\20\2\2@A\7\7\2\2AB\7\30\2\2BC\7\b\2\2CD"+
		"\7\21\2\2DE\7\7\2\2EF\7\32\2\2FG\7\b\2\2GH\7\22\2\2HI\7\7\2\2IJ\7\31\2"+
		"\2JK\7\4\2\2K\t\3\2\2\2\6\34\36\679";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}