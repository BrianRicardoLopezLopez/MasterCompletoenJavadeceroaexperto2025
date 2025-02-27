package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        // Se obtiene una instancia del calendario con la fecha y hora actuales
        Calendar calendar = Calendar.getInstance();

        //Alternativa
        //calendar.set(2020, Calendar.APRIL, 25, 24, 20,10);
        // Se establece el año a 2020
        calendar.set(Calendar.YEAR, 2020);
        // Se establece el mes a julio (en Calendar, enero es 0, por lo que julio es 6)
        calendar.set(Calendar.MONTH, Calendar.JULY);
        // Se establece el día del mes a 25
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        //Alternativa
        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        // Se establece la hora a 7 PM
        calendar.set(Calendar.HOUR, 7);
        // Se establece AM/PM a PM (por la tarde)
        calendar.set(Calendar.AM_PM, Calendar.PM);
        // Se establece los minutos a 20
        calendar.set(Calendar.MINUTE, 20);
        // Se establece los segundos a 10
        calendar.set(Calendar.SECOND, 10);
        // Se establece los milisegundos a 125
        calendar.set(Calendar.MILLISECOND, 125);

        // Se obtiene un objeto Date a partir del calendario
        Date fecha = calendar.getTime();

        // Se imprime la fecha sin formato, que será la representación predeterminada de Date
        System.out.println("Fecha sin formato = " + fecha);

        // Se crea un objeto SimpleDateFormat con el formato deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS");

        // Se convierte la fecha a un String con el formato especificado
        String fechaConFormato = formato.format(fecha);

        // Se imprime la fecha con el formato personalizado
        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}
