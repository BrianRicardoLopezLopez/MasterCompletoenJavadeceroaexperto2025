package ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        // Array de objetos Integer. El primer elemento se convierte explícitamente usando 'valueOf'.
        // Los demás elementos son autoboxed automáticamente a Integer.
        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Inicializamos la variable 'sum' que almacenará la suma de los números pares.
        int sum = 0;

        // Primer bucle: Usamos el metodo 'intValue()' explícitamente para obtener el valor primitivo de tipo 'int'.
        for (Integer i : enteros) {
            // Comprobamos si el número es par usando 'intValue()' para obtener el valor de 'Integer'
            if (i.intValue() % 2 == 0) {
                // Si el número es par, lo sumamos a 'sum'
                sum += i.intValue();
            }
        }
        // Imprimimos la suma de los números pares
        System.out.println("sum = " + sum);

        // Se imprime una línea en blanco para separar los resultados
        System.out.println();

        // Reiniciamos la variable 'sum' a 0 para el segundo cálculo
        sum = 0;

        // Segundo bucle: Aquí usamos la autoboxing directamente, que convierte automáticamente 'i' en 'int'.
        for (Integer i : enteros) {
            // Comprobamos si el número es par, sin necesidad de llamar a 'intValue()'.
            if (i % 2 == 0) {
                // Si el número es par, lo sumamos a 'sum'.
                sum += i;
            }
        }
        // Imprimimos la suma de los números pares usando autoboxing
        System.out.println("sum = " + sum);

    }
}
