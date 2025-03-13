public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {

        // Definición de una matriz de 4x4
        int[][] matriz = {
                {1, 2, 3, 4}, // Fila 1
                {5, 6, 7, 8}, // Fila 2
                {9, 10, 11, 12}, // Fila 3
                {13, 14, 15, 16} // Fila 4
        };

        // Imprime la matriz original
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de cada fila
                System.out.print(matriz[i][j] + "\t"); // Imprime el valor de la celda, con tabuladores entre ellos
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // Transposición de la matriz
        int aux; // Variable auxiliar para el intercambio de valores
        // Recorre la matriz para intercambiar elementos fuera de la diagonal principal
        for (int i = 1; i < matriz.length; i++) { // Comienza desde la segunda fila (i=1)
            for (int j = 0; j < i; j++) { // Solo recorre las celdas por debajo de la diagonal
                aux = matriz[i][j]; // Guarda el valor de la celda que será intercambiada
                matriz[i][j] = matriz[j][i]; // Coloca el valor de la celda simétrica (i,j) en la posición (j,i)
                matriz[j][i] = aux; // Coloca el valor guardado en la posición (i,j)
            }
        }

        // Imprime la matriz transpuesta
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz transpuesta
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de la matriz transpuesta
                System.out.print(matriz[i][j] + "\t"); // Imprime el valor de la celda de la matriz transpuesta
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
