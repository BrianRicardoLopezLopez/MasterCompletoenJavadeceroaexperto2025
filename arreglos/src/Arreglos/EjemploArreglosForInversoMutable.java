package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    // Metodo que invierte el arreglo usando un enfoque manual
    public static void arregloInverso(String[] arreglo) {
        int totalProductos = arreglo.length;

        for (int i = 0; i < totalProductos / 2; i++) {
            // Intercambiar elementos
            String actual = arreglo[i];
            String inverso = arreglo[totalProductos - 1 - i];
            arreglo[i] = inverso;
            arreglo[totalProductos - 1 - i] = actual;
        }
    }

    public static void main(String[] args) {
        // Crear un arreglo con productos.
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD 1TB", "Asus Notebook",
                "Macbook Air", "ChromeCast 4ta generación",
                "Bicicleta Oxford"};

        // Obtener el total de productos
        int totalProductos = productos.length;

        // Ordenar el arreglo de productos alfabéticamente
        Arrays.sort(productos);

        // Invertir el arreglo usando el método propio
        arregloInverso(productos);

        // Mostrar el arreglo invertido
        System.out.println("Arreglo invertido manualmente:");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Para el indice = " + i + " : " + productos[i]);
        }

        System.out.println("\nSegunda lista");

        // Crear otro arreglo con productos
        String[] productos2 = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD 2TB", "Asus Notebook",
                "Macbook Air", "ChromeCast 4ta generación",
                "Bicicleta Oxford"};

        // Obtener el total de productos de la segunda lista
        int total2 = productos2.length;

        // Ordenar el arreglo de productos2 alfabéticamente
        Arrays.sort(productos2);

        // Invertir el arreglo usando Collections.reverse() y Arrays.asList()
        Collections.reverse(Arrays.asList(productos2));

        // Mostrar el arreglo invertido usando Collections.reverse()
        System.out.println("Arreglo invertido usando Collections.reverse:");
        for (int i = 0; i < total2; i++) {
            System.out.println("Para el indice = " + i + " : " + productos2[i]);
        }
    }
}
