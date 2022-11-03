#language:es

Característica: Subampaña

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  Esquema del escenario: Creacion de subcampaña paar el pais de <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario crea una subcampaña
      | nombreCampania   | areaSolicitante   | nombreSubcampania   | nombreCorto   | nombreCupon   |
      | <nombreCampania> | <areaSolicitante> | <nombreSubcampania> | <nombreCorto> | <nombreCupon> |
    Entonces El usuario debe ver un mensaje en el popup de subcampaña creada exitosamente

    Ejemplos:
      | user                  | pass       | pais     | opcion  | nombreCampania         | areaSolicitante | nombreSubcampania        | nombreCorto | nombreCupon         |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | CampañaPredefinidaAuto | Mercadeo        | subcampañaAutomatizacion | sca         | cuponautomatizacion |


  Esquema del escenario: Buscar subcamapaña en <pais>
    Dado El se loguea en la pagina con usuario <user> y pass <pass> en <pais>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario busca una subcampaña de nombre <nombreSubcampania>
    Entonces El usuario debe ver la informacion de subcampaña
      | redimidos   | nombreCampania   | nombreSubcampania   | valorDescuento   |
      | <redimidos> | <nombreCampania> | <nombreSubcampania> | <valorDescuento> |


    Ejemplos:
      | user                  | pass       | pais     | opcion  | redimidos | nombreSubcampania         | nombreCampania        | valorDescuento |
      | dsuarez@robinfood.com | 1000729488 | Mexico   | Cupones | 11        | Subcampaña Auto Final     | Campaña Auto          | $1.500         |
      | dsuarez@robinfood.com | 1000729488 | Colombia | Cupones | 1.000        | Subcampaña Final Colombia | Campaña Auto Colombia | $12.000        |
      | dsuarez@robinfood.com | 1000729488 | Brasil   | Cupones | 203.000   | Subcampaña Auto Brasil    | Campaña Auto Brasil   | 10%            |


