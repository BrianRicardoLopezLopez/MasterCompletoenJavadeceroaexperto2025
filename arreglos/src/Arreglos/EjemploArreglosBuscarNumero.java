package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
// Se crea un arreglo de enteros de tamaño 10
        int[] a = new int[10];

// Se crea un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

// Un ciclo for para pedir al usuario que ingrese 10 números
        for (int i = 0; i < a.length; i++) {
            // Se solicita al usuario que ingrese un número
            System.out.println("Ingresa un número: ");
            // Se guarda el número ingresado en la posición i del arreglo
            a[i] = s.nextInt();
        }

// Después de haber ingresado todos los números, se pide al usuario un número a buscar
        System.out.println("\r\nIngrese un número a buscar: ");
        int num = s.nextInt();

// Inicialización del índice para la búsqueda
        int i = 0;

        // Se inicia un ciclo while para buscar el número en el arreglo
        // El ciclo continúa mientras i sea menor que el tamaño del arreglo (a.length)
        // y el número en la posición i del arreglo no sea igual al número buscado
        while (i < a.length && a[i] != num){
            i++;  // Si no se encuentra el número, incrementamos el índice i
        }

        // Si i ha llegado al final del arreglo y no se ha encontrado el número,
        // significa que no existe en el arreglo
        if(i == a.length){
            System.out.println("Número no encontrado"); // Se imprime que el número no se encontró
        } else if (a[i] == num) {
            // Si el número en la posición i es igual al número buscado, significa que fue encontrado
            System.out.println("Encontrado en la posición: " + i); // Se imprime la posición del número
        }

    }
}
