#language:es

Característica: Campaña

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  @CreacionCampañaCompleta
  Esquema del escenario: Creacion de campaña con subcampaña y cupon exitoso en <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una campaña con subcampaña y cupones
      | nombreCampania   | areaSolicitante   | nombreSubcampania   | nombreCorto   | nombreCupon   |
      | <nombreCampania> | <areaSolicitante> | <nombreSubcampania> | <nombreCorto> | <nombreCupon> |
    Entonces El usuario debe ver un mensaje en el popup de código creado exitosamente

    Ejemplos:
      | user                  | pass       | pais     | opcion  | nombreCampania          | areaSolicitante | nombreSubcampania        | nombreCorto | nombreCupon         |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | CampañaPredefinidaAuto | Mercadeo        | subcampañaAutomatizacion | sca         | cuponautomatizacion |

  Esquema del escenario: Creacion de campaña en <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una campaña
      | nombreCampania   | areaSolicitante   | nombreSubcampania   | nombreCorto   | nombreCupon   |
      | <nombreCampania> | <areaSolicitante> | <nombreSubcampania  > | <nombreCorto> | <nombreCupon> |
    Entonces El usuario debe ver un mensaje en el popup de creación de campaña exitosa

    Ejemplos:
      | user                  | pass       | pais     | opcion  | nombreCampania          | areaSolicitante | nombreSubcampania         | nombreCorto | nombreCupon         |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | CampañaPredefinidaAuto | Mercadeo        | subcampañaAutomatizacion | sca         | cuponautomatizacion |

  Esquema del escenario: Buscar campaña en <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario busca una campaña de nombre <nombreCampania>
    Entonces El usuario debe ver la informacion de campaña
      | nombreCampania   | fechaInicial   | fechaFinal   | estado   |
      | <nombreCampania> | <fechaInicial> | <fechaFinal> | <estado> |


    Ejemplos:
      | user                  | pass       | pais     | opcion  | nombreCampania         | fechaInicial       | fechaFinal         | estado   |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Cupones | Campaña Auto          | 2022-02-12 - 05:25 | 2807-03-31 - 01:35 | Activo   |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | Campaña Auto Colombia | 2022-02-12 - 01:30 | 2179-12-31 - 02:25 | Activo   |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Cupones | Campaña Auto Brasil   | 2022-02-19 - 04:25 | 2190-12-24 - 04:25 | Inactivo |
