#language:es

Característica: Cupones

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  Esquema del escenario: Creacion de cupon para el pais de <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea un cupon
      | nombreCampania   | areaSolicitante   | nombreSubcampania   | nombreCorto   | nombreCupon   |
      | <nombreCampania> | <areaSolicitante> | <nombreSubcampania> | <nombreCorto> | <nombreCupon> |
    Entonces El usuario debe ver un mensaje en el popup de código creado exitosamente

    Ejemplos:
      | user                  | pass       | pais     | opcion  | nombreCampania          | areaSolicitante | nombreSubcampania         | nombreCorto | nombreCupon         |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | Campaña Auto Colombia | Mercadeo        | Subcampaña Final Colombia | sca         | cuponautomatizacion |


  Esquema del escenario: Busqueda de cupon para el pais de <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario busca un cupon de nombre <nombreCupon>
    Entonces El usuario debe ver la informacion de cupon
      | nombreCupon   | nombreSubcampania   | redencion   | fechaInicial   | fechaFinal   | estado   |
      | <nombreCupon> | <nombreSubcampania> | <redencion> | <fechaInicial> | <fechaFinal> | <estado> |

    Ejemplos:
      | user                  | pass       | pais     | opcion  | nombreCupon | nombreSubcampania          | redencion | fechaInicial       | fechaFinal         | estado   |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Cupones | HZM2KEZBX5  | Subcampaña Auto Final     | 1         | 2022-02-12 - 01:05 | 2261-03-08 - 01:35 | Activo   |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | OMGT52WEYL  | Subcampaña Final Colombia | 10        | 2022-02-12 - 01:35 | 2122-12-24 - 02:30 | Activo   |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Cupones | KQW2MG6PNN  | Subcampaña Auto Brasil    | 10        | 2022-02-18 - 14:25 | 2286-08-30 - 02:30 | Inactivo |
