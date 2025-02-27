package ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        // Declaración de variables Integer
        Integer num1, num2;

        // Asignación de valores primitivos a los objetos Integer mediante autoboxing
        num1 = 1;
        num2 = 2;

        // Compara los valores primitivos de num1 y num2 usando el operador '>'
        boolean primBoolean = num1 > num2;  // Compara 1 > 2, lo cual es falso
        Boolean objBoolean = Boolean.valueOf(primBoolean);  // Convierte el valor primitivo a un objeto Boolean
        Boolean objBoolean2 = Boolean.valueOf("false");  // Convierte la cadena "false" a un objeto Boolean con valor 'false'
        Boolean objBoolean3 = true;  // Asigna el valor verdadero directamente

        // Imprime los valores de las variables
        System.out.println("primBoolean = " + primBoolean);  // Imprime 'primBoolean = false'
        System.out.println("objBoolean = " + objBoolean);  // Imprime 'objBoolean = false'
        System.out.println("objBoolean2 = " + objBoolean2);  // Imprime 'objBoolean2 = false'

        // Comparación entre objetos Boolean usando '=='
        // '==' compara las referencias de memoria, no los valores de los objetos
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        // False porque objBoolean y objBoolean2 son dos objetos diferentes aunque contienen el mismo valor 'false'

        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        // True porque 'equals()' compara el valor dentro de los objetos, y ambos son 'false'

        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean3));
        // False, porque aunque ambos tienen el mismo valor 'false', son dos objetos diferentes (uno es un objeto Boolean, el otro un primitivo 'true')

        System.out.println("Comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        // False porque 'objBoolean2' es un objeto Boolean y 'objBoolean3' es un valor booleano primitivo (true)

        // Conversión de un objeto Boolean a un valor primitivo usando 'booleanValue()'
        boolean primBoolean2 = objBoolean2.booleanValue();  // Convierte el valor 'false' del objeto Boolean a un valor primitivo booleano
        System.out.println("primBoolean2 = " + primBoolean2);  // Imprime 'primBoolean2 = false'

    }
}
