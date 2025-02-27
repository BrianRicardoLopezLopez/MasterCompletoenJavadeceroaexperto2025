package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        // Se crea un arreglo de cadenas con 7 elementos, cada uno representando un producto.
        String[] productos = new String[7];

        // Se obtiene el tamaño del arreglo 'productos' y se asigna a la variable 'total'.
        int total = productos.length;  // 'total' almacena la cantidad de productos (7).

        // Asignamos valores a cada uno de los elementos del arreglo 'productos'.
        productos[0] = "Kingston Pendrive 64GB";  // Asignamos el nombre de un pendrive.
        productos[1] = "Samsung Galaxy";  // Asignamos el nombre de un teléfono Samsung Galaxy.
        productos[2] = "Disco Duro SSD";  // Asignamos el nombre de un disco duro SSD.
        productos[3] = "Asus Notebook";  // Asignamos el nombre de una notebook Asus.
        productos[4] = "Macbook Air";  // Asignamos el nombre de una laptop Macbook Air.
        productos[5] = "ChromeCast 4ta generación";  // Asignamos el nombre de un dispositivo ChromeCast.
        productos[6] = "Bicicleta Oxford";  // Asignamos el nombre de una bicicleta Oxford.

        // Usamos Arrays.sort() para ordenar alfabéticamente el arreglo de productos.
        Arrays.sort(productos);

        // Mostramos el contenido del arreglo 'productos' utilizando un bucle for tradicional.
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice = " + i + " : " + productos[i]);  // Imprime el producto en el índice 'i'.
        }

        System.out.println("=================Usando Foreach===================");

        // Usamos un bucle foreach para recorrer el arreglo de productos.
        for (String prod : productos) {
            System.out.println("prod = " + prod);  // Imprime cada producto en el arreglo.
        }

        System.out.println("=================Usando While===================");

        // Usamos un bucle while para recorrer el arreglo 'productos'.
        int i = 0;
        while (i < total) {
            System.out.println("Para el indice = " + i + " : " + productos[i]);  // Imprime el producto en el índice 'i'.
            i++;  // Incrementa el índice 'i'.
        }

        System.out.println("=================Usando Do While===================");

        // Usamos un bucle do-while para recorrer el arreglo 'productos'.
        int j = 0;
        do {
            System.out.println("Para el indice = " + j + " : " + productos[j]);  // Imprime el producto en el índice 'j'.
            j++;  // Incrementa el índice 'j'.
        } while (j < total);  // El bucle continúa mientras 'j' sea menor que 'total'.

        // Se crea un arreglo de enteros con 10 elementos.
        int[] numeros = new int[10];

        // Se obtiene el tamaño del arreglo 'numeros' y se asigna a la variable 'totalNumeros'.
        int totalNumeros = numeros.length;  // 'totalNumeros' almacena la cantidad de elementos en 'numeros' (10).

        // Usamos un bucle for para llenar el arreglo 'numeros' con múltiplos de 3.
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3;  // Asignamos a cada índice 'k' un valor múltiplo de 3.
        }

        // Usamos un bucle for para imprimir los valores en el arreglo 'numeros'.
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);  // Imprime el valor de 'numeros' en el índice 'k'.
        }

    }
}
