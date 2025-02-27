package FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        // Se declara una variable de tipo char con el valor '3'
        char num = '3';

// Se utiliza un switch para verificar el valor de la variable num
        switch (num) {
            // Si num es igual a '0', se ejecuta este bloque
            case '0':
                System.out.println("El num es cero");
                break;

            // Si num es igual a '1', se ejecuta este bloque
            case '1':
                System.out.println("El num es uno");
                break;

            // Si num es igual a '2', se ejecuta este bloque
            case '2':
                System.out.println("El num es dos");
                break;

            // Si num es igual a '3', se ejecuta este bloque
            case '3':
                System.out.println("El num es tres");
                break;

            // Si num es igual a 'a', se ejecuta este bloque
            case 'a':
                System.out.println("El caracter es a");
                break;

            // Si ninguno de los casos anteriores coincide, se ejecuta el bloque por defecto
            default:
                System.out.println("Número o carácter desconocido!");
        }
        // Se declara una variable de tipo String con el valor "brian"
        String nombre = "brian";

        // Se utiliza un switch para verificar el valor de la variable nombre
        switch (nombre) {
            // Si nombre es igual a "admin", se ejecuta este bloque
            case "admin":
                System.out.println("Hola admin bienvenido!");
                break;

            // Si nombre es igual a "brian", se ejecuta este bloque
            case "brian":
                System.out.println("Hola brian!");
                break;

            // Si nombre es igual a "pepe", se ejecuta este bloque
            case "pepe":
                System.out.println("Hola pepe!");
                break;

            // Si ninguno de los casos anteriores coincide, se ejecuta el bloque por defecto
            default:
                System.out.println("Usuario desconocido!");
        }

    }
}
