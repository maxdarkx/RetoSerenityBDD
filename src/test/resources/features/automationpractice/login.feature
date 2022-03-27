Feature: Login de usuario en la plataforma
  As un usuario de la pagina
  I necesito ingresar en el sitio
  To usar el sitio

  Scenario:  Loguear un usuario nuevo con todos los campos
    Given Que el usuario se encuentra ubicado en la pagina inicial
    When se desplaza al formulario de login y llena todos los campos
    Then se activa su cuenta y se muestra un mensaje de bienvenida

  Scenario:  Loguin de usuario no posible por error en la contrasena
    Given Que el usuario se encuentra ubicado en la pagina inicial
    When se desplaza al formulario de login y llena su usuario pero se equivoca en la contrasena
    Then se muestra un mensaje indicando error en el password