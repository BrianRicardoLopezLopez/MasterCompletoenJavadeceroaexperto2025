package Cadenas;

public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {

// Declaramos tres cadenas de texto: a, b, y c.
        String a = "a";
        String b = "b";
        String c = "a";  // Inicializamos 'c' con el valor "a"

// Creamos un objeto StringBuilder a partir de la cadena 'a'.
// StringBuilder es una clase eficiente para concatenar cadenas, ya que puede modificar la cadena interna sin crear nuevos objetos en cada operación.
        StringBuilder sb = new StringBuilder(a);

// Guardamos el tiempo actual en la variable 'inicio' para medir el tiempo que tarda el proceso.
        long inicio = System.currentTimeMillis();

// Realizamos un bucle que se repite 10,000 veces.
        for (int i = 0; i < 10000; i++) {
            // Esta línea concatena 'a', 'b', y una nueva línea usando el método concat().
            // Aunque esta opción también funciona, cada vez que se llama a concat() se crea una nueva cadena,
            // lo cual no es tan eficiente cuando se repite muchas veces.
            //c = c.concat(a).concat(b).concat("\n"); //500 => 1ms

            // Esta opción usa el operador '+=' para concatenar cadenas.
            // Aunque el operador '+' parece conveniente, crea un nuevo objeto String cada vez que se usa,
            // lo cual es ineficiente cuando hay muchas concatenaciones.
            //c += a + b + "\n"; //500 => 11ms

            // Usamos el método append() de StringBuilder para añadir 'a', 'b' y un salto de línea.
            // StringBuilder es más eficiente porque modifica la cadena interna directamente sin crear nuevos objetos.
            sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 => 1ms, 10000 => 1ms
        }
        System.gc();

// Calculamos el tiempo final después de realizar las 10,000 concatenaciones.
        long fin = System.currentTimeMillis();

// Imprimimos el tiempo total que ha tardado la operación de concatenación.
        System.out.println(fin - inicio); // Este valor muestra el tiempo que ha tardado en milisegundos.

// Imprimimos el valor final de la cadena 'c', aunque en este caso no se ha modificado porque las concatenaciones
// comentadas no afectan a 'c' debido a que estaban comentadas.
        System.out.println("c = " + c);  // Esta cadena no se ha modificado porque las líneas relevantes están comentadas.

// Imprimimos el valor final de 'sb', que contiene todas las concatenaciones realizadas dentro del bucle.
        System.out.println("sb = " + sb);  // Aquí se verán todas las concatenaciones de 'a' y 'b' repetidas 10,000 veces.


    }
}
