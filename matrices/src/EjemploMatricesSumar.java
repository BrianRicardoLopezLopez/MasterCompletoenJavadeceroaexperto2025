public class EjemploMatricesSumar {
    public static void main(String[] args) {

        // Definición de dos matrices 3x3
        int[][] a = {
                {1, 2, 3}, // Fila 1 de la matriz a
                {4, 5, 6}, // Fila 2 de la matriz a
                {7, 8, 9}  // Fila 3 de la matriz a
        };
        int[][] b = {
                {10, 20, 30}, // Fila 1 de la matriz b
                {40, 50, 60}, // Fila 2 de la matriz b
                {70, 80, 90}  // Fila 3 de la matriz b
        };

        // Declaración de una matriz para almacenar la suma
        int[][] suma = new int[3][3]; // La matriz resultante de 3x3

        // Sumar las matrices a y b y almacenar el resultado en la matriz suma
        for (int i = 0; i < a.length; i++) { // Recorre las filas de las matrices a y b
            for (int j = 0; j < a[i].length; j++) { // Recorre las columnas de las matrices a y b
                suma[i][j] = a[i][j] + b[i][j]; // Suma elemento por elemento
            }
        }

        // Imprimir la matriz resultado de la suma
        for (int i = 0; i < suma.length; i++) { // Recorre las filas de la matriz suma
            for (int j = 0; j < suma[i].length; j++) { // Recorre las columnas de la matriz suma
                System.out.print(suma[i][j] + "\t"); // Imprime cada valor de la matriz suma
            }
            System.out.println(); // Salto de línea después de imprimir una fila de la matriz suma
        }
    }
}
