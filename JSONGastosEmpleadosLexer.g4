lexer grammar JSONGastosEmpleadosLexer;

// TOKENS ESPECIFICOS DE FORMATO JSON
OBJETO_ABRE: '{' {System.out.println("OBJETO_ABRE");};
OBJETO_CIERRA: '}' {System.out.println("OBJETO_CIERRA");};
ARREGLO_ABRE: '[' {System.out.println("ARREGLO_ABRE");};
RREGLO_CIERRA: ']' {System.out.println("ARREGLO_CIERRA");};
SEPARADOR_NOMBRE: ':' {System.out.println("SEPARADOR_NOMBRE");};
SEPARADOR_VALOR: ',' {System.out.println("SEPARADOR_VALOR");};
//TOKENS DE NOMBRES DE PARES:
CADENA_MES_INFORMADO: '"' 'MesInformado' '"' {System.out.println("CADENA_MES_INFORMADO");};
CADENA_CODIGO_PROYECTO: '"' 'CodigoProyecto' '"' {System.out.println("CADENA_CODIGO_PROYECTO");};
CADENA_EMPLEADOS: '"' 'Empleados' '"' {System.out.println("CADENA_EMPLEADOS");};
CADENA_NOMBRE: '"' 'Nombre' '"' {System.out.println("CADENA_NOMBRE");};
CADENA_FECHA_ALTA: '"' 'FechaAlta' '"' {System.out.println("CADENA_FECHA_ALTA");};
CADENA_LEGAJO: '"' 'Legajo' '"' {System.out.println("CADENA_LEGAJO");};
CADENA_GASTOS: '"' 'Gastos' '"' {System.out.println("CADENA_GASTOS");};
CADENA_FECHA: '"' 'Fecha' '"' {System.out.println("CADENA_FECHA");};
CADENA_DESCRIPCION: '"' 'Descripcion' '"' {System.out.println("CADENA_DESCRIPCION");};
CADENA_MONTO: '"' 'Monto' '"' {System.out.println("CADENA_MONTO");};
//TOKENS DE VALORES DE PARES
VALOR_MES_INFORMADO: '"' MES_CHAR ' ' ANNO '"' {System.out.println("VALOR_MES_INFORMADO: "+getText());};
VALOR_CODIGO_PROYECTO: '"' CHAR_MAY CHAR_MAY CHAR_MAY '_' INT INT INT INT '/' ANNO '"' {System.out.println("VALOR_CODIGO_PROYECTO: "+getText());};
VALOR_NOMBRE: '"' NOMBRE_APELLIDO '"'{System.out.println("VALOR_NOMBRE: "+getText());};
VALOR_FECHA_ALTA: '"' FECHA_USA '"'{System.out.println("VALOR_FECHA_ALTA: "+getText());};
VALOR_LEGAJO: '"' LEGAJO '"' {System.out.println("VALOR_LEGAJO: "+getText());};
VALOR_FECHA_GASTO: '"' FECHA '"' {System.out.println("VALOR_FECHA_GASTO: "+getText());};
VALOR_MONTO: (INT_NAT INT+ '.' INT+ | INT_NAT+ INT* | INT_NAT+ '.' INT+) {System.out.println("VALOR_MONTO: "+getText());};
VALOR_DESCRIPCION: ('"' STRING_CAP '"' | '"' STRING_CAP_ESPACIO+ STRING_CAP '"') {System.out.println("VALOR_DESCRIPCION: "+getText());};


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
