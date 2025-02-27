package ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        // Se crea un objeto Integer con el valor 1000 usando 'valueOf'
        Integer num1 = Integer.valueOf(1000);

        // Se asigna el mismo objeto 'num1' a 'num2' (ambos apuntan al mismo objeto en memoria)
        Integer num2 = num1;

        // Se imprime el valor de num1 y num2
        System.out.println("num1 = " + num1);  // Imprime 1000
        System.out.println("num2 = " + num2);  // Imprime 1000

        // Compara si num1 y num2 son el mismo objeto en memoria utilizando '=='
        // '==' compara si dos variables apuntan al mismo objeto (referencia en memoria)
        System.out.println("Son el mismo objeto? " + (num1 == num2));  // Imprime true, ya que ambas referencias apuntan al mismo objeto

        // Asigna un valor primitivo a num2, lo cual desencadenará un autoboxing y num2 se convierte en un nuevo objeto Integer
        num2 = 1000;

        // Se imprime el valor de num1 y num2
        System.out.println("num1 = " + num1);  // Imprime 1000
        System.out.println("num2 = " + num2);  // Imprime 1000

        // Compara si num1 y num2 son el mismo objeto en memoria utilizando '=='
        // Aunque ambos tienen el mismo valor, son diferentes objetos en memoria
        System.out.println("Son el mismo objeto? " + (num1 == num2));  // Imprime false, ya que son dos objetos diferentes

        // Compara si los objetos tienen el mismo valor usando el metodo 'equals()'
        // 'equals()' compara los valores dentro de los objetos, no sus referencias en memoria
        System.out.println("tienen el mismo valor? " + (num1.equals(num2)));  // Imprime true, porque los valores son iguales

        // Compara los valores primitivos de los objetos Integer usando 'intValue()'
        // 'intValue()' devuelve el valor primitivo de tipo int almacenado en el objeto Integer
        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));  // Imprime true, ya que los valores primitivos son iguales

        // Asigna un nuevo valor a num2 y realiza una comparación usando el operador '>'
        num2 = 500;

        // Compara si num1 es mayor que num2 utilizando el operador '>'
        // Java realiza un unboxing automático de los objetos Integer a valores primitivos 'int'
        boolean condicion = num1 > num2;  // Imprime true porque 1000 > 500
        System.out.println("condicion = " + condicion);  // Imprime true

        // Realiza una comparación similar utilizando el mEtodo 'intValue()' para obtener los valores primitivos de los objetos Integer
        boolean condicion2 = num1.intValue() < num2.intValue();  // Compara 1000 < 500 (esto es falso)
        System.out.println("condicion = " + condicion2);  // Imprime false

    }
}
