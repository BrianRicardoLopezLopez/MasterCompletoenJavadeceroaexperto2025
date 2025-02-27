package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Se define un formato para las fechas (yyyy-MM-dd)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Pide al usuario que ingrese una fecha con el formato especificado
        System.out.println("Ingresa la fecha con formato 'yyyy-MM-dd'");
        try {
            // Lee la fecha ingresada por el usuario y la convierte en un objeto Date
            Date fecha = dateFormat.parse(sc.next());
            // Imprime la fecha ingresada en su forma estándar (sin formato)
            System.out.println("fecha = " + fecha);
            // Imprime la fecha formateada de nuevo según el formato definido (yyyy-MM-dd)
            System.out.println("dateFormat = " + dateFormat.format(fecha));
        } catch (ParseException e) {
            // En caso de error en el formato de fecha, se muestra el error
            e.printStackTrace();
        }
    }
}
