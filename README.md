# testPracticeAmazon

***********************************************************************************************************************
EJECUCCION E INSTALACION DEL PROYECTO(LOCAL):

    1) Clonar el repositorio(LOCAL)
  
    2) Abrir o Instalar katalon Studio
  
    3) Ir a la opción "File/Open Project"
  
    4) Agregar(carpeta) el proyecto a Katalon Studio
  
    5) Ir a la sección Tests Explorer/Test Suites/TestRunner - Scenarios
  
    6) Presionar el botón "Execute"

************************************************************************************************************************

************************************************************************************************************************
DESCRIPCION DEL PROYECTO:

Prueba de habilidades para automatización

Condiciones de entrega:
-La prueba debe ser entregada en un plazo de 24h a partir de la recepcion del presente correo.
-La prueba debe colocarse en un sistema de manejo de versiones de dominio publico, y utilizar el enlace de este como entregable.
-El repositorio de la prueba debe estar bien comentado.
-La prueba puede ser realizada en cualquier sistema de automatización en que usted se sienta cómodo, sin embargo, mientras mayores habilidades o conocimiento de diferentes plataformas presente (web/movil), mejor le sera calificado en la evaluación.



Practica:
Tomando la plataforma Amazon como punto de partida para esta practica se requiere que el participante identifique y automatice por lo menos un escenario y dos casos de pruebas.


Detalle de lo realizado:

Fueron creados los siguientes escenarios:

1) Login with correct values:

  Este escenario cuenta con un caso de prueba: 
  
    1- "Successful Login"
  
  Nota: se tenia planeado crear el flujo completo desde el acceso en la pagina Amazon.com hasta el loggin success dentro de la página, por tal razón se comentó las lineas que hacen la validación del correo donde es recibo un número de validación llamado OPT, pero no es le unico sistema de seguridad de Amazon por lo que es muy inestable ejecutar esa prueba.
  
  En un ambiente más controlado se pudiera realizar el flujo satisfactoriamente.

2) Login with incorrect values

  Este escenario cuenta con 4 casos de pruebas:
  
    1- "Usuccessful Login by wrong email"
  
    2- "Usuccessful Login by wrong password"
    
    3- "Usuccessful Login by blank email"
    
    4- "Usuccessful Login by blank password"
    
  Nota: el caso de prueba "Usuccessful Login by wrong password" debido al nivel de seguridad de Amazon tambien se vio afectado.

3) Shopping Cart with user logged

  Este escenario cuenta con 2 casos de pruebas:
   
    1- "Successful addToCart with user logged"
   
    2- "Successful delete item into shopping cart with user logged"
    
    
   Nota: Debido al nivel de seguridad de Amazon estás pruebas están inestables.

4) Shopping Cart without user logged

  Este escenario cuenta con 2 casos de pruebas:
  
    1- "Successful addToCart without user logged"
    
    2- "Successful delete item into shopping cart without user logged"
    
    
************************************************************************************************************************    
