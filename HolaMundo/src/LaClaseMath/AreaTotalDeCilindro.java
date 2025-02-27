package LaClaseMath;

import java.util.Scanner;

public class AreaTotalDeCilindro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double aTotal;
        double radio;
        double altura;

        System.out.println("Ingresa el radio de un cilindro");
        radio = sc.nextDouble();

        System.out.println("Ingresa la altura de un cilindro");
        altura = sc.nextDouble();

        aTotal = 2 * Math.PI * radio * (radio + altura);

        System.out.println("El resultado del area total de un cilindro es de = " + aTotal);
    }
}
