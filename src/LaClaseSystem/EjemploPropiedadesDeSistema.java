package LaClaseSystem;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        // Obtiene el nombre de usuario del sistema operativo (quien está ejecutando la aplicación)
        String username = System.getProperty("user.name");
        System.out.println("username = " + username); // Imprime el nombre de usuario en la consola

        // Obtiene la ruta del directorio home del usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home); // Imprime la ruta del directorio home del usuario

        // Obtiene el directorio de trabajo actual donde se ejecuta la aplicación
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace); // Imprime la ruta del directorio de trabajo actual

        // Obtiene la versión de Java que se está utilizando
        String java = System.getProperty("java.version");
        System.out.println("java = " + java); // Imprime la versión de Java que se está utilizando

        // Obtiene el separador de línea según el sistema operativo
        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("LineSeparator:  " + lineSeparator + "Una linea nueva .."); // Muestra el separador de línea para el sistema operativo
        System.out.println("lineSeparator2: " + lineSeparator2 + "Una linea nueva .."); // Muestra el separador de línea para el sistema operativo (usando otra forma)


        // Obtiene todas las propiedades del sistema y las lista
        Properties properties = System.getProperties();
        properties.list(System.out); // Muestra todas las propiedades del sistema, como versión de Java, sistema operativo, etc.

    }
}
