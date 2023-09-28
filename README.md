# Contenedores
Para levantar la aplicacion de debe crear un contenedor de mysql

docker run -d --name mi-contenedor-mysql -e MYSQL_ROOT_PASSWORD=12345 -e MYSQL_DATABASE=midb -p 3306:3306 mysql:latest


# ms-core-datos
Para poder desplegar en un servidor de aplicaciones wildfly, tomar el archivo pom.xml.dist

Para cambiar la configuracion de arranque, se debe modificar la clase main de la siguiente menera:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MsDemoApplication extends SpringBootServletInitializer {

public static void main(String[] args) {
    SpringApplication.run(SpringApplication.class, args);
}
}
```
# Compilacion

Se debebe ejcutar los siguiuentes comandos:
```bash
mvn clean
mvn install
mvn package
```
Se generará el archivo .war en la carpeta target del directorio principal del proyecto. Este archivo es el que debemos subir al servidor de aplicaciones.

Una vez desplegado el microservicio, podra consultar los datos con la siguiente url base:

http://localhost:8080/ms-demo-0.0.1-SNAPSHOT/usuarios/

a partir de aqui ya puede probar la aplicacion.
