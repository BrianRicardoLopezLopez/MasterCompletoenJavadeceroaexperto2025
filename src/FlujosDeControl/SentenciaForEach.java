package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        // Definición de un arreglo de números impares
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

        // Bucle for-each para recorrer todos los elementos del arreglo 'numeros'
        for (int num: numeros){  // 'num' toma el valor de cada elemento del arreglo 'numeros'
            System.out.println("num = " + num);  // Imprime el valor de 'num'
        }

        // Definición de un arreglo de nombres
        String[] nombres = {"Brian", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        // Bucle for-each para recorrer todos los elementos del arreglo 'nombres'
        for (String nombre: nombres){  // 'nombre' toma el valor de cada elemento del arreglo 'nombres'
            System.out.println("nombre = " + nombre);  // Imprime el valor de 'nombre'
        }

    }
}
