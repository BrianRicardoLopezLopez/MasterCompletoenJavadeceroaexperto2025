package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParseComparar {
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);

        // Define el formato de la fecha que el usuario debe ingresar ('yyyy-MM-dd')
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Solicita al usuario que ingrese una fecha con el formato especificado
        System.out.println("Ingresa la fecha con formato 'yyyy-MM-dd'");

        try {
            // Lee la fecha proporcionada por el usuario como una cadena de texto y la convierte a tipo Date usando el formato definido
            Date fecha = dateFormat.parse(sc.next());

            // Muestra la fecha obtenida en formato Date (por defecto la muestra como fecha y hora)
            System.out.println("fecha = " + fecha);

            // Formatea la fecha obtenida de vuelta al formato de cadena definido anteriormente y la imprime
            System.out.println("dateFormat = " + dateFormat.format(fecha));

            // Crea un objeto Date con la fecha y hora actuales
            Date fecha2 = new Date();

            // Muestra la fecha y hora actuales (fecha2)
            System.out.println("fecha2 = " + fecha2);

            // Compara la fecha ingresada por el usuario con la fecha actual
            if (fecha.after(fecha2)) {
                System.out.println("Fecha1 (del usuario) es después que fecha 2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha2");
            }

            // Otra forma de comparar las fechas utilizando el método compareTo
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha1 (del usuario) es despues que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual a fecha2");
            }
        } catch (ParseException e) {
            // Si ocurre un error al parsear la fecha (por ejemplo, si el formato no es correcto), se captura la excepción y se imprime el error
            e.printStackTrace();
        }

    }
}
