package Arreglos;

import java.util.Arrays;

public class EjemploArreglosString {
    public static void main(String[] args) {

        // Se crea un arreglo de cadenas con 7 elementos, cada uno representando un producto.
        String[] productos = new String[7];

// Asignamos valores a cada uno de los elementos del arreglo.
        productos[0] = "Kingston Pendrive 64GB";  // Asignamos el nombre de un pendrive.
        productos[1] = "Samsung Galaxy";  // Asignamos el nombre de un teléfono Samsung Galaxy.
        productos[2] = "Disco Duro SSD";  // Asignamos el nombre de un disco duro SSD.
        productos[3] = "Asus Notebook";  // Asignamos el nombre de una notebook Asus.
        productos[4] = "Macbook Air";  // Asignamos el nombre de una laptop Macbook Air.
        productos[5] = "ChromeCast 4ta generación";  // Asignamos el nombre de un dispositivo ChromeCast.
        productos[6] = "Bicicleta Oxford";  // Asignamos el nombre de una bicicleta Oxford.

// Usamos Arrays.sort() para ordenar alfabéticamente el arreglo de productos.
        Arrays.sort(productos);

// Se asignan las posiciones del arreglo ordenado a variables individuales.
        String prod1 = productos[0];  // Asigna el primer producto del arreglo ordenado a 'prod1'.
        String prod2 = productos[1];  // Asigna el segundo producto del arreglo ordenado a 'prod2'.
        String prod3 = productos[2];  // Asigna el tercer producto del arreglo ordenado a 'prod3'.
        String prod4 = productos[3];  // Asigna el cuarto producto del arreglo ordenado a 'prod4'.
        String prod5 = productos[4];  // Asigna el quinto producto del arreglo ordenado a 'prod5'.
        String prod6 = productos[5];  // Asigna el sexto producto del arreglo ordenado a 'prod6'.
        String prod7 = productos[6];  // Asigna el séptimo producto del arreglo ordenado a 'prod7'.

// Se imprime el valor de cada variable que contiene el producto ordenado.
        System.out.println("productos[0] = " + prod1);  // Imprime el primer producto ordenado.
        System.out.println("productos[1] = " + prod2);  // Imprime el segundo producto ordenado.
        System.out.println("productos[2] = " + prod3);  // Imprime el tercer producto ordenado.
        System.out.println("productos[3] = " + prod4);  // Imprime el cuarto producto ordenado.
        System.out.println("productos[4] = " + prod5);  // Imprime el quinto producto ordenado.
        System.out.println("productos[5] = " + prod6);  // Imprime el sexto producto ordenado.
        System.out.println("productos[6] = " + prod7);  // Imprime el séptimo producto ordenado.


    }
}
