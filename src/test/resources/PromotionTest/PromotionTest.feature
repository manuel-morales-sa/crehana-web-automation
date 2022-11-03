#language:es

Característica: Promociones - Menu BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion


  Esquema del escenario: Crear promocion exitosamente
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una promocion <nombrePromocion>
    Entonces El usuario deberia ver un mensaje de creacion de promocion exitosa

    Ejemplos:
      | user                  | pass       | pais     | opcion      | nombrePromocion |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Menu | Super promocion |