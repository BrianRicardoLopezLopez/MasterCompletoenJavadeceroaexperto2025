package LaClaseMath;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double area;
        double radio;

        System.out.println("Introduce el radio de un circulo:");
        radio = sc.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de una circunferencia de radio " + radio + " es: " + area);
    }
}
