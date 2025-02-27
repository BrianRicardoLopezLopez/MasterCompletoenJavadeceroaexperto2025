package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        // Se crea un arreglo de nombres
        String[] nombres = {"Brian", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        // Se obtiene la longitud del arreglo para saber cuántos elementos tiene
        int count = nombres.length;

        // Primer bucle: Itera sobre todos los elementos del arreglo 'nombres'
        for (int i = 0; i < count; i++) {
            // Si el nombre actual es "Lalo" o "Pepe", el bucle salta a la siguiente iteración
            if (nombres[i].equalsIgnoreCase("Lalo") || nombres[i].equalsIgnoreCase("Pepe")){
                continue;  // Si es "Lalo" o "Pepe", no se imprime y se pasa al siguiente nombre
            }

            // Si no es "Lalo" ni "Pepe", se imprime el índice y el nombre
            System.out.println(i + "._ " + nombres[i]);
        }

        // Solicita al usuario que ingrese un nombre para buscar
        String buscar = JOptionPane.showInputDialog("Ingresa un nombre, Ejemplo \"Brian\" o \"Maria\" ");
        System.out.println("buscar = " + buscar);  // Imprime el nombre que se busca en la consola

        // Variable para indicar si el nombre fue encontrado
        boolean encontrado = false;

        // Segundo bucle: Se busca el nombre introducido por el usuario en el arreglo 'nombres'
        for (int i = 0; i < count; i++) {
            // Si el nombre actual del arreglo coincide con el nombre ingresado (sin importar mayúsculas o minúsculas)
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;  // Se marca que el nombre fue encontrado
                break;  // Sale del bucle si encuentra el nombre
            }
            // Imprime todos los nombres mientras no se haya encontrado el nombre buscado
            System.out.println("nombres = " + nombres[i]);
        }

        // Después de finalizar el bucle de búsqueda, muestra el resultado
        if (encontrado){
            // Si el nombre fue encontrado, muestra un mensaje de éxito
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        }else{
            // Si el nombre no fue encontrado, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema!");
        }

    }
}
