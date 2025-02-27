package Operadores;

public class OperadoresLogico {
    public static void main(String[] args) {

        int i = 3;  // Inicializamos i con el valor 3
        byte j = 3;  // Inicializamos j con el valor 3
        float k = 127e-7f;  // Inicializamos k con una notación científica, 127e-7 es igual a 0.0000127
        double l = 2.1413e3;  // Inicializamos l con una notación científica, 2.1413e3 es igual a 2141.3
        boolean m = false;  // Inicializamos m con el valor false

        // Operador AND (&&): todas las condiciones deben ser verdaderas para que el resultado sea true
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);  // b1 será true si i == j, k < l y m es false. En este caso, todas son verdaderas, entonces b1 es true

        // Operador OR (||): basta con que una condición sea verdadera para que el resultado sea true
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);  // b2 será true si i == j o k < l. En este caso, 3 == 3 es true, entonces b2 es true

        // Combinación de AND (&&) y OR (||)
        boolean b3 = i == j && (k < l || m == true);
        System.out.println("b3 = " + b3);  // b3 será true si i == j y (k < l o m == true). En este caso, i == j es true, pero (k < l || m == true) es true porque k < l es verdadero, entonces b3 es true

        // Precedencia de operadores: la operación dentro del paréntesis se evalúa primero
        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4);  // b4 será true si (i == j || k < l) es verdadero y m == true. En este caso, (i == j || k < l) es true, pero m es false, entonces b4 es false

        // Evaluación simple con operadores OR (||) y AND (&&)
        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);  // b5 será true si (true || true) es verdadero y el resultado se evalúa con && false. Al ser false, b5 es false

        // Evaluación con una mezcla de OR (||) y AND (&) - NOTAR que '&' tiene menor precedencia que '||'
        boolean b6 = true || false & false || false;  // Nota: '&' es un operador binario de AND a nivel de bit, que se evalúa antes que '||'
        System.out.println("b6 = " + b6);  // b6 será true. La evaluación de 'false & false' da false, pero después el OR de 'true' y 'false' da true, entonces b6 es true

        // Evaluación de expresiones anidadas con OR (||) y AND (&&)
        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);  // b7 será false. Primero se evalúa el paréntesis: (true || false) es true, pero (true && false) es false. Al final 'false || false' da false, entonces b7 es false

    }
}
