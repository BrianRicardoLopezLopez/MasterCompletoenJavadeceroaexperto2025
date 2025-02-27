package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArreglosTernario {
    public static void main(String[] args) {

        // Primera forma de hacer un arreglo: Inicialización explícita del tamaño de los arreglos
        // Creamos dos arreglos de tipo String con un tamaño específico, en este caso de 3 elementos.
        /*String[] usernames = new String[3];  // Arreglo para almacenar nombres de usuario
        String[] passwords = new String[3];  // Arreglo para almacenar contraseñas

        // Asignamos valores a cada uno de los elementos del arreglo
        usernames[0] = "brian";   // El primer nombre de usuario es "brian"
        passwords[0] = "12345";   // La contraseña correspondiente a "brian" es "12345"

        usernames[1] = "admin";   // El segundo nombre de usuario es "admin"
        passwords[1] = "12345";   // La contraseña correspondiente a "admin" es "12345"

        usernames[2] = "pepe";    // El tercer nombre de usuario es "pepe"
        passwords[2] = "12345";   // La contraseña correspondiente a "pepe" es "12345"*/

        // Segunda forma de definir y asignar valores a los arreglos
        // Definimos dos arreglos: uno para usernames y otro para passwords.
        String[] usernames = {"brian", "admin", "pepe"};  // Arreglo de nombres de usuario
        String[] passwords = {"123", "1234", "12345"};  // Arreglo de contraseñas correspondientes

        // Creamos un objeto Scanner para recibir datos desde la consola
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese su nombre de usuario
        System.out.println("Ingresa el username");
        String u = sc.next();  // Captura el nombre de usuario ingresado

        // Solicitamos al usuario que ingrese su contraseña
        System.out.println("Ingresa el password");
        String p = sc.next();  // Captura la contraseña ingresada

        // Inicializamos una variable booleana para saber si el usuario está autenticado
        boolean esAutenticado = false;

        // Recorremos ambos arreglos de usernames y passwords
        for (int i = 0; i < usernames.length; i++) {

            // Usamos el operador ternario para actualizar esAutenticado, si encontramos una coincidencia
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
            /*
             * Comparamos si el nombre de usuario y la contraseña coinciden con algún par en los arreglos.
             * Si encontramos una coincidencia, se marca como autenticado y no es necesario seguir buscando.
             * Si no hay coincidencia, esAutenticado no cambia.
             */

            /* // Comparamos si el nombre de usuario y la contraseña coinciden con algún par en los arreglos
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutenticado = true;  // Si coincide, se autentica al usuario
                break;  // Terminamos el bucle si encontramos una coincidencia
            }*/
        }

        // Usamos el operador ternario para definir el mensaje final según si la autenticación fue exitosa o no
        String mensaje = esAutenticado ?
                "Bienvenido usuario ".concat(u).concat("!") :  // Si es autenticado, mensaje de bienvenida
                "Username o contraseña incorrecta! \nLo sentimos, requiere autenticación"; // Si no, mensaje de error

        // Mostramos el mensaje final en consola
        System.out.println("mensaje = " + mensaje);
       /* // Si el usuario está autenticado, mostramos un mensaje de bienvenida
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            // Si no está autenticado, mostramos un mensaje de error
            System.out.println("Username o contraseña incorrecta!");
            System.out.println("Lo siento, requiere autenticación");
        }*/

    }
}
