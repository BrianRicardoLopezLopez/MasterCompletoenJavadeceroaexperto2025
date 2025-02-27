package LaClaseSystem;

import java.util.HashMap;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        // Obtiene todas las variables de entorno del sistema y las almacena en un Map (clave-valor)
        Map<String, String> varEnv = System.getenv();

// Imprime todas las variables de entorno obtenidas
        System.out.println("Variables de ambiente de sistema = " + varEnv);

// Obtiene el valor de la variable de entorno "USERNAME", que generalmente contiene el nombre del usuario actual
        String username = System.getenv("USERNAME");
        System.out.println("Username = " + username); // Imprime el nombre de usuario del sistema

// Obtiene el valor de la variable de entorno "JAVA_HOME", que generalmente contiene la ruta de instalación de Java
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome); // Imprime la ruta de instalación de Java

// Obtiene el valor de la variable de entorno "TEMP", que generalmente contiene la ruta del directorio temporal del sistema
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir); // Imprime la ruta del directorio temporal

// Obtiene el valor de la variable de entorno "Path", que contiene las rutas del sistema para la búsqueda de ejecutables
        String path = System.getenv("Path");
        System.out.println("path = " + path); // Imprime las rutas de búsqueda de ejecutables

// Obtiene el valor de la variable de entorno "Path" desde el Map previamente obtenido
        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2); // Imprime nuevamente las rutas de búsqueda de ejecutables (usando el Map)



    }
}
