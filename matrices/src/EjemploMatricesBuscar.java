import java.util.Scanner;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        // Inicialización de una matriz de enteros de 3 filas y 4 columnas
        int[][] matrizDeEnteros = {
                {39, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        // Crear un objeto Scanner para leer entradas del usuario
        Scanner s = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número para buscar en la matriz
        System.out.println("Ingresa algún numero para buscarlo en la matriz");
        int elementoBuscar = s.nextInt();  // Lee el número ingresado por el usuario

        // Inicializar una variable 'encontrado' que indica si el número fue encontrado
        boolean encontrado = false;

        // Variables para los índices de las filas y columnas
        int i = 0;
        int j = 0;

        // Iniciar la búsqueda en la matriz
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {  // Itera sobre las filas
            for (j = 0; j < matrizDeEnteros[i].length; j++) {  // Itera sobre las columnas de cada fila
                if (matrizDeEnteros[i][j] == elementoBuscar) {  // Si el elemento en la posición actual coincide con el número a buscar
                    encontrado = true;  // Cambiar 'encontrado' a true
                    break buscar;  // Rompe ambos bucles, saliendo del ciclo de búsqueda
                }
            }
        }

        // Verifica si el número fue encontrado y muestra el resultado
        if (encontrado) {
            // Si fue encontrado, imprime las coordenadas (índices de fila y columna)
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + ", " + j);
        } else {
            // Si no fue encontrado, muestra un mensaje indicando que no se encontró
            System.out.println(elementoBuscar + " no se encontro en la matriz!");
        }

    }
}
