package Arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminar {
    public static void main(String[] args) {

        // Se crea un arreglo de enteros con 10 posiciones
        int[] a = new int[10];

// Se crea un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

// Un ciclo for para pedir al usuario que ingrese 10 números
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }

// Se imprime una línea en blanco para separar las salidas
        System.out.println();

// Se pide al usuario la posición a eliminar
        System.out.println("Ingresa una posición a eliminar entre el (0 - 9):");
        int posicion = s.nextInt();

// Mueve los elementos del arreglo para llenar el vacío dejado por el número eliminado
// Comienza desde la posición indicada por el usuario y mueve todos los elementos hacia la izquierda
        for (int i = posicion; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

// Imprime el arreglo original (aún con el número eliminado, pero desplazado)
        System.out.println("Este es el arreglo original donde aún se repite el arreglo eliminado");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }

// Se crea un nuevo arreglo con una posición menos
        int[] b = new int[a.length - 1];

// Usamos System.arraycopy para copiar todos los elementos de 'a' a 'b' (sin la última posición)
        System.arraycopy(a, 0, b, 0, b.length);

// Se imprime el nuevo arreglo, donde ya no aparece el número eliminado
        System.out.println();
        System.out.println("Este es el nuevo arreglo donde no se repite el número");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }

    }
}
