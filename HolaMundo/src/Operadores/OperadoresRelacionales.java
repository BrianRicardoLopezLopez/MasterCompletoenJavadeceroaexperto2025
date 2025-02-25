package Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;  // Inicializamos i con el valor 3
        byte j = 7;  // Inicializamos j con el valor 7
        float k = 127e-7f;  // Inicializamos k con una notación científica, 127e-7 es igual a 0.0000127
        double l = 2.1413e3;  // Inicializamos l con una notación científica, 2.1413e3 es igual a 2141.3
        boolean m = false;  // Inicializamos m con el valor false

        // Comparación de i y j con '==' (igual a)
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);  // b1 será true si i es igual a j, en este caso 3 == 7 es false, entonces b1 es false

        // Negación de b1 con '!' (no igual)
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);  // b2 será true si b1 es false, es decir, b2 es true

        // Operador != para comparar si i y j no son iguales
        // <>
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);  // b3 será true si i no es igual a j, es decir, 3 != 7 es true, entonces b3 es true

        // Comparación de m con true (m == true)
        boolean b4 = m == true;
        System.out.println("b4 = " + b4);  // b4 será true si m es igual a true, en este caso m es false, entonces b4 es false

        // Comparación de m con true usando !=
        boolean b5 = m != true;
        System.out.println("b5 = " + b5);  // b5 será true si m no es igual a true, es decir, m es false, entonces b5 es true

        // Comparación de i y j con '>' (mayor que)
        boolean b6 = i > j;
        System.out.println("b6 = " + b6);  // b6 será true si i es mayor que j, en este caso 3 > 7 es false, entonces b6 es false

        // Comparación de j y i con '<' (menor que)
        boolean b7 = j < i;
        System.out.println("b7 = " + b7);  // b7 será true si j es menor que i, en este caso 7 < 3 es false, entonces b7 es false

        // Comparación de l con k usando '>=' (mayor o igual que)
        boolean b8 = l >= k;
        System.out.println("b8 = " + b8);  // b8 será true si l es mayor o igual a k, 2141.3 >= 0.0000127 es true, entonces b8 es true

        // Comparación de l con k usando '<=' (menor o igual que)
        boolean b9 = l <= k;
        System.out.println("b9 = " + b9);  // b9 será true si l es menor o igual a k, 2141.3 <= 0.0000127 es false, entonces b9 es false


    }
}
