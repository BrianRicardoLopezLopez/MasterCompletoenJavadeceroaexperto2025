import java.util.Scanner;

public class AreaDeTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double h;

        System.out.println("Ingresa la base de un triangulo");
        b = sc.nextDouble();

        System.out.println("Ingresa la altura de un triangulo");
        h = sc.nextDouble();

        a = b * h / 2;

        System.out.println("El resultado del area de un triangulo es de = " + a);
    }
}
