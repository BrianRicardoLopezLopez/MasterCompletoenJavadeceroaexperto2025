public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {

        // Creación de una matriz bidimensional con número de columnas variable en cada fila
        int[][] matriz = new int[3][];  // La matriz tiene 3 filas, pero el número de columnas se define más tarde.

        matriz[0] = new int[2];  // La primera fila tendrá 2 columnas
        matriz[1] = new int[3];  // La segunda fila tendrá 3 columnas
        matriz[2] = new int[4];  // La tercera fila tendrá 4 columnas

        System.out.println();

        // Imprimiendo las longitudes de la matriz y de cada fila
        System.out.println("Matriz length: " + matriz.length);  // Esto imprime 3, ya que hay 3 filas.
        System.out.println("Fila 0 length: " + matriz[0].length);  // Esto imprime 2, ya que la primera fila tiene 2 columnas.
        System.out.println("Fila 1 length: " + matriz[1].length);  // Esto imprime 3, ya que la segunda fila tiene 3 columnas.
        System.out.println("Fila 2 length: " + matriz[2].length);  // Esto imprime 4, ya que la tercera fila tiene 4 columnas.

        System.out.println();  // Salto de línea entre la primera y la segunda parte del código

        // Llenando la matriz con valores: matriz[i][j] = i * j
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorre las columnas de cada fila
                matriz[i][j] = i * j;  // Asigna el producto de los índices i y j a la posición matriz[i][j]
            }
        }
        // Imprimiendo los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorre las columnas de cada fila
                System.out.print(matriz[i][j] + "\t");  // Imprime el valor de la posición matriz[i][j] y un tabulador para formato
            }
            System.out.println();  // Salto de línea después de imprimir cada fila
        }
    }
}
