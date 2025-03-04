package Arreglos;

public class EjemploArreglosForOrdenamientoBurbuja2 {

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

        // Optimizado
        int count = 0;

        // Este ciclo de i recorre el arreglo desde el principio hasta el penúltimo elemento
        for (int i = 0; i < totalProductos - 1; i++) {
            // Este ciclo de j recorre el arreglo desde el principio hasta el penúltimo elemento menos i
            // - i porque los elementos al final ya están ordenados en cada pasada
            for (int j = 0; j < totalProductos - 1 - i; j++) {
                // Compara dos productos consecutivos, si el siguiente producto es menor al anterior, los intercambia
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    // Intercambiar los productos usando una variable auxiliar
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
                // Incrementa el contador por cada comparación realizada
                count++;
            }
        }

        // Imprimir el número total de comparaciones realizadas
        System.out.println("count = " + count);

        // Imprimir los productos ordenados
        System.out.println("==== Usando For ====");
        for (int i = 0; i < totalProductos; i++) {
            // Imprime cada producto junto con su índice
            System.out.println("Para el indice = " + i + " : " + productos[i]);
        }
    }

}