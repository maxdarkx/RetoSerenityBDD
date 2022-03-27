Feature: Registro de usuario en la plataforma
  As un usuario de la pagina
  I necesito registrarme en el sitio
  To adquirir una cuenta y usar el sitio

  Scenario:  Registrar un usuario nuevo con todos los campos
    Given Que el usuario se encuentra ubicado en la pagina inicial
    When se desplaza al formulario de registro y llena todos los campos
    Then se crea una cuenta y se muestra un mensaje de bienvenida