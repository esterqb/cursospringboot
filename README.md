# 🍃 CURSO SPRING BOOT 🍃

▶️ Enlace: https://www.youtube.com/watch?v=BRtPNl0aBkA&list=PLyvsggKtwbLVOPuOGn9J1Ie9RD7r7LcWD

## ⚙️ Configuración en Spring Initializr: ⚙️

- Project: Maven
- Spring Boot: Predeterminado (última versión)
- Project Metadata:
    - Group: com.corporativoX
    - Artifact: cursospringboot
    - Name: Curso con Spring Boot
    - Description: Proyecto de microservicio para el curso Spring Boot
    - Package name: cursoSpringBoot
- Packaging: Jar.
- Java: 17
- Dependencies: Spring Web.

## 💻 Empezar el programa: 💻

1. En src>main>java>cursoSpringBoot: clic derecho>crear paquete> **"controllers"**
2. En controllers: clic derecho>new>java class> **"HelloWorldRestController"** -> es buenas prácticas agregar un sufijo que haga referencia hacia qué función va a realizar esta clase: Rest Controller.
3. Crear un método en esta clase: **public String helloWorld(){}**, que debe tener un return.
4. Encima del nombre de la clase, se debe hacer una anotación **@RestController**.
5. Encima del método creado helloWorld(), que se debe mapear para que cuando se haga una solicitud desde el cliente, pueda acceder y ejecutar el método, colocamos encima **@GetMapping** y añadimos atributo ("/hello"). Podemos llamar al método de varias formas: ({"/hello", "/hw", "/hola"}).
6. Podemos cambiar el servidor en el que se levanta la aplicación yendo a src>resources>**application.properties** e incluyendo la línea **server.port=8081**
7. Run main class y en el navegador: localhost:8081/hola (o hello o hw) y enviará el mensaje Hello World.

---

1. En controllers, crear clase **GreetingRestController**. 
2. Crear método en esta clase que sea public String greeting(){} que devuelva un saludo personalizado introduciendo un String por parámetro: @GetMapping({"/saludo/{name}", "/hola/{name}"}) -valores dinámicos- public String greeting(@PathVariable String name){.

---

## 📒 Práctica propuesta #1 📒

Desarrollar una aplicación que permita a los usuarios verificar si una palabra ingresada es un palíndromo o no. Ejs: "Radar", "reconocer".  

La lógica para verificar si una palabra es un palíndromo debe estar encapsulada en un método separado.

El endpoint debe devolver un mensaje claro indicando si la palabra es un palíndromo o no. 

src>main>java>cursoSpringBoot>controllers>PalindromeController

Run y en el navegador: http://localhost:8081/palindromo/pokemon (Pokemon o cualquier otra palabra a comprobar)

---

## ⛏️ Microservicios ⛏️

Los **microservicios** son una arquitectura de software en la que una aplicación monolítica se descompone en pequeños servicios independientes. Cada uno de ellos se centra en realizar una tarea específica, que pueden ser desarrollados y escalados de forma independiente.

## 🧅 Arquitectura basada en capas 🧅

Es un enfoque comúnmente usado para diseñar sistemas de software, además, se puede aplicar igualmente en el diseño y desarrollo de un microservicio. La idea de implementar la arquitectura basada en capas es segmentar responsabilidades en distintas capas.

Hay tres capas básicas y algunas más:
1. Capa de presentación.
2. Capa de lógica de negocio.
3. Capa de acceso a datos.
4. Capa de integración.
5. Capa de seguridad.

1️⃣ La **capa de presentación** suele ser mínima o inexistente, ya que los microservicios no suelen tener una interfaz de usuario directa. A veces los microservicios pueden tener una API de interfaz de usuario para interactuar con otras partes del sistema o con otras aplicaciones. Así, esta capa podría consistir en los controladores que exponen esta API.

2️⃣ La **capa de lógica de negocio** se compone de servicios, que son las clases que implementan la lógica de negocio específica del servicio y proporcionan una interfaz para interactuar con ella. Esto significa que los servicios son responsables de implementar las reglas de negocio, realizar cálculos, validar datos y coordinar las operaciones necesarias para cumplir con los requisitos del negocio.

3️⃣ La **capa de acceso a datos** es responsable de interactuar con la BD u otros sistemas de almacenamiento de datos. Cada servicio podría tener su propia BD o compartir una BD con otros microservicios, dependiendo de la necesidad y de la arquitectura específica.

4️⃣ La **capa de integración** se usa para integrar el microservicio con otros sistemas externos o con otros microservicios dentro de la misma arquitectura de microservicios. Puede incluir componentes de comunicación como clientes HTTP, clientes de servicio web, colas de mensajes, etc.

5️⃣ La **capa de seguridad** se encarga de implementar medidas de seguridad, como la autenticación y la autorización, para proteger el microservicio contra accesos no autorizados. Puede incluir filtros de seguridad, tokens de acceso, etc.

## 🔌 API vs API Rest 🔌

**API**: Es un conjunto de definiciones y protocolos que facilitan la comunicación y la interacción entre diferentes componentes de software. Las cuales actúan como puentes que permiten que aplicaciones y sistemas se comuniquen de manera eficiente y coherente. Es interfaz de programación de aplicaciones.

En el contexto de las API, la palabra aplicación se refiere a cualquier software con una función distinta. La interfaz puede considerarse como un contrato de servicio entre dos aplicaciones. Este contrato define cómo se comunican entre sí mediante solicitudes y respuestas.

**¿Qué es la arquitectura REST?** REST o transferencia de estado representacional, es la arquitectura más común para APIs debido a su escalabilidad y facilidad de implementación. REST también puede ser RESTful.

La arquitectura REST está basada en estándares web que utilizan **métodos HTTP (GET, POST, PUT, PATCH, DELETE)** para realizar **operaciones CRUD (Crear, Leer, Actualizar, Borrar)** en recursos que son identificados por URLs.

---

## Enrutamiento en Spring Boot.

El enrutamiento (asignación de URL) es el proceso mediante el cual Spring Boot decide qué método de controlador ejecutar en respuesta a una solicitud HTTP específica mediante la asignación de URLs a métodos de controlador con base a las anotaciones usadas en esos métodos. Se utilizan varias anotaciones de mapeo para definir qué método de controlador manejará una solicitud HTTP específica. Anotaciones más comunes:

- **@GetMapping**: mapea las solicitudes HTTP GET a métodos concretos. 
- **@PostMapping**: mapea las solicitudes HTTP POST a métodos concretos.Esta notación es una forma conveniente de especificar que un método debe ser invocado cuando llega una solicitud POST a una URL específica. Una solicitud del tipo POST es uno de los métodos HTTP usados para enviar datos a un servidor y crear un nuevo recurso. Cuando se realiza una solicitud POST, se está solicitando al servidor que acepte los datos incluidos en el cuerpo de la solicitud y los procese de acuerdo con la lógica de la aplicación.
- **@PutMapping**: mapea las solicitudes HTTP PUT a métodos concretos.
- **@DeleteMapping**: mapea las solicitudes HTTP DELETE a métodos concretos. Se usa para mapear métodos de controlador específicos que generalmente se usan para eliminar un recurso existente en el servidor. Enruta la solicitud al método que hayamos esepcificado mediante la URL asignada.
- **@RequestBody**: se utiliza para anotar argumentos del método del controlador de solicitudes. Indica que un parámetro de método debe estar vinculado al valor del cuerpo de la solicitud HTTP. Se encarga de indicar que un objeto se construirá a partir de la información enviada en el body del request para la petición de este servicio.
- **@PatchMapping**: es parte de la familia de anotaciones para mapear solicitudes HTTP, y se usa para mapear solicitudes HTTP del tipo PATCH a métodos de controlador que se encargan de realizar la modificación parcial de recursos en nuestro sistema. Una solicitud HTTP del tipo PATCH se usa para aplicar modificaciones parciales en recursos existentes sin necesidad de enviar la representación completa del recurso. A diferencia de PUT, que reemplaza por completo el recurso, PATCH permite actualizar solo algunos campos del recurso existente.

Spring Boot usa un enfoque basado en patrones para asignar solicitudes a métodos de controlador. Esto significa que puede tener múltiples métodos de controlador con la misma ruta de acceso base, pero diferentes patrones adicionales, como parámetros de ruta o extensiones para diferenciarlos.

---

➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖

---

## 🌿 Spring Initializr: 🌿

- **Gradle-Groovy**: En **build.gradle** se colocan las dependencias del proyecto.
- **Maven**: las dependencias están en **pom.xml**.

## 👷 ¿Jar o War? 👷

- **Jar**: para ejecutar una aplicación de forma independiente. Contiene servidor web incorporado (como Tomcat, Jetty o Undertow) junto con tu aplicación. Se usa para aplicaciones autónomas que no requieren un servidor de aplicaciones externo. Ideales para aplicaciones Spring Boot que necesitan ser autocontenidas y pueden ejecutarse con java -jar sin necesidad de un servidor web externo.
- **War**: para empaquetar aplicaciones web Java que se despliegan en servidores de aplicaciones, como Tomcat, Jetty o Wildfly. Contiene tu aplicación junto con los recursos necesarios para ejecutarse en un servidor web externo. Se usa cuando se desea desplegar la aplicación en un servidor de aplicaciones externo. Útil cuando se desarrollan aplicaciones web tradicionales y no necesitas incorporar un servidor web en el archivo JAR. Puedes crear un archivo WAR y desplegarlo en un servidor web compatible.

## ✍️ ¿Qué son las anotaciones? ✍️

Las anotaciones sirven para configurar el comportamientos de las clases y funcionalidad dentro de Spring Framework. Indica cómo manejar y configurar esa clase, lo que permite la administración de componentes, inyección de dependencias, configuración de propiedades, etc. Se definen con @+Nombre de notación y a veces pueden llevar un atributo (“/clientes”).

- **@SpringBootApplication**: marcar la clase principal de una aplicación Spring Boot. 
- **@RestController**: marca clase como controlador REST. Combina las funcionalidades de @Controller y @ResponseBody, es decir, es capaz de manejar solicitudes HTTP y devolver datos en formato JSON o XML. Sirve para crear controladores que general respuestas HTTP para APIs RESTful. Cada método de esta clase se mapea automáticamente a una ruta URL y responde a las solicitudes HTTP entrantes en función de las anotaciones: **@GetMapping, @PostMapping, @PutMapping, @DeleteMapping…**
- **@GetMapping**: para mapear solicitudes HTTP GET a métodos de controlador específicos. Se usa en combinación con @RestController o @Controller para crear controladores RESTful. Al usarlo, se asigna la URL especificada en la anotación a un método en el controlador y manguera automáticamente las solicitudes HTTP GET que llegan a esas URL, invocando el método correspondiente y devolviendo el resultado como respuesta. 
- **@PathVariable**: se utiliza para mapear partes de la URL de una solicitud web a parámetros de un controlador. Es útil cuando tienes valores dinámicos en la URL que deseas extraer y utilizar en tu método controlador.
