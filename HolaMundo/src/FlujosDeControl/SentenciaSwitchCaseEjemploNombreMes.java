package FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCaseEjemploNombreMes {
    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);

// Se le solicita al usuario ingresar el número del mes (de 1 a 12)
        System.out.println("Ingrese el número del mes 1 - 12");

// El número del mes que ingresa el usuario se guarda en la variable 'mes'
        int mes = sc.nextInt();  // lee el número del mes
        // Se declara una variable de tipo String que almacenará el nombre del mes
        String nombreMes = null;

        // Se utiliza un switch para determinar el nombre del mes según el número ingresado
        switch (mes) {
            case 1:
                nombreMes = "Enero";  // Si el mes es 1, el nombre será "Enero"
                break;
            case 2:
                nombreMes = "Febrero";  // Si el mes es 2, el nombre será "Febrero"
                break;
            case 3:
                nombreMes = "Marzo";  // Si el mes es 3, el nombre será "Marzo"
                break;
            case 4:
                nombreMes = "Abril";  // Si el mes es 4, el nombre será "Abril"
                break;
            case 5:
                nombreMes = "Mayo";  // Si el mes es 5, el nombre será "Mayo"
                break;
            case 6:
                nombreMes = "Junio";  // Si el mes es 6, el nombre será "Junio"
                break;
            case 7:
                nombreMes = "Julio";  // Si el mes es 7, el nombre será "Julio"
                break;
            case 8:
                nombreMes = "Agosto";  // Si el mes es 8, el nombre será "Agosto"
                break;
            case 9:
                nombreMes = "Septiembre";  // Si el mes es 9, el nombre será "Septiembre"
                break;
            case 10:
                nombreMes = "Octubre";  // Si el mes es 10, el nombre será "Octubre"
                break;
            case 11:
                nombreMes = "Noviembre";  // Si el mes es 11, el nombre será "Noviembre"
                break;
            case 12:
                nombreMes = "Diciembre";  // Si el mes es 12, el nombre será "Diciembre"
                break;
            // Si el número del mes no es válido (es decir, no está en el rango de 1 a 12)
            default:
                nombreMes = "Indefinido";  // En caso de error, se asigna "Indefinido"
        }

        // Se imprime el nombre del mes correspondiente
        System.out.println("nombreMes = " + nombreMes);  // Muestra el mes o "Indefinido" si no se encuentra un valor válido

    }
}
