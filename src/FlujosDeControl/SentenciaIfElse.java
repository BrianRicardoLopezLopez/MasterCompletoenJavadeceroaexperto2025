package FlujosDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.5f;  // Se define el promedio como un valor de tipo float

        // Comprobamos en qué rango se encuentra el promedio para proporcionar una respuesta adecuada
        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");  // Si el promedio es mayor o igual a 6.5
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");  // Si el promedio es mayor o igual a 6.0 pero menor que 6.5
        } else if (promedio >= 5.0) {
            System.out.println("Buen promedio!");  // Si el promedio es mayor o igual a 5.0 pero menor que 6.0
        } else if (promedio >= 4.0) {
            System.out.println("Regular, necesitas esforzarte un poco más!");  // Si el promedio es mayor o igual a 4.0 pero menor que 5.0
        } else {
            System.out.println("Reprobado!");  // Si el promedio es menor que 4.0
        }

        // Imprimimos el promedio para mostrar el valor
        System.out.println("Tu promedio es = " + promedio);

    }
}
