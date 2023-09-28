# ms-core-datos
Para poder desplegar en un servidor de aplicaciones wildfly, tomar el archivo pom.xml.dist

Para cambiar la configuracion de arranque, se debe modificar la clase main de la siguiente menera:

@SpringBootApplication
public class MsDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class, args);
    }

}

