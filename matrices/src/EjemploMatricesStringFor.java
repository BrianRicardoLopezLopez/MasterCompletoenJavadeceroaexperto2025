public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        // Creación de una matriz bidimensional de tipo String con 3 filas y 2 columnas
        String[][] nombres = new String[3][2];

// Asignando valores a la matriz 'nombres'
        nombres[0][0] = "Pepe";  // Primer elemento de la primera fila
        nombres[0][1] = "Pepa";  // Segundo elemento de la primera fila
        nombres[1][0] = "Josefa";  // Primer elemento de la segunda fila
        nombres[1][1] = "Paco";  // Segundo elemento de la segunda fila
        nombres[2][0] = "Lucas";  // Primer elemento de la tercera fila
        nombres[2][1] = "Pancha";  // Segundo elemento de la tercera fila

// Imprimiendo "Iterando con for:"
        System.out.println("Iterando con for: ");

// Usando un ciclo 'for' clásico para iterar sobre la matriz
        for (int i = 0; i < nombres.length; i++) {  // Itera sobre las filas
            for (int j = 0; j < nombres[i].length; j++) {  // Itera sobre las columnas de cada fila
                System.out.print(nombres[i][j] + "\t");  // Imprime el valor actual, separado por un tabulador
            }
            System.out.println();  // Salto de línea al final de cada fila
        }

        System.out.println();  // Salto de línea para separar las dos secciones de iteración

// Imprimiendo "Iterando con forEach:"
        System.out.println("Iterando con forEach: ");

// Usando el ciclo 'forEach' para iterar sobre la matriz
        for (String[] fila : nombres) {  // Itera sobre cada fila de la matriz
            for (String nombre : fila) {  // Itera sobre cada elemento de la fila (es decir, los nombres)
                System.out.print(nombre + "\t");  // Imprime el nombre actual, separado por un tabulador
            }
            System.out.println();  // Salto de línea al final de cada fila
        }
    }
}
