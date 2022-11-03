#language:es

Característica: Login BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion


  Esquema del escenario: Login BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>

    Ejemplos:
      | user                  | pass         |
      | dsuarez@robinfood.com | 1000729488 |