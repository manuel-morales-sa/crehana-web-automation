#language:es

Característica: Foodcoins - BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  Esquema del escenario: Asignar Foodcoins a usuario exitosamente por el menu de usuarios de <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario asigna foodcoins al usuario por el mas
      | userName   | entity   | mes   | fechaVencimiento   | amountFoodCoins   | cantidadUsuarios   | cargaMasiva   |
      | <userName> | <entity> | <mes> | <fechaVencimiento> | <amountFoodCoins> | <cantidadUsuarios> | <cargaMasiva> |
    Entonces El usuario debe ver un mensaje asignacion exitosa

    Ejemplos:
      | user                  | pass       | pais     | opcion    | userName             | entity | mes | fechaVencimiento | amountFoodCoins | cantidadUsuarios | cargaMasiva |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |

  Esquema del escenario: Asignar Foodcoins a usuario exitosamente por el menu de descripcion de usuario en <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario asigna foodcoins al usuario por la flecha
      | userName   | entity   | mes   | fechaVencimiento   | amountFoodCoins   | cantidadUsuarios   | cargaMasiva   |
      | <userName> | <entity> | <mes> | <fechaVencimiento> | <amountFoodCoins> | <cantidadUsuarios> | <cargaMasiva> |
    Entonces El usuario debe ver un mensaje asignacion exitosa

    Ejemplos:
      | user                  | pass       | pais     | opcion    | userName             | entity | mes | fechaVencimiento | amountFoodCoins | cantidadUsuarios | cargaMasiva |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | DANIEL HENAO SÁNCHEZ | System | mar | 2022-03-20       | 10              | unUsuario        | no          |

  Esquema del escenario: Buscar usuario en el pais de <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario busca por el criterio de <criterioBusqueda>
    Entonces El usuario debe ver la informacion del usuario
      | nombre   | telefono   | estatus   |
      | <nombre> | <telefono> | <estatus> |

    Ejemplos:
      | user                  | pass       | pais     | opcion    | criterioBusqueda     | nombre               | telefono   | estatus |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | DANIEL HENAO SÁNCHEZ | DANIEL HENAO SÁNCHEZ | 3182314270 | Silver  |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Foodcoins | 3182314270           | DANIEL HENAO SÁNCHEZ | 3182314270 | Silver  |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | DANIEL HENAO SÁNCHEZ | DANIEL HENAO SÁNCHEZ | 3182314270 | Silver  |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Foodcoins | 3182314270           | DANIEL HENAO SÁNCHEZ | 3182314270 | Silver  |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | DANIEL HENAO SÁNCHEZ | DANIEL HENAO SÁNCHEZ | 3182314270 | Silver  |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Foodcoins | 3182314270           | DANIEL HENAO SÁNCHEZ | 3182314270 | Silver  |
