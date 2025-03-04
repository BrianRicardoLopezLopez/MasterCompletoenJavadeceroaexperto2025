package Arreglos;

public class EjemploArreglosCombinados2 {
    public static void main(String[] args) {

        // Declaración de tres arreglos: a, b, c
        int[] a, b, c;

        // Inicialización de los arreglos
        a = new int[12];  // 'a' tiene 12 elementos
        b = new int[12];  // 'b' también tiene 12 elementos
        c = new int[24];  // 'c' tiene 24 elementos, para almacenar los valores intercalados de 'a' y 'b'

        // Llenado del arreglo 'a' con los valores del 1 al 12
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;  // Asigna a[i] el valor de i + 1, es decir, a = [1, 2, 3, ..., 12]
        }

        // Llenado del arreglo 'b' con los valores multiplicados por 5
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;  // Asigna a[i] los valores multiplicados por 5, es decir, b = [5, 10, 15, ..., 60]
        }

        int aux = 0;  // Variable auxiliar para llevar el control del índice en el arreglo 'c'

        // Intercalado de los valores de 'a' y 'b' en el arreglo 'c' en bloques de 3 elementos
        for (int i = 0; i < b.length; i += 3) {
            // Primer ciclo interno: agregar 3 elementos de 'a' a 'c'
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j];  // Asigna los 3 primeros elementos consecutivos de 'a' a 'c'
            }

            // Segundo ciclo interno: agregar 3 elementos de 'b' a 'c'
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];  // Asigna los 3 primeros elementos consecutivos de 'b' a 'c'
            }
        }

        // Imprime el contenido del arreglo 'c' con su índice correspondiente
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);  // Imprime el índice y el valor correspondiente de 'c'
        }
    }
}
