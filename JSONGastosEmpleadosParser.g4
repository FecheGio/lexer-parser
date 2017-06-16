grammar JSONGastosEmpleadosParser;

import JSONGastosEmpleadosLexer2;

@member{

  int empl=0;
  float gastoEmpleado=0;
  float gastoMensual=0;
  float promedioGasto=0.0;
  int cantObj=0;
  int cantArr=0;
  String nombre="";

  }

programa: obj {

  System.out.println("Cant. total de gastos por empleado: ");
  System.out.print(nombre);
  System.out.print("Cant. total de empleados informados: " + empl);
  System.out.print("Promedio de gastos realizados por empleado: "(gastoMensual/empl));
  System.out.print("Cantidad total de objetos JSON en el archivo: " cantObj);
  System.out.print("Cantidad total de arreglos JSON en el archivo: " cantArr);

};

obj:  {cantObj++;}
      OBJETO_ABRE
      CADENA_MES_INFORMADO
      SEPARADOR_NOMBRE
      VALOR_MES_INFORMADO
      SEPARADOR_VALOR
      CADENA_CODIGO_PROYECTO
      SEPARADOR_NOMBRE
      VALOR_CODIGO_PROYECTO
      SEPARADOR_VALOR
      CADENA_EMPLEADOS
      SEPARADOR_NOMBRE
      ARREGLO_ABRE
      (empleados SEPARADOR_VALOR | empleados)+
      OBJETO_CIERRA
      ARREGLO_CIERRA;

empleados:  OBJETO_ABRE
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
            CADENA_GASTOS
            SEPARADOR_NOMBRE
            ARREGLO_ABRE
            (gastos SEPARADOR_VALOR | gastos)+
            ARREGLO_CIERRA
            OBJETO_CIERRA
            { nombre = nombre + String.valueOf($VALOR_NOMBRE.text) + ": " + String.valueOf(gastoEmpleado) + "\r\n";
              gastoEmpleado = 0;
              empl++;
              cantObj++;
              cantArr++};

gastos:
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
        {gastoEmpleado = gastoEmpleado + Float.parseFloat($VALOR_MONTO.text);
         gastoMensual = gastoMensual + Float.parseFloat($VALOR_MONTO.text);
         cantArr++
         cantObj++};

ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
