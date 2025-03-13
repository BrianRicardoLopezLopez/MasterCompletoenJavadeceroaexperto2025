public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {

        // Declaración de dos matrices: a de tamaño 8x4 y b de tamaño 4x8
        int[][] a, b;
        a = new int[8][4]; // Matriz original de 8 filas y 4 columnas
        b = new int[4][8]; // Matriz transpuesta de 4 filas y 8 columnas

        // Llenado de la matriz a con valores específicos y luego imprimiéndola
        for (int i = 0; i < a.length; i++) { // Recorre las filas de la matriz a (de 0 a 7)
            for (int j = 0; j < a[i].length; j++) { // Recorre las columnas de la matriz a (de 0 a 3)
                // Asigna el valor a[i][j] basado en la fórmula i + j * 3
                a[i][j] = i + j * 3;
                System.out.print(a[i][j] + "\t"); // Imprime cada elemento de la fila de la matriz a
            }
            System.out.println(); // Salto de línea después de imprimir una fila de la matriz a
        }

        // Transposición de la matriz a a la matriz b
        for (int i = 0; i < a.length; i++) { // Recorre las filas de la matriz a (de 0 a 7)
            for (int j = 0; j < a[i].length; j++) { // Recorre las columnas de la matriz a (de 0 a 3)
                // Realiza la transposición: coloca los elementos de a[i][j] en b[j][i]
                b[j][i] = a[i][j];
            }
        }

        // Impresión de la matriz transpuesta b
        System.out.println("La Matriz transpuesta b: ");
        for (int i = 0; i < b.length; i++) { // Recorre las filas de la matriz b (de 0 a 3)
            for (int j = 0; j < b[i].length; j++) { // Recorre las columnas de la matriz b (de 0 a 7)
                // Imprime cada elemento de la matriz transpuesta b
                System.out.print(b[i][j] + "\t");
            }
            System.out.println(); // Salto de línea después de imprimir una fila de la matriz b
        }
    }
}
