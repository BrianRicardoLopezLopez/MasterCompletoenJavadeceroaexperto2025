package FlujosDeControl;

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        // Etiqueta 'bucle' utilizada para controlar el flujo del programa
        bucle:
        for (int i = 1; i <= 7; i++) {  // Itera sobre los días de la semana (1 a 7)
            int j = 1;  // Inicializa la variable j para la hora de trabajo
            while (j <= 8) {  // Itera sobre las horas de trabajo de 1 a 8
                // Si el día es 6 o 7, es el fin de semana y se imprime el mensaje de descanso
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");  // Mensaje de descanso
                    continue bucle;  // Salta al siguiente día (continuando con la iteración de 'bucle')
                }
                // Si no es fin de semana, imprime el horario de trabajo
                System.out.println("Dia " + i + ", trabando a las " + j + "hrs. ");
                j++;  // Incrementa la hora
            }
        }

        // Etiqueta 'bucle1' para controlar el flujo de las iteraciones
        bucle1:
        for (int i = 0; i < 5; i++) {  // Itera 5 veces sobre i
            System.out.println();  // Salto de línea
            for (int j = 0; j < 5; j++) {  // Itera 5 veces sobre j
                // Si i es igual a 2, se salta al siguiente ciclo de 'bucle1'
                if (i == 2) {
                    continue bucle1;  // Salta a la siguiente iteración de 'bucle1' sin ejecutar el resto del bucle interno
                }
                // Si i no es igual a 2, imprime el valor de i y j
                System.out.print("[i = " + i + " j = " + j + "], ");
            }
        }

        // Mensaje de separación para visualizar el flujo
        System.out.println();
        System.out.println("========================================");

        // Etiqueta 'etiqueta' para controlar el flujo y romper el bucle exterior
        etiqueta:
        for (int i = 0; i < 5; i++) {  // Itera 5 veces sobre i
            System.out.println();  // Salto de línea
            for (int j = 0; j < 5; j++) {  // Itera 5 veces sobre j
                // Si i es igual a 2, rompe el bucle exterior 'etiqueta'
                if (i == 2) {
                    break etiqueta;  // Sale del bucle 'etiqueta', deteniendo tanto el bucle interior como el exterior
                }
                // Si no se rompe el bucle, imprime el valor de i y j
                System.out.print("[i = " + i + " j = " + j + "], ");
            }
        }
    }
}
