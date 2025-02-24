package Cadenas;

public class EjemploString {

    public static void main(String[] args) {
        // Se crea un objeto de tipo String con valor "Programación Java"
        // Este objeto se almacena en el String Pool, optimizando el uso de memoria
        String curso = "Programación Java";

        // Se crea un objeto de tipo String utilizando el operador new
        // Este objeto se almacena en una ubicación diferente de la memoria, no en el String Pool
        String curso2 = new String("Programación Java");

        // Comparación utilizando '==' para verificar si 'curso' y 'curso2' son el mismo objeto en memoria
        // Aunque ambos tienen el mismo valor, son objetos diferentes en memoria, por lo que el resultado es false
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);  // Resultado: false

        // Comparación utilizando 'equals()' para verificar si los contenidos de 'curso' y 'curso2' son iguales
        // 'equals()' compara el contenido, no las referencias en memoria, así que el resultado es true
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);  // Resultado: true

        // Comparación utilizando 'equalsIgnoreCase()' para verificar si los contenidos son iguales, ignorando mayúsculas/minúsculas
        // Como ambos objetos tienen exactamente el mismo valor, el resultado también es true
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);  // Resultado: true

        // Se crea otro objeto de tipo String con valor "Programación Java"
        // Este objeto se almacena en el String Pool, como 'curso', por lo que ambos apuntan al mismo objeto en memoria
        String curso3 = "Programación Java";

        // Comparación utilizando '==' para verificar si 'curso' y 'curso3' son el mismo objeto en memoria
        // Como ambos apuntan al mismo objeto del String Pool, la comparación devuelve true
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);  // Resultado: true


    }
}
