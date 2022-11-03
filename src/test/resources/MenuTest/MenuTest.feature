#language:es

Característica: Menu BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

    @createMenu
    Esquema del escenario: Creacion de menu en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea un nuevo menu con los datos flujo <flujo> y nombreFlujo <nombreFlujo>
    Entonces El usuario debe ver un mensaje de creación exitosa

    Ejemplos:
      | user                  | pass       | opcion | flujo         | nombreFlujo                           |
      | dsuarez@robinfood.com | 1000729488 | Menu   | Pedir en caja | Mcchuleta nuevo producto extra grande |

     @edit
     Esquema del escenario: Edicion de menu en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario edita el menu con los siguientes datos <nombreAEditar> nuevo flujo <flujoNuevo> y nombre de la tienda <nombreTienda>
    Entonces El usuario debe ver un mensaje de actualizacion exitosa

    Ejemplos:
      | user                  | pass       | opcion | flujoNuevo    | nombreAEditar | nombreTienda |
      | dsuarez@robinfood.com | 1000729488 | Menu   | Pedir en caja | adffsv        | MUY 116      |


    @changeState
    Esquema del escenario: Cambiar el estado a un menu exitososamente
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario cambia el estado de un menu especifico <nombreMenu>
    Entonces El usuario deberia ver un mensaje de actualizacion de estado exitosa

    Ejemplos:
      | user                  | pass       | opcion | nombreMenu    |
      | dsuarez@robinfood.com | 1000729488 | Menu   | El super original |