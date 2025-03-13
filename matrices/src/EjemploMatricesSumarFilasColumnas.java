public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {

        // Declaración de las variables para las sumas de filas y columnas
        int sumaFila, sumaColumna;

        // Definición de la matriz 'a' de 3x3
        int[][] a = {
                {1, 2, 3}, // Fila 0 de la matriz
                {4, 5, 6}, // Fila 1 de la matriz
                {7, 8, 9}  // Fila 2 de la matriz
        };

        // Recorremos las filas de la matriz 'a'
        for (int i = 0; i < a.length; i++) {  // 'i' representa la fila actual
            sumaColumna = 0;  // Reseteamos la suma de la columna en cada iteración de fila
            sumaFila = 0;     // Reseteamos la suma de la fila en cada iteración de fila

            // Recorremos las columnas de la matriz 'a' en cada fila
            for (int j = 0; j < a[i].length; j++) {  // 'j' representa la columna actual
                sumaFila += a[i][j];  // Sumamos los elementos de la fila
                sumaColumna += a[j][i];  // Sumamos los elementos de la columna
            }

            // Imprimimos el total de la fila actual
            System.out.println("Total fila " + i + ": " + sumaFila);

            // Imprimimos el total de la columna actual
            System.out.println("Total Columna " + i + ": " + sumaColumna);
        }
    }
}
