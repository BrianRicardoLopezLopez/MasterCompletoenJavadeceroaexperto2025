public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        // Inicialización de la matriz 'nombres' con los valores proporcionados
        String[][] nombres = {{"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};

        // Imprimiendo "Iterando con forEach:"
        System.out.println("Iterando con forEach: ");

        // Usando el ciclo 'forEach' para recorrer cada fila de la matriz
        for (String[] fila : nombres) {  // Cada 'fila' es un array de Strings (una fila de la matriz)
            // Usando otro ciclo 'forEach' para recorrer cada nombre en la fila
            for (String nombre : fila) {  // Cada 'nombre' es un elemento (String) de la fila
                System.out.print(nombre + "\t");  // Imprime el nombre seguido de un tabulador
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
