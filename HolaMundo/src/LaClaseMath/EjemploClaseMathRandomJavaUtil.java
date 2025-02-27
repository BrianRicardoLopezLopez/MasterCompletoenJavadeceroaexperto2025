package LaClaseMath;

import java.util.Random;

public class EjemploClaseMathRandomJavaUtil {
    public static void main(String[] args) {

        Random randomObj = new Random();  // Se crea un objeto de la clase Random para generar números aleatorios.

        // Genera un número aleatorio entero (positivo o negativo) de tipo int.
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);  // Imprime el valor aleatorio entero generado.

        // Genera un número aleatorio entre 15 y 39 (el valor máximo es 39, ya que el límite superior es exclusivo).
        int randomInt2 = 15 + randomObj.nextInt(25 - 15);
        System.out.println("randomInt2 = " + randomInt2);  // Imprime el número aleatorio generado en el rango de 15 a 39.

        // Genera un número aleatorio de tipo double entre 0.0 (inclusive) y 1.0 (exclusive).
        double randomDouble = randomObj.nextDouble();
        System.out.println("randomDouble = " + randomDouble);  // Imprime el valor aleatorio de tipo double generado.

        // Genera un número aleatorio largo de tipo long.
        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);  // Imprime el valor aleatorio largo generado.

        // Se crea un arreglo con los nombres de los colores.
        String[] colors = {"Azul", "Amarillo", "Rojo", "Verde", "Blanco", "Negro"};

        // Genera un número aleatorio en el rango [0, colores.length), es decir, entre 0 y 5.
        int randomIntColors = randomObj.nextInt(colors.length);
        System.out.println("randomIntColors = " + randomIntColors);  // Imprime el índice aleatorio generado para los colores.

        // Imprime el color correspondiente al índice aleatorio generado en el arreglo 'colors'.
        System.out.println("colors = " + colors[randomIntColors]);

    }
}
