Feature: Iniciar sesión en la aplicacion de saucedemo

  @login
  Scenario: Ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"

  @addToCart
  Scenario: Agregar un 2 productos al carrito y elminar 1
    Given Click en addtocart del primer item
    When click en el nombre del segundo item
    #And click en addtocart
    And click en carrito
    And click remove al segundo item
    Then validamos que se encuentre el item "Sauce Labs Backpack"

  @checkout
  Scenario: Realizar el checkout de la aplicacion
    Given En el carrito click en checkout
    When ingresamos los datos "Wilmer" "Vasquez" "01059"
    And click continue
    And click finish
    Then validamos estar en la pagina de checkout "CHECKOUT: COMPLETE!"
#
  @logout
  Scenario: Salir de la aplicacion
    Given click menu
    When click logout
    Then validamos estar en la pagina de login "LOGIN"
#