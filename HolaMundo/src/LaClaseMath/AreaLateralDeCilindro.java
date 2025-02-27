package LaClaseMath;

import java.util.Scanner;

public class AreaLateralDeCilindro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double areaLateral;
        double radio;
        double altura;

        System.out.println("Ingresa el radio del cilindro");
        radio = sc.nextDouble();
        System.out.println("Ingresa la altura del cilindro");
        altura = sc.nextDouble();

        areaLateral = 2 * Math.PI * radio * altura;

        System.out.println("El resultado del area lateral de un cilindro es de = " + areaLateral);
    }
}
