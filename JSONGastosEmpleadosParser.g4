grammar JSONGastosEmpleadosParser;

import JSONGastosEmpleadosLexer;

@member{

  int empl=0;
  int gastoEmpleado=0;
  int gastoMensual=0;
  float promedioGasto=0.0;
  int cantObj=0;
  int cantArr=0;

}

programa: obj+;

obj:  OBJETO_ABRE
      CADENA_MES_INFORMADO
      SEPARADOR_NOMBRE
      VALOR_MES_INFORMADO
      SEPARADOR_VALOR
      CADENA_CODIGO_PROYECTO
      SEPARADOR_NOMBRE
      VALOR_CODIGO_PROYECTO
      SEPARADOR_VALOR
      empleados+
      OBJETO_CIERRA;

empleados:  CADENA_EMPLEADOS
            SEPARADOR_NOMBRE
            ARREGLO_ABRE
            OBJETO_ABRE
            CADENA_NOMBRE
            SEPARADOR_NOMBRE
            VALOR_NOMBRE
            SEPARADOR_VALOR
            CADENA_FECHA_ALTA
            SEPARADOR_NOMBRE
            VALOR_FECHA_ALTA
            SEPARADOR_VALOR
            CADENA_LEGAJO
            SEPARADOR_NOMBRE
            VALOR_LEGAJO
            SEPARADOR_VALOR
            gastos
            ARREGLO_CIERRA
            OBJETO_CIERRA
            SEPARADOR_VALOR;


gastos: CADENA_GASTOS
        SEPARADOR_NOMBRE
        ARREGLO_ABRE
        OBJETO_ABRE
        CADENA_FECHA
        SEPARADOR_NOMBRE
        VALOR_FECHA_GASTO
        SEPARADOR_VALOR
        CADENA_DESCRIPCION
        SEPARADOR_NOMBRE
        VALOR_DESCRIPCION
        SEPARADOR_VALOR
        CADENA_MONTO
        SEPARADOR_NOMBRE
        VALOR_MONTO
        OBJETO_CIERRA
        ARREGLO_CIERRA;
