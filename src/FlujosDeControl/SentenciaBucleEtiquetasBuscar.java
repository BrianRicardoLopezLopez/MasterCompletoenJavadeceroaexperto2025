package FlujosDeControl;

public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        // Definición de la frase y la palabra a buscar
        String frase = "trigo tres tristes tigres tragan trigo trigo en un trigal trigo";
        String palabra = "trigo";

        // Obtiene la longitud de la palabra y la longitud máxima hasta donde se puede buscar en la frase
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;  // La búsqueda se limita a la longitud total de la frase menos la longitud de la palabra

        // Variable que contará cuántas veces aparece la palabra
        int cantidad = 0;
        char letra = 'g';  // Declaración de una variable 'letra' que no se usa en el código

        // Etiqueta 'buscar' utilizada para controlar el flujo en caso de encontrar una discrepancia
        buscar:
        for (int i = 0; i <= maxFrase; ) {  // Itera desde el inicio hasta la longitud máxima donde podría haber una coincidencia
            int k = i;  // Establece un puntero k que inicialmente apunta a 'i' (posición de búsqueda en la frase)

            // Segundo bucle 'for' para comparar cada carácter de la palabra con la subcadena de la frase
            for (int j = 0; j < maxPalabra; j++) {
                // Si los caracteres no coinciden, se avanza el índice 'i' y se continúa con la siguiente iteración del bucle externo
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;  // Avanza al siguiente carácter en la frase
                    continue buscar;  // Vuelve al inicio del bucle externo y salta a la siguiente iteración
                }
            }

            // Si la palabra se ha encontrado completamente, incrementa el contador
            cantidad++;

            // Salta a la siguiente posición de búsqueda en la frase (después de haber encontrado la palabra)
            i = i + maxPalabra;
        }

        // Imprime cuántas veces se ha encontrado la palabra en la frase
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");

    }
}
