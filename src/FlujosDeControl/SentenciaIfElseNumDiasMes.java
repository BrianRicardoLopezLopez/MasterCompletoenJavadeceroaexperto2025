package FlujosDeControl;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        Scanner sc = new Scanner(System.in);

        // Se le pide al usuario que ingrese el número del mes (entre 1 y 12)
        System.out.println("Ingrese el número del mes de 1 - 12 ");
        int mes = sc.nextInt();  // Se guarda el número del mes introducido por el usuario

        // Se inicializa la variable numeroDias para almacenar el número de días del mes
        int numeroDias = 0;

        // Se le pide al usuario que ingrese el año en formato YYYY
        System.out.println("Ingresa el año (YYYY)");
        int anio = sc.nextInt();  // Se guarda el año introducido por el usuario

        // Si el mes es uno de los que tienen 31 días (enero, marzo, mayo, julio, agosto, octubre, diciembre)
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;  // Se asignan 31 días al mes
        }
        // Si el mes es uno de los que tienen 30 días (abril, junio, septiembre, noviembre)
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;  // Se asignan 30 días al mes
        }
        // Si el mes es febrero
        else if (mes == 2) {
            // Se verifica si el año es bisiesto (es divisible por 400 o es divisible por 4 pero no por 100)
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29;  // Si es bisiesto, febrero tiene 29 días
            } else {
                numeroDias = 28;  // Si no es bisiesto, febrero tiene 28 días
            }
        }

        // Se imprime el número de días del mes seleccionado
        System.out.println("numeroDias = " + numeroDias);

    }
}
