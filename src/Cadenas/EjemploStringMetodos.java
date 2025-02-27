package Cadenas;

public class EjemploStringMetodos {

    public static void main(String[] args) {

        // Métodos importantes del objeto String parte 1
        // Declaramos una variable String llamada 'nombre' con el valor "Brian"
        String nombre = "Brian";

        // Metodo 'length()' que devuelve la longitud de la cadena.
        System.out.println("nombre.length() = " + nombre.length());  // Imprime la longitud de la cadena "Brian" -> 5

        // Metodo 'toUpperCase()' que convierte todos los caracteres a mayúsculas.
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());  // Imprime "BRIAN"

        // Metodo 'toLowerCase()' que convierte todos los caracteres a minúsculas.
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());  // Imprime "brian"

        // Metodo 'equals()' que compara el contenido de dos cadenas, es sensible a mayúsculas/minúsculas.
        System.out.println("nombre.equals(\"Brian\") = " + nombre.equals("Brian"));  // Compara "Brian" con "Brian" -> true
        System.out.println("nombre.equals(\"brian\") = " + nombre.equals("brian"));  // Compara "Brian" con "brian" -> false

        // Metodo 'equalsIgnoreCase()' que compara el contenido de dos cadenas sin importar mayúsculas/minúsculas.
        System.out.println("nombre.equalsIgnoreCase(\"brian\") = " + nombre.equalsIgnoreCase("brian"));  // Compara sin distinguir mayúsculas/minúsculas -> true

        // Metodo 'compareTo()' que compara dos cadenas lexicográficamente.
        // Si la primera es menor que la segunda, devuelve un valor negativo; si son iguales, devuelve 0; si la primera es mayor, devuelve un valor positivo.
        System.out.println("nombre.compareTo(\"Brian\") = " + nombre.compareTo("Brian"));  // Compara "Brian" con "Brian" -> 0
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));  // Compara "Brian" con "Aaron" -> valor positivo (porque "B" es mayor que "A")

        // Metodo 'charAt()' que devuelve el carácter en la posición especificada.
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));  // Devuelve 'B', el primer carácter
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));  // Devuelve 'r', el segundo carácter
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));  // Devuelve 'n', el último carácter

        // Aquí se demuestra cómo obtener el último carácter de una cadena sin que ocurra un error.
        // El índice para obtener el último carácter es 'nombre.length() - 1'.
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() - 1));  // Devuelve 'n', el último carácter

        // Metodo 'substring()' que devuelve una subcadena a partir de un índice dado.
        System.out.println("nombre.substring(1) = " + nombre.substring(1));  // Devuelve "rian" (subcadena a partir del índice 1)
        System.out.println("nombre.substring(3) = " + nombre.substring(3));  // Devuelve "n" (subcadena a partir del índice 3)
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));  // Devuelve "ria" (subcadena desde el índice 1 hasta el 3, el índice final es exclusivo)
        System.out.println("nombre.substring(3,5) = " + nombre.substring(3, 5));  // Devuelve "na" (subcadena entre los índices 3 y 4)

        // Aquí obtenemos el valor de la subcadena que empieza en el índice 4 hasta el final de la cadena.
        System.out.println("nombre.substring(4) = " + nombre.substring(4));  // Devuelve "n"

        // Subcadena desde el último carácter hasta el final. Devuelve el último carácter como subcadena.
        System.out.println("nombre.substring(nombre.length() -1) = " + nombre.substring(nombre.length() - 1));  // Devuelve "n"

        // Subcadena desde los dos últimos caracteres de la cadena.
        System.out.println("nombre.substring(nombre.length() -2) = " + nombre.substring(nombre.length() - 2));  // Devuelve "an"


        // Métodos importantes del objeto String parte 2
        // Declaramos otra variable String llamada 'trabalenguas'.
        String trabalenguas = "trabalenguas";

        // Imprimimos el valor de 'trabalenguas'.
        System.out.println("trabalenguas = " + trabalenguas);  // Imprime "trabalenguas"

        // Metodo 'replace()' que reemplaza todas las ocurrencias de un carácter o subcadena por otro valor.
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", "."));  // Reemplaza todas las 'a' por '.' -> "tr.b.lengu.s"

        // Metodo 'indexOf()' que devuelve la primera posición en la que se encuentra el carácter o subcadena especificada.
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));  // Encuentra la primera 'a' en el índice 1

        // Metodo 'lastIndexOf()' que devuelve la última posición en la que se encuentra el carácter o subcadena especificada.
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));  // Encuentra la última 'a' en el índice 9

        // Si buscamos un carácter que no existe en la cadena, devuelve -1.
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("z"));  // Imprime -1, ya que 'z' no está en la cadena.

        System.out.println("trabalenguas.indexOf(\"t\") = " + trabalenguas.indexOf("t"));  // Encuentra 't' en el índice 0

        // Metodo 'contains()' que verifica si una subcadena está presente en la cadena.
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));  // Devuelve true porque 't' está en la cadena
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));  // Devuelve false porque 'z' no está en la cadena

        // Metodo 'indexOf()' que devuelve la primera posición donde empieza la subcadena especificada.
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));  // Encuentra "lenguas" en el índice 4

        // Metodo 'contains()' que verifica si una subcadena existe en la cadena.
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));  // Devuelve true porque "lenguas" está en la cadena

        // Metodo 'startsWith()' que verifica si la cadena comienza con una subcadena especificada.
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));  // Devuelve false porque la cadena no comienza con "lenguas"

        // Metodo 'startsWith()' que verifica si la cadena comienza con una subcadena especificada.
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));  // Devuelve true porque la cadena comienza con "tr"

        // Metodo 'endsWith()' que verifica si la cadena termina con una subcadena especificada.
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr"));  // Devuelve false porque la cadena no termina con "tr"

        // Metodo 'endsWith()' que verifica si la cadena termina con una subcadena especificada.
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));  // Devuelve true porque la cadena termina con "lenguas"

        // Metodo 'endsWith()' que verifica si la cadena termina con una subcadena especificada.
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));  // Devuelve true porque la cadena termina con "s"

        // Imprime un espacio antes de la palabra 'trabalenguas'.
        System.out.println(" trabalenguas ");

        // Metodo 'trim()' que elimina los espacios en blanco al principio y al final de la cadena.
        System.out.println(" trabalenguas .trim()".trim());  // Elimina los espacios al principio y al final de la cadena -> "trabalenguas"
    }
}
