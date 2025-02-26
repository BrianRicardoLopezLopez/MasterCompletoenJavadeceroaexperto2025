package Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;  // Se inicializa i con el valor 14
        int j = 8;   // Se inicializa j con el valor 8
        int k = 20;  // Se inicializa k con el valor 20

        // Suma de los valores de i, j y k, y luego se divide entre 3
        double promedio = (i + j + k) / 3d;  // El valor de promedio será (14 + 8 + 20) / 3 = 42 / 3 = 14.0
        System.out.println("promedio = " + promedio);  // Imprime el promedio: 14.0

        // En este caso, el promedio se multiplica por 10
        promedio = (i + j + k) / 3d * 10;  // El valor de promedio será (14 + 8 + 20) / 3 * 10 = 42 / 3 * 10 = 14.0 * 10 = 140.0
        System.out.println("promedio = " + promedio);  // Imprime el promedio después de la multiplicación: 140.0

        // Se usan el preincremento y postdecremento para i y j, respectivamente
        promedio = ++i + j-- + k / 3d * 10;  // Se realiza lo siguiente:
        // ++i: Primero incrementa i a 15, y luego lo usa en la suma (15)
        // j--: Usa el valor actual de j (que es 8) y luego decrementa j a 7 (después de la operación)
        // k / 3d * 10: Divide k entre 3d (20 / 3d = 6.6667) y luego lo multiplica por 10 (6.6667 * 10 = 66.6667)
        promedio = 15 + 8 + 66.6667;  // El cálculo final será 15 + 8 + 66.6667 = 89.6667
        System.out.println("promedio = " + promedio);  // Imprime el nuevo promedio: 89.6667

        // El valor de i y j después de las operaciones
        System.out.println("i = " + i);  // Imprime el valor de i después del preincremento (i = 15)
        System.out.println("j = " + j);  // Imprime el valor de j después del postdecremento (j = 7)


    }
}
