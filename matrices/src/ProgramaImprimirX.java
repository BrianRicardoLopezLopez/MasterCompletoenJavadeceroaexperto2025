import java.util.Scanner;

public class ProgramaImprimirX {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el tamaño de la matriz (n x n)
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();  // Leemos el valor de n

        // Si el tamaño de la matriz es 0, mostramos un mensaje de error y terminamos el programa
        if (n == 0) {
            System.out.println("ERROR");  // Imprime un mensaje de error si n es 0
            System.exit(1);  // Termina el programa
        }

        // Creamos la matriz que contendrá los caracteres
        char[][] matriz = new char[n][n];

        // Llenamos la matriz con los caracteres adecuados ('X' o '_')
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (j == n - i - 1)) {
                    matriz[i][j] = 'X';  // Si estamos en la diagonal, colocamos 'X'
                } else {
                    matriz[i][j] = '_';  // Si no, colocamos '_'
                }
            }
        }

        // Imprimimos la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);  // Imprime cada elemento de la matriz
            }
            System.out.println();  // Salto de línea después de imprimir cada fila
        }
    }
}
