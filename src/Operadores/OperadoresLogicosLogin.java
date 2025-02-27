package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // Se inicializan las variables de nombre de usuario y contraseña
        String username = "brian";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        // Creamos un objeto Scanner para capturar datos desde la consola
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese su nombre de usuario
        System.out.println("Ingresa el username");
        String u = sc.next();  // Captura el nombre de usuario ingresado

        // Solicitamos al usuario que ingrese su contraseña
        System.out.println("Ingresa el password");
        String p = sc.next();  // Captura la contraseña ingresada

        // Creamos una variable booleana para indicar si el usuario está autenticado
        boolean esAutenticado = false;

        // Verificamos si el nombre de usuario y la contraseña coinciden con alguna de las opciones válidas
        if ( (username.equals(u) && password.equals(p)) || // Verificamos si username y password son correctos para el primer usuario
                (username2.equals(u) && password2.equals(p)) ) {  // O si son correctos para el segundo usuario
            esAutenticado = true;  // Si las credenciales son correctas, cambiamos esAutenticado a true
        } else {
            System.out.println("Username o contraseña incorrecta!");  // Si las credenciales son incorrectas, mostramos mensaje de error
        }

        // Si el usuario está autenticado, mostramos un mensaje de bienvenida
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));  // Usamos concat para mostrar el nombre del usuario
        } else {
            System.out.println("Lo siento, requiere autenticación");  // Si no está autenticado, mostramos mensaje de error
        }

    }
}
