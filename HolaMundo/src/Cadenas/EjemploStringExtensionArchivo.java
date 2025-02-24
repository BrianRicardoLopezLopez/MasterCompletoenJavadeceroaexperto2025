package Cadenas;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        // Declaramos tres variables de tipo String que representan diferentes archivos.
        String archivo = "alguna_imagen.jpeg";
        String archivo2 = "alguna_imagen.js";
        String archivo3 = "alguna.imagen.pdf";

        // Buscamos el índice del primer punto en el nombre de archivo 'archivo2'
        int i = archivo2.indexOf(".");

        // Buscamos el índice del último punto en el nombre de archivo 'archivo3'
        int i2 = archivo3.lastIndexOf(".");

        // Mostramos la longitud de la cadena 'archivo' con el método 'length()'.
        System.out.println("archivo.length() = " + archivo.length());  // Devuelve la longitud de "alguna_imagen.jpeg" -> 19

        // Usamos el metodo 'substring()' para obtener una subcadena de 'archivo', comenzando desde el índice 14 hasta el final.
        System.out.println("archivo.substring(14) = " + archivo.substring(14));  // Devuelve "jpeg", empieza desde el índice 14 hasta el final de la cadena.


        // Usamos el metodo 'substring()' para obtener los últimos 4 caracteres de 'archivo'.
        // 'archivo.length() - 4' nos da la posición de inicio de los últimos 4 caracteres.
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));  // Devuelve "jpeg", que son los últimos 4 caracteres de la cadena.

        // Usamos 'substring()' para extraer la subcadena desde el índice donde se encuentra el primer punto ('.') en 'archivo2'.
        // Esto dará la parte que empieza desde el primer punto en "alguna_imagen.js", que sería ".js".
        System.out.println("archivo2.substring(i) = " + archivo2.substring(i));  // Devuelve ".js"

        // Usamos 'substring()' para extraer la subcadena desde el índice después del primer punto en 'archivo2'.
        // Esto devuelve la extensión del archivo "js".
        System.out.println("archivo2.substring(i+1) = " + archivo2.substring(i+1));  // Devuelve "js"

        // Usamos 'substring()' para obtener la subcadena desde el índice después del primer punto en 'archivo3'.
        // Similar al caso anterior, esto devuelve la extensión del archivo "pdf" de "alguna.imagen.pdf".
        System.out.println("archivo3.substring(i+1) = " + archivo3.substring(i+1));  // Devuelve "pdf"


    }
}
