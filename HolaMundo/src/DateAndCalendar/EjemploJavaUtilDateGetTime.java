package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateGetTime {
    public static void main(String[] args) {

        // Se crea un objeto 'fecha' de tipo Date que obtiene la fecha y hora actuales.
        Date fecha = new Date();

        // Imprime la fecha y hora actual en formato estándar
        System.out.println("fecha = " + fecha);

        // Se crea un objeto SimpleDateFormat con un patrón específico para el formato de la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");

        // Se formatea el objeto 'fecha' según el patrón definido y se guarda como un String
        String fechaStr = dateFormat.format(fecha);

        // Inicializamos una variable 'j' de tipo long para realizar un cálculo en el ciclo
        long j = 0;

        // Ciclo for que realiza una suma acumulativa de los números del 0 al 9999999
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }

        // Se crea otro objeto 'fecha2' para registrar la fecha y hora después de ejecutar el ciclo
        Date fecha2 = new Date();
        // Calcula el tiempo transcurrido entre 'fecha' y 'fecha2' en milisegundos
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        // Imprime el valor final de 'j', resultado del ciclo
        System.out.println("j = " + j);
        // Imprime el tiempo transcurrido en el ciclo 'for'
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);

        // Imprime la fecha formateada
        System.out.println("fechaStr = " + fechaStr);


    }
}
