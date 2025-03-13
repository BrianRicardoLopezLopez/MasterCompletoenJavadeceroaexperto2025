public class EjemploMatricesMultiplicar {
    public static void main(String[] args) {

        // Definición de la primera matriz 'a'
        int[][] a = {
                {1, 2, 3}, // Fila 1 de la matriz a
                {4, 5, 6}, // Fila 2 de la matriz a
                {7, 8, 9}  // Fila 3 de la matriz a
        };

        // Definición de la segunda matriz 'b'
        int[][] b = {
                {10, 20, 30}, // Fila 1 de la matriz b
                {40, 50, 60}, // Fila 2 de la matriz b
                {70, 80, 90}  // Fila 3 de la matriz b
        };

        // Definición de la matriz 'mul' para almacenar el resultado
        int[][] mul = new int[3][3]; // Crear una matriz de 3x3 para almacenar los resultados

        // Multiplicación elemento por elemento de las matrices 'a' y 'b'
        for (int i = 0; i < a.length; i++) { // Recorre las filas de la matriz 'a'
            for (int j = 0; j < a[i].length; j++) { // Recorre las columnas de la matriz 'a'
                // Multiplica los elementos correspondientes de las matrices 'a' y 'b'
                // y los almacena en la matriz 'mul'
                mul[i][j] = a[i][j] * b[i][j];
            }
        }

        // Imprimir la matriz 'mul' que contiene los resultados de la multiplicación
        for (int i = 0; i < mul.length; i++) { // Recorre las filas de la matriz 'mul'
            for (int j = 0; j < mul[i].length; j++) { // Recorre las columnas de la matriz 'mul'
                // Imprime el valor de cada elemento de la matriz 'mul' con un tabulador entre ellos
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println(); // Salto de línea después de imprimir cada fila
        }
    }
}
