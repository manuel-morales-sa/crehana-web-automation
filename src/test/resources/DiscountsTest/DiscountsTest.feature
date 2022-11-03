#language:es

Característica: Descuentos - Menu BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion


  Esquema del escenario: Crear campaña desde el módulo de descuentos exitosamente
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una campaña con los siguientes datos
      | nameCampaign   | startDate   | finishDate   |
      | <nameCampaign> | <startDate> | <finishDate> |
    Entonces El usuario deberia ver un mensaje de creacion de campaña exitosa

    Ejemplos:
      | user                  | pass       | opcion | nameCampaign  | startDate | finishDate |
      | dsuarez@robinfood.com | 1000729488 | Menu   | Super Campaña | 2022-03-10        | 2022-03-24 |