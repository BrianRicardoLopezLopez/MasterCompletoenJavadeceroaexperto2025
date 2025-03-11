public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        // Variable para determinar si la matriz es simétrica o no
        boolean simetrica = true;

        // Definición de la matriz cuadrada 4x4
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        int i, j; // Variables para recorrer las filas y columnas de la matriz
        i = 0; // Inicializamos i en 0 (comenzamos con la primera fila)

        while (i < matriz.length && simetrica) {  // Recorremos las filas de la matriz (matriz.length = 4)
            j = 0; // Inicializamos j en 0 para recorrer las columnas

            // Solo comparamos los elementos en el triángulo inferior de la matriz (debajo de la diagonal principal)
            while (j < i && simetrica) {  // Recorremos las columnas de la fila i (pero solo hasta la diagonal)

                // Si encontramos un valor distinto en la posición [i][j] y [j][i], la matriz no es simétrica
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;  // La matriz no es simétrica, cambiamos la variable a false
                }

                j++;  // Aumentamos j para seguir comparando la siguiente columna
            }

            i++;  // Aumentamos i para pasar a la siguiente fila
        }

        // Si simetrica sigue siendo true, la matriz es simétrica, de lo contrario no lo es
        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }

    }
}
