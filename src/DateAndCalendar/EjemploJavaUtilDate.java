package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        // Se crea un objeto 'fecha' de tipo Date que obtiene la fecha y hora actuales.
        Date fecha = new Date();

        // Imprime la fecha y hora actual en formato estándar
        System.out.println("fecha = " + fecha);

        // Se crea un objeto SimpleDateFormat con un patrón específico para el formato de la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");

        // Se formatea el objeto 'fecha' según el patrón definido y se guarda como un String
        String fechaStr = dateFormat.format(fecha);

        // Imprime la fecha formateada
        System.out.println("fechaStr = " + fechaStr);


    }
}
