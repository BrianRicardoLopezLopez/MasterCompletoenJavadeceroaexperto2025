package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
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

        System.out.println("=== Usando for al inverso ===");
        // Usamos un bucle for para recorrer el arreglo de manera inversa.
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) + " valor " + productos[total - 1 - i]);  // Imprime los productos en orden inverso.
        }

        System.out.println("=== Usando for al inverso 2 ===");
        // Usamos un bucle for de retroceso (de atrás hacia adelante).
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor " + productos[i]);  // Imprime los productos en orden inverso.
        }

        // otra manera
        System.out.println();
        System.out.println("============================");
        // Crear otro arreglo con productos.
        String[] productos2 = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD 1TB", "Asus Notebook", "Macbook Air", "ChromeCast 4ta generación", "Bicicleta Oxford"};

        // Se obtiene el tamaño del arreglo 'productos2' y se asigna a la variable 'totalProductos'.
        int totalProductos = productos2.length;

        // Usamos Arrays.sort() para ordenar alfabéticamente el arreglo de productos.
        Arrays.sort(productos2);

        // Mostramos el contenido del arreglo 'productos2' utilizando un bucle for tradicional.
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Para el indice = " + i + " : " + productos2[i]);  // Imprime el producto en el índice 'i'.
        }

        System.out.println("=== Usando for al inverso ===");
        // Usamos un bucle for para recorrer el arreglo de manera inversa.
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("para i = " + (totalProductos - 1 - i) + " valor " + productos2[totalProductos - 1 - i]);  // Imprime los productos en orden inverso.
        }

        System.out.println("=== Usando for al inverso 2 ===");
        // Usamos un bucle for de retroceso (de atrás hacia adelante).
        for (int i = totalProductos - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor " + productos2[i]);  // Imprime los productos en orden inverso.
        }

    }
}
