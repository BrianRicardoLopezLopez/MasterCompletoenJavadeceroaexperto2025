package LaClaseMath;

import java.util.Scanner;

public class CircunferenciaDeCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double c;
        double r;

        System.out.println("Ingresa el radio de un circulo");
        r = sc.nextDouble();

        c = 2 * Math.PI * r;

        System.out.println("El resultado del Circunferencia (perímetro) de un círculo es : " + c);
    }
}
