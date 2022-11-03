#language:es

Característica: Producto BCC

  Antecedentes: Preparo ambiente de automatizacion
    Dado Se configura el driver para la automatizacion

  @add
  Esquema del escenario: Agregar producto en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario agrega un producto con los siguientes datos
      | nameProduct   | skuProduct   | productPrice   | referenceProductPrice   | description   |
      | <nameProduct> | <skuProduct> | <productPrice> | <referenceProductPrice> | <description> |
    Entonces El usuario debe ver un mensaje de producto agregado correctamente

    Ejemplos:
      | user                   | pass  | opcion | nameProduct                              | skuProduct | productPrice | referenceProductPrice | description       |
      | lgarciaa@robinfood.com | 12345 | Menu   | producto novedoso en todas las tiendas 1 | 1341412de  | 15000        | 20000                 | el mejor producto |


  @edit
  Esquema del escenario: Agregar producto en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario edita un producto con los siguientes datos
      | nameProduct   | skuProduct   | productPrice   | referenceProductPrice   | description   |
      | <nameProduct> | <skuProduct> | <productPrice> | <referenceProductPrice> | <description> |
    Entonces El usuario debe ver un mensaje de producto editado correctamente

    Ejemplos:
      | user                   | pass  | opcion | nameProduct                            | skuProduct    | productPrice | referenceProductPrice | description                   |
      | lgarciaa@robinfood.com | 12345 | Menu   | producto novedoso en todas las tiendas | 13414127676de | 44500        | 81000                | el mejor producto del mercado |


  @eliminated
  Esquema del escenario: Eliminar producto en la pagina BCC exitoso
    Dado El usuario se loguea en la pagina con usuario <user> y pass <pass>
    Cuando El usuario elige la opcion deseada <opcion>
    Y El usuario elimina el producto <nameProductToEliminate> de la pagina
    Entonces El usuario debe ver un mensaje de eliminacion exitosa

    Ejemplos:
      | user                   | pass  | opcion | nameProductToEliminate                 |
      | lgarciaa@robinfood.com | 12345 | Menu   | producto novedoso en todas las tiendas |