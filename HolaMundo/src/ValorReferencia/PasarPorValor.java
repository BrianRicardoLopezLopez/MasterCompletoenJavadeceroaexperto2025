package ValorReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        // Se declara una variable 'i' de tipo int y se le asigna el valor 10
        int i = 10;

        // Imprime el valor de 'i' al iniciar el metodo main
        System.out.println("Iniciamos el método main con i = " + i);

        // Llama al metodo 'test', pasando el valor de 'i' como argumento
        test(i);

        // Imprime el valor de 'i' después de ejecutar el metodo 'test'
        // 'i' sigue siendo el mismo, ya que en Java los tipos primitivos se pasan por valor
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);
    }

    // Metodo que recibe un parámetro de tipo int
    public static void test(int i) {
        // Imprime el valor de 'i' dentro del metodo test
        System.out.println("Iniciamos el método test con i = " + i);

        // Asigna el valor 35 a 'i', pero esto solo afecta a la copia local de 'i'
        i = 35;

        // Imprime el valor de 'i' después de cambiarlo dentro del metodo test
        System.out.println("Finaliza el método test con i = " + i);
    }
}
