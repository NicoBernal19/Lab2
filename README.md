# **Laboratorio 2**

## **Entendiendo Maven**

- **Mayor utilidad de Maven:** Maven proporciona una manera eficiente y estandarizada de gestionar proyectos de software, 
simplificando tareas como la gestión de dependencias, la construcción del proyecto y la colaboración entre desarrolladores.
Esto ayuda a mejorar la productividad y la calidad del software desarrollado

- **Fases y ciclo de vida de la construcciónde de maven:**
    1. validate: Esta fase valida que el proyecto sea correcto y que toda la información necesaria esté disponible.
    2. compile: En esta fase, el código fuente del proyecto se compila y se generan los archivos binarios (.class) correspondientes.
    3. test: Durante esta fase, se ejecutan las pruebas unitarias del proyecto utilizando un marco de pruebas como JUnit.
    4. package: En esta fase, el código compilado y los recursos del proyecto se empaquetan en un formato específico, como JAR (Java Archive) o WAR (Web Archive).
    5. verify: Esta fase verifica la calidad del paquete generado, ejecutando cualquier verificación adicional sobre el paquete.
    6. install: Durante esta fase, el paquete se instala en el repositorio local de Maven, lo que permite su uso como dependencia en otros proyectos de Maven en la misma máquina.
    7. deploy: En esta fase, el paquete se copia en un repositorio remoto, como un repositorio Maven remoto o un servidor de aplicaciones,
       para que otros desarrolladores o sistemas puedan acceder a él.
      
- **Función de los plugins:** Los plugins en Maven son componentes que proporcionan funcionalidades adicionales para el ciclo de vida de construcción
y gestión de proyectos. Tienen un papel fundamental en la personalización y automatización de tareas específicas durante el desarrollo de software.

- **Repositorio central de Maven:** es un repositorio de software gestionado por la comunidad de Maven que actúa como un almacén centralizado de bibliotecas,
dependencias y plugins de software de código abierto. Es una fuente centralizada de artefactos que pueden ser utilizados por desarrolladores de todo el mundo
en sus proyectos de software.
Alguna de sus funciones son
  - Almacenar artefactos como bibliotecas de java, dependencias, plugins de Maven y otros componentes de software,Estos artefactos están disponibles públicamente
    y pueden ser descargados e incorporados en proyectos Maven.
  - Cada artefacto en el repositorio central de Maven está acompañado de metadatos detallados que proporcionan información sobre el artefacto, como su nombre, descripción,
    versión, licencia, dependencias, entre otros.
  - El repositorio central de Maven está disponible públicamente a través de Internet, lo que permite a los desarrolladores de todo el mundo acceder a sus contenidos.
  - Maven está configurado de forma predeterminada para buscar dependencias y plugins en el repositorio central cuando se construye un proyecto. Esto simplifica la
     gestión de dependencias y facilita la incorporación de bibliotecas y herramientas externas en proyectos Maven.
  - Los desarrolladores pueden buscar artefactos en el repositorio central utilizando diferentes criterios como el nombre del artefacto, el grupo de artefactos,
    la versión, entre otros.


## **Copilando y ejecutando**

  - El objetivo principal del parámetro "package" en Maven es empaquetar el proyecto compilado en un formato específico, como JAR (Java ARchive), WAR (Web ARchive) o
    EAR (Enterprise ARchive), dependiendo del tipo de proyecto. Cuando se ejecuta el comando mvn package, Maven realiza varias tareas, incluyendo la compilación del
    código fuente del proyecto y la ejecución de pruebas, si están configuradas. Después de completar estas tareas, la fase "package" se encarga de empaquetar el
    proyecto compilado en el formato especificado en el archivo de configuración pom.xml.
    Parámetros que se pueden enviar junto con el comando mvn:
    1. Goals: Especifica las metas de Maven que se deben ejecutar. Por ejemplo, mvn compile, mvn test, mvn package, etc.
       
    2. Opciones de fase de ciclo de vida: Además de las metas, se puede especificar las fases del ciclo de vida directamente. Por ejemplo, mvn clean, mvn install, mvn deploy, etc.
    
    3. Opciones de proyecto: Estos parámetros permiten especificar detalles sobre el proyecto Maven en el que se está trabajando. Algunos ejemplos son:
        - '-f, --file <nombre_archivo>': Especifica el archivo pom.xml que debe ser utilizado.
        - '-D, --define <nombre=valor>': Define una propiedad del sistema.
        - '-N, --non-recursive': Ejecuta Maven en modo no recursivo, lo que significa que no se procesarán los submódulos.
    
    4. Opciones de depuración y salida:
        - '-X, --debug': Habilita el modo de depuración, mostrando información detallada sobre la ejecución de Maven.
        - '-q, --quiet': Habilita el modo silencioso, mostrando solo mensajes de error y advertencia.
      
    5. Opciones de configuración global:
        - '-s, --settings <archivo_configuración>': Especifica la ubicación del archivo de configuración de Maven.
        - '-U, --update-snapshots': Forza a actualizar las dependencias snapshots.
    
    6. Opciones de proxy y autenticación:
        - '-P, --activate-profiles <perfil>': Activa los perfiles especificados.
        - '-e, --errors': Muestra mensajes de error y finaliza la construcción en caso de error.
      
    7. Ayuda y documentación:
        - '-h, --help': Muestra la ayuda sobre el comando mvn.
        - '-v, --version': Muestra la versión de Maven.

## **Hacer el esqueleto de una aplicación**
- Fabricamos una "Simple Factory" por la sencillez del proyecto y el mejor patrón fábrica depende mucho del proyecto en el que se esté trabajando, ya que si
  es muy simple, el “Factory Method” o “Abstract Factory” serán muy complejos.
- El único parámetro que se ejecutó y funcionó correctamente fue "Hexagon" porque este era una de las opciones que se encontraban en el switch, los otros 2
  (qwerty y pentagon) no funcionaron ya que tenían errores de sintaxis  o porque no era una opción en el switch.
