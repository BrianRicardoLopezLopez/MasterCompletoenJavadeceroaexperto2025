package Arreglos;

public class EjemploArreglosForOrdenamientoBurbujaNum2 {

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

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;  // Obtiene la longitud del arreglo.

        int count = 0;  // Inicializa un contador para contar el número de comparaciones realizadas.

        // El primer bucle 'for' es el bucle externo, que recorre el arreglo para realizar el número adecuado de pasadas.
        for (int i = 0; i < total - 1; i++) {

            // El segundo bucle 'for' es el bucle interno, que compara elementos adyacentes.
            for (int j = 0; j < total - 1 - i; j++) {
                // Compara los elementos adyacentes utilizando 'compareTo' (para que funcione con cualquier tipo de objeto comparable)
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    // Si el elemento de la izquierda es mayor que el de la derecha, se intercambian.
                    Object aux = arreglo[j];  // Se guarda el valor de 'arreglo[j]' en una variable auxiliar.
                    arreglo[j] = arreglo[j + 1];  // El valor de 'arreglo[j + 1]' se asigna a 'arreglo[j]'.
                    arreglo[j + 1] = aux;  // Se asigna el valor guardado en 'aux' a 'arreglo[j + 1]'.
                }

                count++;  // Incrementa el contador de comparaciones.
            }
        }

        // Después de ordenar, se imprime el número total de comparaciones realizadas.
        System.out.println("count = " + count);  // Imprime el número de comparaciones.
    }

    public static void main(String[] args) {
        // Crear un arreglo de cadenas con productos.
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD 1TB", "Asus Notebook",
                "Macbook Air", "ChromeCast 4ta generación",
                "Bicicleta Oxford"};

        // Obtener el total de productos.
        int totalProductos = productos.length;

        // Llamamos al metodo de ordenamiento burbuja para ordenar el arreglo de productos.
        sortBurbuja(productos);

        // Imprimir los productos ordenados después de ordenar.
        System.out.println("==== Usando For ====");
        for (int i = 0; i < totalProductos; i++) {
            // Imprime cada producto junto con su índice.
            System.out.println("Para el indice = " + i + " : " + productos[i]);
        }

        // Crear un arreglo de enteros con 4 elementos.
        Integer[] numeros = new Integer[4];  // Se crea un arreglo de enteros con 4 elementos.

        // Asignamos valores a los elementos del arreglo 'numeros'.
        numeros[0] = 10;  // Asigna el valor 10 al primer elemento.
        numeros[1] = Integer.valueOf("7");  // Convierte la cadena "7" a un valor entero y lo asigna.
        numeros[2] = 35;  // Asigna el valor 35 al tercer elemento.
        numeros[3] = -1;  // Asigna el valor -1 al cuarto elemento.

        // Llamamos al método de ordenamiento burbuja para ordenar el arreglo de enteros.
        sortBurbuja(numeros);

        // Imprimir los números ordenados después de ordenar.
        for (int i = 0; i < numeros.length; i++) {
            // Imprime el índice y el valor del arreglo 'numeros' en cada posición.
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }

}