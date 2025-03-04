package Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {

        // Se declara un arreglo 'a' de 5 elementos de tipo entero
        int[] a = new int[5];

// Se crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

// Se solicita al usuario ingresar 5 enteros
        System.out.println("Ingresa 5 enteros:");

        // Se usa un ciclo 'for' para leer los 5 enteros ingresados por el usuario y almacenarlos en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();  // Lee el siguiente entero y lo asigna a la posición correspondiente en el arreglo 'a'
        }

        // Se inicializa la variable 'max' con el valor 0 (esto es el índice del primer elemento)
        int max = 0;

        // Se utiliza otro ciclo 'for' para recorrer el arreglo y encontrar el índice del valor máximo
        for (int i = 1; i < a.length; i++) {  // Comienza desde el segundo elemento (índice 1)
            // Compara el valor actual con el valor máximo encontrado hasta ahora (a[max])
            // Si a[max] es mayor que a[i], se mantiene el valor de 'max', de lo contrario, se actualiza a 'i' (el nuevo índice del mayor valor)
            max = (a[max] > a[i]) ? max : i;  // Si a[max] es mayor, 'max' sigue igual, sino, se actualiza con 'i'
        }

        // Después de que el ciclo recorre todo el arreglo 'max' tendrá el índice del valor más grande en 'a'
        // Se imprime el valor máximo encontrado en el arreglo
        System.out.println("max = " + a[max]);

    }
}
