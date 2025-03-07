package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        // Se crea un arreglo de enteros con 10 elementos
        int[] a = new int[10];
        // Variable que almacenará el último valor del arreglo
        int ultimo;
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

        // Un ciclo for para pedir al usuario que ingrese 10 números
        for (int i = 0; i < a.length; i++) {
            // Se solicita al usuario que ingrese un número
            System.out.print("Ingresa el número: ");
            // Se guarda el número ingresado en la posición i del arreglo
            a[i] = s.nextInt();
        }

        // Se imprime una línea en blanco para separar las salidas
        System.out.println();

        // Guardamos el último número ingresado en la variable "ultimo"
        ultimo = a[a.length - 1];

        // Empezamos a mover los elementos del arreglo una posición a la derecha
        // Comenzamos desde el penúltimo elemento hasta el primer elemento
        for (int i = a.length - 2; i >= 0; i--) {
            // Desplazamos cada número una posición a la derecha
            a[i + 1] = a[i];
        }

        // Colocamos el valor almacenado en "ultimo" en la primera posición (índice 0)
        a[0] = ultimo;

        // Se imprime el arreglo después de hacer el desplazamiento
        System.out.println("El arreglo");
        for (int i = 0; i < a.length; i++) {
            // Se imprime cada elemento del arreglo con su índice
            System.out.println(i + " = " + a[i]);
        }

    }
}
