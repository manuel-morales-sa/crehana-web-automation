#language:es

Característica: Hall BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  Esquema del escenario: Creacion de pasillo en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea un nuevo pasillo con nombre <nombrePasillo>
    Entonces El usuario debe ver un mensaje de creación de pasillo exitosa

    Ejemplos:
      | user                   | pass  | opcion | nombrePasillo            |
      | dsuarez@robinfood.com | 1000729488 | Menu   | pasillo MUY tremendo ONE |

  @associate
  Esquema del escenario: Asociar pasillo en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario asocia el nuevo pasillo con un menu con los datos <menuToAsociar> y <nombrePasillo>
    Entonces El usuario debe ver un mensaje de Asociacion exitosa

    Ejemplos:
      | user                   | pass  | opcion | nombrePasillo | menuToAsociar |
      | dsuarez@robinfood.com | 1000729488 | Menu   | Galletas      | MUY PECADO    |