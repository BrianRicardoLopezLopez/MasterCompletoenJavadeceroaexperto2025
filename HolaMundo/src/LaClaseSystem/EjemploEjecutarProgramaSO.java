package LaClaseSystem;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        // Obtiene una instancia de Runtime, que permite ejecutar procesos en el sistema operativo
        Runtime rt = Runtime.getRuntime();
        Process process; // Variable para almacenar el proceso que se ejecutará

        try {
            // Verifica si el sistema operativo es Windows
            if (System.getProperty("os.name").startsWith("Windows")) {
                // Si es Windows, ejecuta el programa "notepad" (Bloc de notas)
                process = rt.exec("notepad");
            }
            // Verifica si el sistema operativo es macOS
            else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                // Si es macOS, ejecuta el programa "textedit" (Editor de texto)
                process = rt.exec("textedit");
            }
            // Verifica si el sistema operativo es basado en Linux
            else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                // Si es Linux, ejecuta el editor de texto "gedit" (editor por defecto en muchas distribuciones)
                process = rt.exec("gedit");
            }
            // Si no es ninguno de los anteriores, por defecto se ejecuta "gedit" para entornos no reconocidos
            else {
                process = rt.exec("gedit");
            }

            // Espera hasta que el proceso (el editor de texto) termine su ejecución
            process.waitFor();
        } catch (Exception e) {
            // Si ocurre una excepción, se imprime el mensaje de error
            System.err.println("El comando es desconocido: " + e.getMessage());
            // Finaliza el programa con un código de salida 1, indicando error
            System.exit(1);
        }

// Imprime un mensaje indicando que el editor se ha cerrado
        System.out.println("Se ha cerrado el editor");

// Finaliza el programa con código de salida 0, indicando que terminó exitosamente
        System.exit(0);

    }
}
