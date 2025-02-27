import java.util.Scanner;

public class VolumenDeEsfera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double v;
        double r;

        System.out.println("Ingresa el radio de un esfera");
        r = sc.nextDouble();

        v = Math.pow(r,3);
        v = (double) 4 /3 * Math.PI * v;

        System.out.println("El resultado del volumen de una esfera es = " + v );
    }
}
