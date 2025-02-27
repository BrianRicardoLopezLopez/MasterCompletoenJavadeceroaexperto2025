package Arreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];  // Se crea un arreglo de enteros con 4 elementos.

        numeros[0] = 10;  // Asigna el valor 10 al primer elemento del arreglo.
        numeros[1] = Integer.valueOf("7");  // Convierte la cadena "7" en un valor entero y lo asigna al segundo elemento del arreglo.
        numeros[2] = 35;  // Asigna el valor 35 al tercer elemento del arreglo.
        numeros[3] = -1;  // Asigna el valor -1 al cuarto elemento del arreglo.

        //Usamos Arrays.sort() para ordenar alfabéticamente el arreglo de números
        Arrays.sort(numeros);
        int i = numeros[0];  // Asigna el primer valor del arreglo (10) a la variable 'i'.
        int j = numeros[1];  // Asigna el segundo valor del arreglo (7) a la variable 'j'.
        int k = numeros[2];  // Asigna el tercer valor del arreglo (35) a la variable 'k'.
        int l = numeros[numeros.length - 1];  // Asigna el valor del último elemento del arreglo (-1) a la variable 'l'.

        System.out.println("i = " + i);  // Imprime el valor de la variable 'i' (10).
        System.out.println("j = " + j);  // Imprime el valor de la variable 'j' (7).
        System.out.println("k = " + k);  // Imprime el valor de la variable 'k' (35).
        System.out.println("l = " + l);  // Imprime el valor de la variable 'l' (-1).

    }
}
