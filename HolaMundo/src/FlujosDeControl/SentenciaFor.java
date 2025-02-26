package FlujosDeControl;

import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {


        for ( int i = 0; i<= 5; i++){
            System.out.println("i = " + i);
        }
        for (int i = 10; i >= 0 ; i--) {
            System.out.println("i = " + i);
        }
        int j;
        for (int i = 1; j = 10; i < j; i++, j-- ) {
            System.out.println();
        }

        //Tabla de multiplicar
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero de la tabla del 1 ....");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
