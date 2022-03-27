Feature: Prueba de automatizacion de contact Us usando screenplay
  As un automatizador de pruebas de la pagina
  I necesito enviar un mensaje al area de soporte
  To enviar una queja de prueba

  Scenario: enviar un mensaje al area de soporte con los campos requeridos
    Given Que el usuario se encuentra ubicado en la pagina inicial
    When El se desplaza al formulario de soporte y llena los datos requeridos
    Then Se envia un mensaje al area de soporte para verificar la funcionalidad