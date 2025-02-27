package FlujosDeControl;

import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {


        // Primer bucle: Imprime los valores de i desde 0 hasta 5
        for (int i = 0; i <= 5; i++) {  // El bucle comienza con i = 0 y se ejecuta hasta i = 5
            System.out.println("i = " + i);  // Imprime el valor de i en cada iteración
        }

        // Segundo bucle: Imprime los valores de i desde 10 hasta 0 (decreciendo)
        for (int i = 10; i >= 0; i--) {  // El bucle comienza con i = 10 y se ejecuta mientras i sea mayor o igual a 0
            System.out.println("i = " + i);  // Imprime el valor de i en cada iteración
        }

        // Tercer bucle: Dos variables, i y j, cambian simultáneamente en cada iteración
        for (int i = 1, j = 10; i < j; i++, j--) {  // El bucle comienza con i = 1 y j = 10, y se ejecuta mientras i < j
            System.out.println(i + " - " + j);  // Imprime el valor de i y j en cada iteración
            // En cada iteración, i se incrementa y j se decrementa
        }

        // Cuarto bucle: Imprime solo los números pares entre 0 y 10
        for (int i = 0; i <= 10; i++) {  // El bucle comienza con i = 0 y se ejecuta hasta i = 10
            if (!(i % 2 == 0)) {  // Si i no es par (el resultado de i % 2 no es 0), el bucle continúa con la siguiente iteración
                continue;  // Salta al siguiente ciclo del bucle sin ejecutar lo siguiente en esta iteración
            }
            System.out.println("i = " + i);  // Si i es par, se imprime su valor
        }

        // Quinto bloque: Tabla de multiplicar del número introducido por el usuario
        Scanner sc = new Scanner(System.in);  // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingresa un numero de la tabla del 1 ....");  // Mensaje solicitando un número
        int numero = sc.nextInt();  // Lee el número introducido por el usuario

        for (int i = 1; i <= 10; i++) {  // El bucle va desde 1 hasta 10
            System.out.println(numero + " x " + i + " = " + (numero * i));  // Imprime la multiplicación de 'numero' por i
        }
    }
}
