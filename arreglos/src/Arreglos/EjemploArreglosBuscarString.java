package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
// Se crea un arreglo de Strings de tamaño 4
        String[] a = new String[4];

// Se crea un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

// Un ciclo for para pedir al usuario que ingrese 4 nombres
        for (int i = 0; i < a.length; i++) {
            // Se solicita al usuario que ingrese un nombre
            System.out.println("Ingresa un nombre: ");
            // Se guarda el nombre ingresado en la posición i del arreglo
            a[i] = s.next();
        }

// Después de que el usuario ingresa los nombres, se pide un nombre a buscar
        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();

// Inicialización del índice para la búsqueda
        int i = 0;

        // Se inicia un ciclo while para buscar el nombre en el arreglo
        // El ciclo continúa mientras i sea menor que el tamaño del arreglo (a.length)
        // y el nombre en la posición i del arreglo no sea igual al nombre buscado (ignorando mayúsculas/minúsculas)
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)) {
            i++;  // Si el nombre no coincide, incrementamos el índice i
        }

        // Si i ha llegado al final del arreglo y no se ha encontrado el nombre,
        // significa que no existe en el arreglo
        if (i == a.length) {
            System.out.println("Nombre no encontrado"); // Se imprime que el nombre no se encontró
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            // Si el nombre en la posición i es igual al nombre buscado (ignorando mayúsculas/minúsculas),
            // significa que fue encontrado
            System.out.println("Encontrado en la posición: " + i); // Se imprime la posición del nombre
        }

    }
}
