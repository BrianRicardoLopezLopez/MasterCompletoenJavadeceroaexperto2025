package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        // Se crea un arreglo de enteros con 10 elementos
        int[] a = new int[10];
// Variables para almacenar el nuevo elemento y la posición en la que se debe insertar
        int elemento, posicion;
// Se crea un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

// Un ciclo for para pedir al usuario que ingrese 9 números (ya que el arreglo tiene 10 elementos)
        for (int i = 0; i < a.length - 1; i++) {
            // Se solicita al usuario que ingrese un número
            System.out.print("Ingresa el número: ");
            // Se guarda el número ingresado en la posición i del arreglo
            a[i] = s.nextInt();
        }

// Se imprime una línea en blanco para separar las salidas
        System.out.println();

// Se solicita un nuevo elemento para agregar al arreglo
        System.out.println("Ingresa un nuevo elemento");
        elemento = s.nextInt();

// Se solicita la posición en la que el usuario desea agregar el nuevo elemento (entre 0 y 9)
        System.out.println("Ingresa la posición donde agregar (0 de 9)");
        posicion = s.nextInt();

// El ciclo for se encarga de mover los elementos hacia la derecha, empezando desde el último elemento hacia la posición indicada por el usuario
        for (int i = a.length - 2; i >= posicion; i--) {
            // Desplazamos cada número una posición a la derecha para hacer espacio para el nuevo elemento
            a[i + 1] = a[i];
        }

// Finalmente, colocamos el nuevo elemento en la posición indicada por el usuario
        a[posicion] = elemento;

// Se imprime el arreglo después de la inserción
        System.out.println("El arreglo");
        for (int i = 0; i < a.length; i++) {
            // Se imprime cada elemento del arreglo con su índice
            System.out.println(i + " = " + a[i]);
        }
    }
}
