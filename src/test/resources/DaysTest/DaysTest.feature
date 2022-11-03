#language:es

Característica: Days BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

    @CrearDia
  Esquema del escenario: Creacion de días en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea un nuevo dia con nombre <nombreDia>
    Entonces El usuario deberia de visualizar un mensaje de creación de dia exitosa

    Ejemplos:
      | user                   | pass  | opcion |nombreDia|
      | dsuarez@robinfood.com | 1000729488 | Menu   | juev |

  @editDay
  Esquema del escenario: Edición de días en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario edita un dia con los datos <diaAEditar> y <nombreNuevoDia>
    Entonces El usuario deberia de visualizar un mensaje de dia exitosa

    Ejemplos:
      | user                   | pass  | opcion |diaAEditar|nombreNuevoDia|
      | dsuarez@robinfood.com | 1000729488 | Menu   | juev |juev festi|

    @CreacionDiaExistente
  Esquema del escenario: Creacion de día existente en la pagina BCC
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea un nuevo dia con nombre <nombreDia>
    Entonces El usuario deberia de visualizar un mensaje de dia ya existente

    Ejemplos:
      | user                   | pass  | opcion |nombreDia|
      | dsuarez@robinfood.com | 1000729488 | Menu   | Monday |


  @borrarDiaEntreSemana
  Esquema del escenario: Borrar dia entre semana fallido
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario intenta borrar un dia entre semana <dayToDelete>
    Entonces El usuario deberia de visualizar un mensaje de borrado fallido

    Ejemplos:
      | user                   | pass  | opcion |dayToDelete|
      | dsuarez@robinfood.com | 1000729488 | Menu   | Tuesday |