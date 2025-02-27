package Cadenas;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        // Declaramos dos variables de tipo String: una para el curso y otra para el nombre del profesor
        String curso = "Programación Java";
        String profesor = "Brian López";

        // Usamos el metodo concat() para concatenar las cadenas, pero recordemos que concat() devuelve una nueva cadena
        String resultado = curso.concat(profesor);

        // Imprimimos el valor original de "curso" y el valor de "resultado"
        System.out.println("curso = " + curso);  // El valor de curso no cambia, sigue siendo "Programación Java"
        System.out.println("resultado = " + resultado); // resultado será "Programación Javaprogramación JavaBrian López"

        // La comparación aquí utiliza "==" para verificar si las referencias de memoria de ambas cadenas son las mismas.
        // Como "curso" es una cadena literal y "resultado" es una nueva cadena, el resultado será falso.
        System.out.println(curso == resultado);  // Esto será "false" porque son diferentes objetos en memoria.


        // Usamos el metodo transform() para modificar la cadena "curso" de forma funcional.
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;  // Esta es una transformación que devuelve una nueva cadena.
        });

        // Imprimimos el valor de "curso" y "resultado2".
        System.out.println("curso = " + curso);  // El valor de "curso" sigue siendo inmutable, sigue siendo "Programación Java"
        System.out.println("resultado2 = " + resultado2);  // El valor de resultado2 será "Programación Java con Brian López"

        // Usamos el metodo replace() para reemplazar todas las ocurrencias de "a" por "A" en la cadena "resultado".
        String resultado3 = resultado.replace("a", "A");

        // Imprimimos el valor de "resultado" y "resultado3".
        System.out.println("resultado = " + resultado);  // "resultado" sigue siendo inmutable, y mantiene su valor original
        System.out.println("resultado3 = " + resultado3);  // "resultado3" será una nueva cadena con las "a" reemplazadas por "A"

        // El valor original de "resultado" no se ve afectado por la operación de replace().

    }
}
