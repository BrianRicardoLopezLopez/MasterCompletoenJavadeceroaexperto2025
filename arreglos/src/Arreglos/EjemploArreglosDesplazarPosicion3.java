package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        // Se crea un arreglo de enteros de tamaño 7
        int[] a = new int[7];
// Variables para almacenar el número a insertar y la posición en la que se insertará
        int num, posicion;

// Se crea un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

// Un ciclo for para pedir al usuario que ingrese 6 números, dejando la última posición vacía
        for (int i = 0; i < a.length - 1; i++) {
            // Se solicita al usuario que ingrese un número
            System.out.print("Ingrese un número: ");
            // Se guarda el número ingresado en la posición i del arreglo
            a[i] = s.nextInt();
        }

// Se imprime una línea en blanco para separar las salidas
        System.out.println();

// Se solicita al usuario que ingrese el número que desea insertar
        System.out.println("Ingrese un número a insertar:");
        num = s.nextInt();

// Se inicializa la posición a 0
        posicion = 0;

// El ciclo while recorre el arreglo para encontrar la posición donde insertar el número
// La condición es que se debe insertar el número en la primera posición donde sea mayor que el número en el arreglo
        while (posicion < 6 && num > a[posicion]) {
            posicion++; // Si el número es mayor que el número en la posición actual, avanzamos a la siguiente posición
        }

// Se mueve cada elemento desde la última posición hasta la posición donde se va a insertar el número
        for (int i = a.length - 2; i >= posicion; i--) {
            // Desplazamos el número de la posición i a la siguiente (i+1) para hacer espacio
            a[i + 1] = a[i];
        }

// Finalmente, insertamos el número en la posición correcta
        a[posicion] = num;

// Se imprime el arreglo resultante
        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < a.length; i++) {
            // Se imprime cada elemento del arreglo con su índice
            System.out.println(i + " => " + a[i]);
        }
    }
}
