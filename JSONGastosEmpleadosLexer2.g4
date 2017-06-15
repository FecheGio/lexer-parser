lexer grammar JSONGastosEmpleadosLexer;

// TOKENS ESPECIFICOS DE FORMATO JSON
OBJETO_ABRE: '{';
OBJETO_CIERRA: '}';
ARREGLO_ABRE: '[';
ARREGLO_CIERRA: ']';
SEPARADOR_NOMBRE: ':';
SEPARADOR_VALOR: ',';
//TOKENS DE NOMBRES DE PARES:
CADENA_MES_INFORMADO: '"' 'MesInformado' '"';
CADENA_CODIGO_PROYECTO: '"' 'CodigoProyecto' '"';
CADENA_EMPLEADOS: '"' 'Empleados' '"';
CADENA_NOMBRE: '"' 'Nombre' '"';
CADENA_FECHA_ALTA: '"' 'FechaAlta' '"';
CADENA_LEGAJO: '"' 'Legajo' '"';
CADENA_GASTOS: '"' 'Gastos' '"';
CADENA_FECHA: '"' 'Fecha' '"';
CADENA_DESCRIPCION: '"' 'Descripcion' '"';
CADENA_MONTO: '"' 'Monto' '"';
//TOKENS DE VALORES DE PARES
VALOR_MES_INFORMADO: '"' MES_CHAR ' ' ANNO '"';
VALOR_CODIGO_PROYECTO: '"' CHAR_MAY CHAR_MAY CHAR_MAY '_' INT INT INT INT '/' ANNO '"';
VALOR_NOMBRE: '"' NOMBRE_APELLIDO '"';
VALOR_FECHA_ALTA: '"' FECHA_USA '"';
VALOR_LEGAJO: '"' LEGAJO '"';
VALOR_FECHA_GASTO: '"' FECHA '"';
VALOR_MONTO: (INT_NAT INT+ '.' INT+ | INT_NAT+ INT* | INT_NAT+ '.' INT+);
VALOR_DESCRIPCION: ('"' STRING_CAP '"' | '"' STRING_CAP_ESPACIO+ STRING_CAP '"');


//REGLAS PARA FECHAS Y AÑOS
FECHA_USA : MES_NUM'-'DIA'-'ANNO;
FECHA : DIA'/'MES_NUM'/'ANNO;

DIA : ('0'[0-9] | [1-2][0-9] | '3'[0-1]);

MES_NUM : ('0'[0-9] | '1'[0-2]);

ANNO : ('1'[0-9][0-9][0-9] | '2'[0][0-9][0-9] | '2100');

MES_CHAR : ('ENERO' |
           'FEBRERO' |
           'MARZO' |
           'ABRIL' |
           'MAYO' |
           'JUNIO' |
           'JULIO' |
           'AGOSTO' |
           'SEPTIEMBRE' |
           'OCTUBRE' |
           'NOVIEMBRE' |
           'DICIEMBRE');

//PAR NOMBRE APELLIDO
NOMBRE_APELLIDO : STRING_CAP ',' ' ' STRING_CAP;

STRING_CAP: CHAR_MAY | CHAR_MAY STRING_NORMAL;
STRING_CAP_ESPACIO: STRING_CAP ' ';
LEGAJO : INT INT INT INT INT;
STRING_NORMAL : [a-z]+;
CHAR_MAY: [A-Z];
INT: [0-9];
INT_NAT: [1-9];

NEWLINE:'\r'? '\n';

WS : [ \t]+ -> skip ;
