import java.util.Scanner;

public class PerimetroDeTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double p;

        System.out.println("Ingresa la longitud de uno de los lados del triángulo (a)");
        a = sc.nextDouble();
        System.out.println("Ingresa la longitud de otro lado del triángulo (b)");
        b = sc.nextDouble();
        System.out.println("Ingresa la longitud del tercer lado del triángulo. (c)");
        c = sc.nextDouble();

        p = a + b + c;

        System.out.println("El resultado del perímetro del triángulo es " + p);
    }
}

