package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

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

        // Obtener el total de productos (tamaño del arreglo).
        int totalProductos = productos.length;

        // Variable para contar las comparaciones realizadas en el algoritmo de ordenamiento.
        int count = 0;

        // Empezamos un ciclo para ordenar los productos (algoritmo de burbuja).
        for (int i = 0; i < totalProductos; i++) { // Itera sobre cada elemento del arreglo
            for (int j = 0; j < totalProductos; j++) { // Itera nuevamente desde el principio
                // Si el producto en el índice i es alfabéticamente mayor que el del índice j, se intercambian
                if (productos[i].compareTo(productos[j]) < 0) {
                    // Intercambiar los elementos si no están en orden alfabético
                    String aux = productos[i]; // Guardar el producto en i en una variable auxiliar
                    productos[i] = productos[j]; // Asignar el producto en j a i
                    productos[j] = aux; // Asignar el valor almacenado en aux (producto i) a j
                }
                // Incrementamos el contador para contar cada comparación que se hace
                count++;
            }
        }

        // Imprimir el número total de comparaciones realizadas
        System.out.println("count = " + count);

        // Imprimir los productos ordenados utilizando un ciclo for
        System.out.println("==== Usando For ====");
        for (int i = 0; i < totalProductos; i++) {
            // Imprimir cada producto junto con su índice en el arreglo
            System.out.println("Para el indice = " + i + " : " + productos[i]);
        }
    }

}
