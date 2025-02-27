package Cadenas;

public class EjemploStringConcatenacion {

    public static void main(String[] args) {

        // Declaramos dos variables de tipo String: una para el curso y otra para el nombre del profesor
        String curso = "Programación Java";
        String profesor = "Brian López";

        // Creamos una nueva cadena de texto concatenando "curso" y "profesor" con " con el Profesor " entre ambos
        String detalle = curso + " con el Profesor " + profesor;
        // Imprimimos la variable detalle, que contiene la concatenación anterior
        System.out.println("Detalle = " + detalle);

        // Declaramos dos variables de tipo int para realizar una operación de suma
        int numeroA = 10;
        int numeroB = 5;

        // Aquí concatenamos el detalle con la suma de los dos números, pero los números se concatenan como texto.
        System.out.println(detalle + " " + numeroA + numeroB);
        // Resultado esperado: "Programación Java con el Profesor Brian López 105"

        // En este caso, se realiza la operación matemática primero, porque el paréntesis fuerza la prioridad de la suma.
        System.out.println(detalle + " " + (numeroA + numeroB));
        // Resultado esperado: "Programación Java con el Profesor Brian López 15" (ya que 10 + 5 = 15)

        // Esta línea realiza la suma de los números primero (sin paréntesis) y luego concatena la cadena de texto.
        // Debido a la forma en que Java evalúa las expresiones, el número 10 se suma al 5, pero después de eso
        // la operación continua con la concatenación, por lo que primero tendrás el resultado de la suma, y luego el texto.
        System.out.println(numeroA + numeroB + " " + detalle);
        // Resultado esperado: "15 Programación Java con el Profesor Brian López"

        // Aquí usamos el metodo concat() para concatenar las cadenas de texto.
        // concat() se usa para unir cadenas sin necesidad de usar el operador '+', pero sigue funcionando de forma similar.
        String detalle2 = curso.concat(" con ").concat(profesor);
        // Imprimimos la nueva variable detalle2, que es el resultado de la concatenación.
        System.out.println("detalle2 = " + detalle2 );
        // Resultado esperado: "detalle2 = Programación Java con Brian López"


    }
}
