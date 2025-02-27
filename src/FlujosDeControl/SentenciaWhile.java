package FlujosDeControl;

public class SentenciaWhile {
    public static void main(String[] args) {

        // Primer bucle 'while' - Imprime los valores de i de 0 a 5
        int i = 0;
        while (i <= 5) {  // Mientras i sea menor o igual a 5
            System.out.println("i = " + i);  // Imprime el valor de i
            i++;  // Incrementa i en 1 en cada iteración
        }

        // Reiniciamos 'i' para el siguiente bucle
        i = 0;
        boolean prueba = true;  // Variable de control 'prueba' inicializada en 'true'

        // Segundo bucle 'while' - Imprime los valores de i desde 0 hasta 6
        while (prueba) {  // Mientras 'prueba' sea verdadera
            if (i == 7) {  // Si i llega a ser 7
                prueba = false;  // Cambia 'prueba' a 'false' para salir del bucle
            }
            System.out.println("i = " + i);  // Imprime el valor de i
            i++;  // Incrementa i en 1
        }

        // Reiniciamos 'prueba' a 'false' para el siguiente bucle
        prueba = false;

        // Tercer bucle 'while' - Este bucle nunca se ejecutará
        while (prueba) {  // Mientras 'prueba' sea verdadera
            System.out.println("nunca se va a ejecutar");  // Este código no se ejecutará
        }

        // Cuarto bucle 'do-while' - Se ejecuta al menos una vez
        do {
            System.out.println("Se ejecuta al menos una vez ");  // Este mensaje se imprimirá una vez
        } while (prueba);  // Aunque 'prueba' sea 'false', el bucle se ejecuta al menos una vez

        // Reiniciamos variables para el siguiente bucle
        prueba = true;
        i = 0;

        // Quinto bucle 'do-while' - Imprime los valores de i hasta llegar a 10
        do {
            if (i == 10) {  // Si i llega a ser 10
                prueba = false;  // Cambia 'prueba' a 'false' para salir del bucle
            }
            System.out.println("i = " + i);  // Imprime el valor de i
            i++;  // Incrementa i en 1
        } while (prueba);  // El bucle continúa hasta que 'prueba' sea 'false'

    }
}
