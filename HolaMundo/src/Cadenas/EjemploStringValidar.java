package Cadenas;

import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {

        // Inicializamos la variable 'curso' como null, lo que significa que no apunta a ninguna cadena.
        String curso = null;

// Verificamos si 'curso' es null. En este caso, como 'curso' es null, la variable 'esNulo' se establecerá en true.
        boolean esNulo = curso == null;

// Imprimimos el valor de 'esNulo', que será true en este caso.
        System.out.println("esNulo = " + esNulo);

// Este bloque está comentado, pero la idea es que si 'curso' no es null, intentaría convertirlo a mayúsculas.
// Sin embargo, como 'curso' es null, este código produciría una excepción si se descomentara.
//        if (esNulo == false){
//            System.out.println(curso.toUpperCase());
//        }

// Verificamos si 'esNulo' es verdadero. Si es verdadero (lo cual es cierto en este caso porque 'curso' es null),
// entonces asignamos un valor a 'curso', que en este caso es "Programación Java".
        if (esNulo) {
            // 'curso' se asigna a "Programación Java" porque antes era null.
            curso = "Programación Java";
        }

// Ahora verificamos si la longitud de 'curso' es 0. Como 'curso' ahora es "Programación Java",
// su longitud no es 0, por lo tanto 'esVacio' será false.
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);  // Imprimirá "false" porque 'curso' tiene contenido.

// Usamos el metodo 'isEmpty()', que también devuelve true si la cadena está vacía (longitud 0). En este caso, 'curso'
// no está vacío, por lo que 'esVacio2' será false.
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);  // También imprimirá "false" porque 'curso' no está vacío.

// El metodo 'isBlank()' se utiliza para verificar si una cadena está vacía o contiene solo espacios en blanco.
// Si 'curso' es "Programación Java", que contiene texto, 'esBlanco' será false.
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);  // Imprimirá "false" porque 'curso' no está vacío ni contiene solo espacios.

// Finalmente, verificamos si 'esBlanco' es falso. Si lo es, imprimimos 'curso' en mayúsculas. Como 'curso' no es
// blanco (tampoco está vacío), el bloque de código dentro de esta condición se ejecutará.
        if (esBlanco == false) {
            // Convertimos 'curso' a mayúsculas y lo imprimimos. El resultado será "PROGRAMACIÓN JAVA".
            System.out.println(curso.toUpperCase());
            // En la siguiente línea también concatenamos la cadena "Bienvenido al curso " con 'curso',
            // pero en este caso usamos 'concat()' en lugar de usar el operador '+'.
            System.out.println("Bienvenido al curos  = ".concat(curso));
        }

    }
}

