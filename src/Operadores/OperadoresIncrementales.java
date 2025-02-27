package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre Incremento
        int i = 1;
        // Primero incrementa i en 1, luego asigna el valor de i a j. Es equivalente a i = i + 1.
        int j = ++i;
        System.out.println("i = " + i);  // i se incrementa primero, ahora es 2
        System.out.println("j = " + j);  // j toma el valor de i, que es 2

        // Post Incremento
        i = 2;
        System.out.println("Inicial de i = " + i);  // i comienza siendo 2
        j = i++;  // Primero asigna el valor actual de i a j, luego incrementa i. j obtiene 2, i se incrementa a 3
        System.out.println("i = " + i);  // i se incrementó después de asignar, ahora es 3
        System.out.println("j = " + j);  // j toma el valor de i antes de la operación, que era 2

        // Pre Decremento
        i = 3;
        // Primero decrementa i en 1, luego asigna el valor de i a j. Es equivalente a i = i - 1.
        j = --i;
        System.out.println("i = " + i);  // i se decrementa primero, ahora es 2
        System.out.println("j = " + j);  // j toma el valor de i, que es 2

        // Post Decremento
        i = 4;
        j = i--;  // Primero asigna el valor actual de i a j, luego decrementa i. j obtiene 4, i se decrementa a 3
        System.out.println("i = " + i);  // i se decrementó después de asignar, ahora es 3
        System.out.println("j = " + j);  // j toma el valor de i antes de la operación, que era 4

        // Operaciones adicionales con pre y post incrementos
        System.out.println("(++j) = " + (++j));  // Pre-incremento: j se incrementa antes de ser usado. Si j era 4, ahora es 5
        System.out.println("(j++) = " + (j++));  // Post-incremento: j se usa primero, luego se incrementa. j sigue siendo 5 antes de la operación
        System.out.println("j = " + j);  // Finalmente, j se incrementa y ahora tiene el valor de 6


    }
}
