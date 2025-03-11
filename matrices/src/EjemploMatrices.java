public class EjemploMatrices {
    public static void main(String[] args) {

        // Creación de una matriz bidimensional (array 2x4) de tipo int
        int[][] numeros = new int[2][4];  // 2 filas y 4 columnas

// Asignando valores a la primera fila (índice 0)
        numeros[0][0] = 1;  // Primer elemento de la primera fila
        numeros[0][1] = 2;  // Segundo elemento de la primera fila
        numeros[0][2] = 3;  // Tercer elemento de la primera fila
        numeros[0][3] = 4;  // Cuarto elemento de la primera fila

// Asignando valores a la segunda fila (índice 1)
        numeros[1][0] = 11; // Primer elemento de la segunda fila
        numeros[1][1] = 12; // Segundo elemento de la segunda fila
        numeros[1][2] = 13; // Tercer elemento de la segunda fila
        numeros[1][3] = 14; // Cuarto elemento de la segunda fila

// Imprimir el número de filas en la matriz (longitud del array principal)
        System.out.println("Numero de fila: " + numeros.length);  // Esto imprime 2, ya que hay 2 filas en la matriz

// Imprimir el número de columnas de la primera fila
        System.out.println("Numero de columnas: " + numeros[0].length);  // Esto imprime 4, ya que la primera fila tiene 4 columnas

// Imprimir el primer elemento de la matriz (primer valor de la primera fila)
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);  // Esto imprime 1

// Imprimir el último elemento de la matriz (última fila y última columna)
        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1][numeros[1].length - 1]);  // Esto imprime 14

// Declaración de variables individuales para almacenar los valores de la matriz
        int num1 = numeros[0][0];  // Primer valor de la primera fila
        int num2 = numeros[0][1];  // Segundo valor de la primera fila
        int num3 = numeros[0][2];  // Tercer valor de la primera fila
        int num4 = numeros[0][3];  // Cuarto valor de la primera fila
        int num5 = numeros[1][0];  // Primer valor de la segunda fila
        int num6 = numeros[1][1];  // Segundo valor de la segunda fila
        int num7 = numeros[1][2];  // Tercer valor de la segunda fila
        int num8 = numeros[1][3];  // Cuarto valor de la segunda fila

        System.out.println();
// Imprimir los valores almacenados en las variables
        System.out.println("num1 = " + num1);  // Imprime 1
        System.out.println("num2 = " + num2);  // Imprime 2
        System.out.println("num3 = " + num3);  // Imprime 3
        System.out.println("num4 = " + num4);  // Imprime 4
        System.out.println("num5 = " + num5);  // Imprime 11
        System.out.println("num6 = " + num6);  // Imprime 12
        System.out.println("num7 = " + num7);  // Imprime 13
        System.out.println("num8 = " + num8);  // Imprime 14

    }
}
