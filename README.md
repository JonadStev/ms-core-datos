# ms-core-datos
Para poder desplegar en un servidor de aplicaciones wildfly, tomar el archivo pom.xml.dist

Para cambiar la configuracion de arranque, se debe modificar la clase main de la siguiente menera:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MsDemoApplication extends SpringBootServletInitializer {

arduino
Copy code
public static void main(String[] args) {
    SpringApplication.run(SpringApplication.class, args);
}
}
```

