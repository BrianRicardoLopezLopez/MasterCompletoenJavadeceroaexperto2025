package Cadenas;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        // Declaramos una variable de tipo String llamada 'trabalenguas'.
        String trabalenguas = "trabalenguas";

        // Mostramos la longitud de la cadena 'trabalenguas' usando el método 'length()'.
        System.out.println("trabalenguas.length() = " + trabalenguas.length());  // Devuelve 12, que es la cantidad de caracteres en la palabra "trabalenguas".

        // Mostramos el arreglo de caracteres generado por el método 'toCharArray()'.
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());  // Devuelve el arreglo de caracteres: [t, r, a, b, a, l, e, n, g, u, a, s]

        // Convertimos la cadena 'trabalenguas' en un arreglo de caracteres.
        char[] arreglo = trabalenguas.toCharArray();

        // Obtenemos la longitud del arreglo de caracteres.
        int largo = arreglo.length;
        System.out.println("largo = " + largo);  // Devuelve 12, ya que "trabalenguas" tiene 12 caracteres.

        for (int i = 0; i < largo; i++) {
            // Imprimimos cada carácter del arreglo en la misma línea.
            System.out.print(arreglo[i]);  // Imprime la palabra "trabalenguas" caracter por caracter sin saltos de línea.
        }

        // Salto de línea después del bucle para que la siguiente salida esté separada.
        System.out.println();

        // Usamos el metodo 'split()' para dividir la cadena en partes donde se encuentra la letra 'a'.
        System.out.println("\ntrabalenguas.split(\"a\") = " + trabalenguas.split("a"));  // Divide la cadena donde encuentra la letra 'a'. La salida será: [tr, b, lengu, s]

        // Creamos un arreglo con las partes obtenidas al dividir la palabra por 'a'.
        String[] arreglo2 = trabalenguas.split("a");

        // Obtenemos la longitud del nuevo arreglo.
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            // Mostramos cada subcadena dividida por 'a'.
            System.out.println(arreglo2[j]);  // Imprime las partes de la palabra "trabalenguas" divididas por 'a'.
        }

        // Ahora trabajamos con otro ejemplo: el nombre de un archivo.
        String archivo = "alguna.imagen.pdf";
        System.out.println("archivo = " + archivo);  // Imprime "alguna.imagen.pdf".

        // Usamos 'split()' para dividir la cadena 'archivo' por el punto ('.').
        String[] archivoArr = archivo.split("\\.");  // Usamos '\\.' para escapar el punto, ya que '.' tiene un significado especial en expresiones regulares.

        // Obtenemos la longitud del arreglo resultante.
        l = archivoArr.length;
        System.out.println("l = " + l);  // Devuelve 3, ya que se divide en tres partes: "alguna", "imagen", "pdf".

        for (int j = 0; j < l; j++) {
            // Mostramos cada parte del archivo dividida por '.'.
            System.out.println(archivoArr[j]);  // Imprime "alguna", "imagen", "pdf".
        }

        // Finalmente, mostramos la extensión del archivo (el último elemento del arreglo).
        System.out.println(" archivoArr[l-1], extension = " + archivoArr[l-1]);  // Imprime "pdf", que es la extensión del archivo.

    }
}
