package Arreglos;

public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        // Declaración de tres arreglos: a, b, c
        int[] a, b, c;

// Inicialización de los arreglos
        a = new int[10];  // 'a' tiene 10 elementos
        b = new int[10];  // 'b' también tiene 10 elementos
        c = new int[20];  // 'c' tiene 20 elementos, para almacenar ambos arreglos intercalados

// Llenado del arreglo 'a' con los valores del 1 al 10
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;  // Asigna a[i] el valor de i + 1, es decir, a = [1, 2, 3, ..., 10]
        }

// Llenado del arreglo 'b' con los valores multiplicados por 5
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;  // Asigna a[i] los valores multiplicados por 5, es decir, b = [5, 10, 15, ..., 50]
        }

        int aux = 0;  // Variable auxiliar para llevar el control del índice en el arreglo 'c'

// Intercalado de los valores de 'a' y 'b' en el arreglo 'c'
        for (int i = 0; i < b.length; i++) {
            c[aux++] = a[i];  // Asigna el valor de a[i] al arreglo c en la posición aux, luego incrementa aux
            c[aux++] = b[i];  // Asigna el valor de b[i] al arreglo c en la posición aux, luego incrementa aux
        }

// Imprime el contenido del arreglo 'c' con su índice correspondiente
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);  // Imprime el índice y el valor correspondiente del arreglo 'c'
        }

    }
}
