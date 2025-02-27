package LaClaseMath;

import java.util.Scanner;

public class VolumenDeCilindro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double volumen;
        double radio;
        double altura;

        System.out.println("Ingresa el radio de un cilindro");
        radio = sc.nextDouble();

        System.out.println("Ingresa la altura del cilindro");
        altura = sc.nextDouble();

        volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El resultado de volumen de un cilindro es = " + volumen);


    }
}
