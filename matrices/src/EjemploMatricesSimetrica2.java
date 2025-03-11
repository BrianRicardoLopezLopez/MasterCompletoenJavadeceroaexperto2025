public class EjemploMatricesSimetrica2 {
    public static void main(String[] args) {

        // Inicializamos la variable simetrica en 'true', ya que inicialmente asumimos que la matriz es simétrica
        boolean simetrica = true;

        // Definimos la matriz cuadrada 4x4 para comprobar si es simétrica
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        // Utilizamos la etiqueta 'salir' para poder romper ambos bucles cuando encontremos una diferencia
        salir:
        for (int i = 0; i < matriz.length; i++) {  // Recorremos las filas de la matriz
            for (int j = 0; j < i; j++) {  // Recorremos las columnas por debajo de la diagonal principal (sin repetir elementos)
                // Comprobamos si el elemento en la posición [i][j] es igual al elemento en la posición [j][i]
                if (matriz[i][j] != matriz[j][i]) {
                    // Si encontramos que los elementos no son iguales, la matriz no es simétrica
                    simetrica = false;
                    break salir;  // Rompemos ambos bucles usando la etiqueta 'salir'
                }
            }
        }

        // Si la variable 'simetrica' sigue siendo 'true', la matriz es simétrica
        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }

    }
}
