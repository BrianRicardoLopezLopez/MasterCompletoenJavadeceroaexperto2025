public class EjemploMatricesIdentidad {
    public static void main(String[] args) {

        // Creamos una matriz de 5x5 de enteros, que inicialmente tendrá todos los valores como 0
        int[][] matriz = new int[5][5];

        // Este bucle recorre las filas de la matriz
        for (int i = 0; i < matriz.length; i++) {  // 'i' recorre las filas
            // Este bucle recorre las columnas de cada fila
            for (int j = 0; j < matriz[i].length; j++) {  // 'j' recorre las columnas
                if (i == j) {  // Si el índice de fila es igual al índice de columna (diagonal principal)
                    matriz[i][j] = 1;  // Colocamos un 1 en la diagonal principal
                }
            }
        }

        // Este bucle se utiliza para imprimir la matriz resultante
        for (int i = 0; i < matriz.length; i++) {  // Recorremos las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorremos las columnas
                System.out.print(matriz[i][j] + "\t");  // Imprimimos el valor de la celda actual con un tabulador
            }
            System.out.println();  // Imprimimos un salto de línea después de cada fila
        }
    }
}
