package Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];  // Crea un arreglo 'numeros' de 10 elementos.
        int[] a = new int[10];  // Crea otro arreglo 'a' de 10 elementos.

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;  // Llena el arreglo 'numeros' con los valores del 1 al 10.
        }

        int aux = 0;  // Se inicializa un índice auxiliar para recorrer el arreglo 'a'.

// Aquí comienza el bucle que intenta intercalar los elementos de 'numeros' en 'a'.
        for (int i = 0; i < numeros.length - i; i++) {  // La condición tiene un error.
            // Intercala los elementos de 'numeros' en 'a' (toma el primero y el último).
            a[aux++] = numeros[i];  // Asigna el valor de 'numeros[i]' al arreglo 'a'.
            a[aux++] = numeros[numeros.length - 1 - i];  // Asigna el valor de 'numeros[numeros.length - 1 - i]' al arreglo 'a'.
            // System.out.print("numeros = " + numeros[i] + " ");
            // System.out.println("numeros = " + numeros[numeros.length -1 - i]);
        }

// Finalmente, imprime los valores del arreglo 'a'.
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " valor: " + a[i]);  // Imprime el índice y el valor de cada elemento de 'a'.
        }

    }
}
