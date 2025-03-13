import java.util.Scanner;

public class ProgramaImprimirSilla {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();  // Leemos el tamaño n de la matriz

        // Creamos la matriz de tamaño n x n
        int[][] matriz = new int[n][n];

        // Si el tamaño es 0, mostramos un mensaje de error y salimos del programa
        if (n == 0) {
            System.out.println("ERROR");  // Si el tamaño es 0, no se puede crear una matriz
            System.exit(1);  // Terminamos el programa de inmediato
        }

        // Llenamos la matriz con 1's y 0's de acuerdo a la forma de una silla
        for (int i = 0; i < n; i++) {  // Recorremos cada fila
            for (int j = 0; j < n; j++) {  // Recorremos cada columna dentro de la fila
                // Verificamos si estamos en la primera columna (j == 0)
                // o si estamos en la fila media (i == n / 2) pero no en la primera ni en la última columna
                // o si estamos en la última columna (j == n - 1) pero en filas desde la mitad en adelante (i >= n / 2)
                if ((j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)) {
                    matriz[i][j] = 1;  // Si se cumple alguna de las condiciones, colocamos un 1 en la posición
                } else {
                    matriz[i][j] = 0;  // Si no se cumple ninguna condición, colocamos un 0
                }
            }
        }

        // Recorremos e imprimimos la matriz para mostrar la figura de la silla
        for (int i = 0; i < n; i++) {  // Recorremos las filas
            for (int j = 0; j < n; j++) {  // Recorremos las columnas
                System.out.print(matriz[i][j]);  // Imprimimos el valor de la posición [i][j] en la matriz
            }
            System.out.println();  // Al terminar de imprimir una fila, imprimimos un salto de línea para la siguiente fila
        }
    }
}
