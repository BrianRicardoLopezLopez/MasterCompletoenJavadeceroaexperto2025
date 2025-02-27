package LaClaseMath;

public class EjemploClaseMath2 {
    public static void main(String[] args) {
        // Se calcula el valor de e (base de los logaritmos naturales) elevado a la potencia de 2.
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);  // Imprime: exp = 7.3890560989306495

// Se calcula el logaritmo natural (base e) de 10.
        double log = Math.log(10);
        System.out.println("log = " + log);  // Imprime: log = 2.302585092994046

// Se calcula 10 elevado a la potencia de 3.
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);  // Imprime: potencia = 1000.0

// Se calcula la raíz cuadrada de 5.
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);  // Imprime: raiz = 2.23606797749979

// Se convierte de radianes a grados. 1.57 radianes ≈ 90 grados.
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);  // Se redondea el valor de grados.
        System.out.println("Convertir de radianes a grados = " + grados);  // Imprime: Convertir de radianes a grados = 90

// Se convierte de grados a radianes. 90 grados ≈ 1.5708 radianes.
        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);  // Imprime: Convertir de grados a radianes = 1.5707963267948966

// Se calcula el seno de 90 grados (convertido a radianes).
        System.out.println("sin(90) = " + Math.sin(radianes));  // Imprime: sin(90) = 1.0

// Se calcula el coseno de 90 grados (convertido a radianes).
        System.out.println("cos(90) = " + Math.cos(radianes));  // Imprime: cos(90) = 6.123233995736766E-17 (casi 0)

// Se calcula el coseno de 180 grados (convertido a radianes).
        radianes = Math.toRadians(180.00);
        System.out.println("cos(180) = " + Math.cos(radianes));  // Imprime: cos(180) = -1.0

// Se calcula el coseno de 0 grados (convertido a radianes).
        radianes = Math.toRadians(0.00);
        System.out.println("cos(0) = " + Math.cos(radianes));  // Imprime: cos(0) = 1.0

    }
}
