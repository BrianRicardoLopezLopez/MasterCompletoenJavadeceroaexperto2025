package ValorReferencia;
class Persona {
    // Atributo público nombre de tipo String
    public String nombre;

    // Método para modificar el atributo 'nombre' de la clase Persona
    public void modificarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    // Método para leer el atributo 'nombre' de la clase Persona
    public String leerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // Se crea un objeto de tipo Persona
        Persona persona = new Persona();
        persona.modificarNombre("Brian"); // Inicializamos el nombre con "Brian"

        System.out.println("Iniciamos el método main");

        // Se imprime el nombre antes de llamar al método 'test'
        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");

        // Llamada al método 'test', pasando el objeto 'persona'
        test(persona);

        // Se imprime el nombre después de llamar al método 'test'
        System.out.println("Después de llamar al método test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        // Mensaje final
        System.out.println("Finaliza el método main con los datos del objeto modificados!");
    }

    // Método que recibe un objeto de tipo Persona
    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");

        // Se modifica el nombre del objeto persona dentro del método 'test'
        persona.modificarNombre("Pepe");

        // Mensaje indicando que el método ha terminado
        System.out.println("Finaliza el método test");
    }
}
