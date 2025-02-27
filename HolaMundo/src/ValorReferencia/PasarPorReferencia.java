package ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        // Se declara un arreglo de enteros llamado 'edad' con tres elementos: 10, 11 y 12
        int[] edad = {10, 11, 12};

        // Imprime los valores del arreglo antes de llamar al metodo 'test'
        System.out.println("Iniciamos el método main con i = ");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        // Se indica que antes de llamar al metodo 'test', se mostrará el estado de los valores de 'edad'
        System.out.println("Antes de llamar al método test");

        // Llama al metodo 'test' pasando el arreglo 'edad' como argumento
        test(edad);

        // Después de llamar al metodo 'test', muestra el estado de los valores de 'edad'
        System.out.println("Despues de llamar al método test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        // Finaliza el metodo main indicando que los datos han sido modificados
        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    // Metodo que recibe un arreglo de enteros como parámetro
    public static void test(int[] edadArr) {
        // Imprime que se inicia el metodo 'test'
        System.out.println("Iniciamos el método test");

        // Recorre el arreglo y le suma 20 a cada elemento
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }

        // Imprime que finaliza el metodo 'test'
        System.out.println("Finaliza el método test");
    }
}
