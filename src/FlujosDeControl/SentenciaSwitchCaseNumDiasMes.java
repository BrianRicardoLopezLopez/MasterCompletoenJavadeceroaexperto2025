package FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        Scanner sc = new Scanner(System.in);

        // Se le pide al usuario que ingrese el número del mes (entre 1 y 12)
        System.out.println("Ingrese el número del mes 1 - 12");
        int mes = sc.nextInt();  // Número del mes

        // Se inicializa la variable numeroDias para almacenar el número de días del mes
        int numeroDias = 0;

        // Se le pide al usuario que ingrese el año en formato YYYY
        System.out.println("Ingrese el año (YYYY)");
        int anio = sc.nextInt();  // Año para verificar si es bisiesto

        // Se utiliza el switch para determinar el número de días del mes
        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                numeroDias = 31;  // Estos meses tienen 31 días
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                numeroDias = 30;  // Estos meses tienen 30 días
                break;
            case 2:  // Febrero
                // Verificamos si el año es bisiesto
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numeroDias = 29;  // Si es bisiesto, febrero tiene 29 días
                } else {
                    numeroDias = 28;  // Si no es bisiesto, febrero tiene 28 días
                }
                break;
            default:  // Si el número de mes no es válido (no está entre 1 y 12)
                numeroDias = 0;
        }

        // Mostramos el número de días del mes
        System.out.println("numeroDias = " + numeroDias);

    }
}
