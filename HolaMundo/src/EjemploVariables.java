import java.util.Arrays;

public class EjemploVariables {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde java";
        System.out.println(saludar);
        //para convertir en mayusculas
        System.out.println("saludar. = " + saludar.toUpperCase() );

        int numero = 11;
        System.out.println("numero = " + numero);

        int numero2 = 5;
        boolean valor = true;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = "15";

        String nombre;

        nombre = "Andres";

        if (numero > 10){
            nombre = "Brian";
        }
        System.out.println("nombre = " + nombre);

        int edad = 5;
    }
}
