grammar JSONGastosEmpleadosParser;

import JSONGastosEmpleadosLexer;

@member{

  int cont=0;
  int suma=0;

}

programa: OBJ+;

OBJ: OBJETO_ABRE
