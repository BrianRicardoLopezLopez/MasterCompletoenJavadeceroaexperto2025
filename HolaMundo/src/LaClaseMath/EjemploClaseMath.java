package LaClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        // Se obtiene el valor absoluto de un número negativo.
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);  // Imprime: absoluto = 3

// Se obtiene el valor absoluto de un número positivo.
        int absoluto1 = Math.abs(3);
        System.out.println("absoluto1 = " + absoluto1);  // Imprime: absoluto = 3

// Se obtiene el valor máximo entre dos números.
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);  // Imprime: max = 3.5

// Se obtiene el valor mínimo entre dos números.
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);  // Imprime: min = 1.2

// Se obtiene el techo de un número, es decir, el número entero mayor o igual al valor dado.
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);  // Imprime: techo = 4.0

// Se obtiene el piso de un número, es decir, el número entero menor o igual al valor dado.
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);  // Imprime: piso = 3.0

// Se redondea un número al entero más cercano.
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);  // Imprime: entero = 4

// Se redondea el valor de PI al entero más cercano.
        long enteroPi = Math.round(Math.PI);
        System.out.println("enteroPi = " + enteroPi);  // Imprime: enteroPi = 3

// Se obtiene el valor de PI en formato double.
        double pi = Math.PI;
        System.out.println("pi = " + pi);  // Imprime: pi = 3.141592653589793
    }
}
