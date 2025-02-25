package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {

        int i = -5;  // Inicializamos i con el valor -5

        int j = +i; // j = (1)*i => -5 // El operador + no cambia el valor de i, j será igual a -5
        System.out.println("j = " + j); // Imprime j = -5

        int k = -i; // k = (-1)* => 5 // El operador - invierte el valor de i, por lo que k será igual a 5
        System.out.println("k = " + k); // Imprime k = 5

        i = 6;  // Asignamos el valor 6 a i
        j = +i; // El operador + sigue sin cambiar el valor de i, j será igual a 6
        System.out.println("j = " + j); // Imprime j = 6

        k = -i; // El operador - cambia el signo de i, por lo que k será igual a -6
        System.out.println("k = " + k); // Imprime k = -6


    }
}
