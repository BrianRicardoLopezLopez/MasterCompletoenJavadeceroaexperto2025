package LaClaseMath;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        // Se crea un arreglo con los nombres de los colores.
        String[] colors = {"Azul", "Amarillo", "Rojo", "Verde", "Blanco", "Negro"};

        // Se genera un número aleatorio entre 0 y 1 (exclusivo 1) utilizando Math.random().
        double random = Math.random();
        System.out.println("random = " + random);  // Imprime el valor aleatorio generado.

        // Se multiplica el valor aleatorio por la longitud del arreglo de colores (6 en este caso)
        // para obtener un número aleatorio entre 0 y 6 (exclusivo 6).
        random *= colors.length;

        // Se aplica Math.floor() para redondear el número aleatorio hacia abajo,
        // así nos aseguramos de obtener un valor entero entre 0 y 5 (índices válidos del arreglo).
        random = Math.floor(random);
        System.out.println("random floor = " + random);  // Imprime el valor redondeado hacia abajo.

        // Se utiliza el valor de random (convertido a entero) como índice para acceder a un color aleatorio en el arreglo.
        System.out.println("random en colors aleatorio= " + colors[(int) random]);  // Imprime el color aleatorio basado en el índice.

        System.out.println("==================");

        // Se genera otro número aleatorio entre 0 y 1 (exclusivo 1).
        double random2 = Math.random();
        System.out.println("random = " + random2);  // Imprime el nuevo valor aleatorio generado.

        // Se multiplica el valor aleatorio por 7 para obtener un número aleatorio entre 0 y 7 (exclusivo 7).
        random2 *= 7;
        System.out.println("random multiplication por 7 = " + random2);  // Imprime el valor después de multiplicarlo por 7.

        // Se aplica Math.floor() para redondear el valor hacia abajo, obteniendo así un número entero
        // entre 0 y 6 (índices válidos si se estuviera usando un arreglo de 7 elementos).
        random2 = Math.floor(random2);
        System.out.println("random floor = " + random2);  // Imprime el valor redondeado hacia abajo.

    }
}
