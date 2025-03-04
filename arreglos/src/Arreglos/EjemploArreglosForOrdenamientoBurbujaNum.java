package Arreglos;

public class EjemploArreglosForOrdenamientoBurbujaNum {

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

        int[] numeros = new int[4];  // Se crea un arreglo de enteros con 4 elementos.

// Asignamos valores a los elementos del arreglo 'numeros'
        numeros[0] = 10;  // Asigna el valor 10 al primer elemento del arreglo.
        numeros[1] = Integer.valueOf("7");  // Convierte la cadena "7" en un valor entero y lo asigna al segundo elemento del arreglo.
        numeros[2] = 35;  // Asigna el valor 35 al tercer elemento del arreglo.
        numeros[3] = -1;  // Asigna el valor -1 al cuarto elemento del arreglo.

// Aquí comienza el algoritmo de ordenamiento tipo burbuja (Bubble Sort)
        for (int i = 0; i < numeros.length - 1; i++) {  // El bucle externo recorre el arreglo para hacer 'n - 1' pasadas
            for (int j = 0; j < numeros.length - 1 - i; j++) {  // El bucle interno compara los elementos adyacentes.

                // Compara dos elementos adyacentes: si el de la izquierda es mayor que el de la derecha, los intercambia.
                if (((Comparable) numeros[j + 1]).compareTo(numeros[j]) < 0) {

                    // Realiza el intercambio de los dos elementos si están desordenados
                    int aux = numeros[j];  // Guarda el valor de numeros[j] en una variable auxiliar.
                    numeros[j] = numeros[j + 1];  // Asigna el valor de numeros[j + 1] al índice j.
                    numeros[j + 1] = aux;  // Asigna el valor guardado en 'aux' al índice j + 1 (el valor original de 'j').
                }

                // La variable 'count' no está definida en el código proporcionado. Parece ser un contador, pero hay un error, ya que falta su declaración e inicialización.
                // count++;  // Incrementa 'count' (pero este código fallaría porque 'count' no está declarado en ningún lado).
            }
        }

// Después de ordenar, se imprimen los valores del arreglo en su estado final.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);  // Imprime el índice y el valor del arreglo 'numeros' en cada posición.
        }

    }

}