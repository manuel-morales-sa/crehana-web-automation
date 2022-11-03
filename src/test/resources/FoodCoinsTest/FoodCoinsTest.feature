#language:es

Característica: Foodcoins - BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion


  Esquema del escenario: Asignar Foodcoins a usuario exitosamente
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario asigna foodcoins
      | userName   | entity   | mes   | fechaVencimiento   | amountFoodCoins   | cantidadUsuarios   | cargaMasiva   |
      | <userName> | <entity> | <mes> | <fechaVencimiento> | <amountFoodCoins> | <cantidadUsuarios> | <cargaMasiva> |
    Entonces El usuario debe ver un mensaje asignacion exitosa

    Ejemplos:
      | user                  | pass       | pais     | opcion    | userName             | entity | mes | fechaVencimiento | amountFoodCoins | cantidadUsuarios | cargaMasiva |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | variosUsuarios   | no          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | variosUsuarios   | no          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | variosUsuarios   | no          |


  @masive
  Esquema del escenario: Asignar Foodcoins a usuarios de forma masiva exitosamente
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario asigna foodcoins de forma masiva
      | userName   | entity   | mes   | fechaVencimiento   | amountFoodCoins   | cantidadUsuarios   | cargaMasiva   |
      | <userName> | <entity> | <mes> | <fechaVencimiento> | <amountFoodCoins> | <cantidadUsuarios> | <cargaMasiva> |
    Entonces El usuario debe ver un mensaje asignacion exitosa

    Ejemplos:
      | user                  | pass       | pais     | opcion    | userName             | entity | mes | fechaVencimiento | amountFoodCoins | cantidadUsuarios | cargaMasiva |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | si          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | si          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | si          |


  @Search
  Esquema del escenario: Buscar evento exitosamente
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario busca un número de evento <numeroEvento>
    Entonces Se debe ver en la pantalla el numero de evento filtrado <numeroEvento>

    Ejemplos:
      | user                  | pass       | pais     | opcion    | numeroEvento |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | 829          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | 829          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | 829          |

  @DetalleEvento
  Esquema del escenario: Ver detalle de un evento exitosamente
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario consulta el detalle de un evento <numeroEvento>
    Entonces Se debe ver en la pantalla el detalle evento <numeroEvento>


    Ejemplos:
      | user                  | pass       | pais     | opcion    | numeroEvento |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | 848          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | 848          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | 848          |
