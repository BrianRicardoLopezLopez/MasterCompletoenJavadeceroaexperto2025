import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double l;
        double w;

        System.out.println("Ingresa la longitud de el triangulo");
        l = sc.nextDouble();

        System.out.println("Ingresa el ancho de el triangulo");
        w = sc.nextDouble();
        a = l * w;

        System.out.println("El resultado del area de un triangulo es de = " + a);
    }
}