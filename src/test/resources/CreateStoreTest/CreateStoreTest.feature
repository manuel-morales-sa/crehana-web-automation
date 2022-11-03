#language:es

Característica: Create shop

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  Esquema del escenario: Creacion de tienda en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una nueva marca
    Entonces El usuario debe ver un mensaje en el popup de creación de marca exitosa

    Ejemplos:
      | user                  | pass       | opcion |
      | dsuarez@robinfood.com | 1000729488 | Menu   |


  Esquema del escenario: Creacion de tienda existente en la pagina BCC
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una nueva marca
    Entonces El usuario debe ver un mensaje en el popup de marca existente

    Ejemplos:
      | user                  | pass       | opcion |
      | dsuarez@robinfood.com | 1000729488 | Menu   |

  Esquema del escenario: Creacion de tienda existente en la pagina BCC
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario borra una marca
    Entonces El usuario debe ver un mensaje en el popup de marca borrada

    Ejemplos:
      | user                  | pass       | opcion |
      | dsuarez@robinfood.com | 1000729488 | Menu   |

