package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        // Se declara un valor primitivo de tipo int
        int intPrimitivo = 32768;

        // Se convierte el valor primitivo en un objeto Integer usando 'valueOf'
        Integer intObjeto = Integer.valueOf(intPrimitivo);

        // Se puede usar la autoboxing para asignar el valor primitivo a un objeto Integer directamente
        Integer intObjeto2 = intPrimitivo;  // Autoboxing: Java convierte el valor de 'int' a 'Integer' automáticamente

        // Se imprime el valor de los objetos Integer
        System.out.println("intObjeto = " + intObjeto);  // Imprime el objeto Integer 'intObjeto'
        System.out.println("intObjeto2 = " + intObjeto2);  // Imprime el objeto Integer 'intObjeto2'

        // Se convierte el objeto Integer de nuevo a un tipo primitivo 'int'
        int num = intObjeto;  // Unboxing: Java convierte automáticamente el objeto Integer a un valor primitivo int
        System.out.println("num = " + num);  // Imprime el valor primitivo de 'int'

        // Usando el metodo 'intValue()' para obtener el valor primitivo de 'int' desde el objeto Integer
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);  // Imprime el valor primitivo de 'int' usando 'intValue()'

        // Se convierte un String a Integer usando 'valueOf'
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);  // Convierte el String "67000" a un Integer
        System.out.println("valor = " + valor);  // Imprime el Integer 'valor'

        // Se convierte el objeto Integer a un tipo primitivo 'short'
        Short shortObjeto = intObjeto.shortValue();  // Convierte el valor del Integer a 'short'
        // **Desbordamiento aquí:** El valor 32768 está fuera del rango de 'short' (-32,768 a 32,767).
        // El valor de 'short' será -32,768 debido al desbordamiento.
        System.out.println("shortObjeto = " + shortObjeto);  // Imprime el valor de 'shortObjeto'

        // Se convierte el objeto Integer a un tipo primitivo 'byte'
        Byte byteObjeto = intObjeto.byteValue();  // Convierte el valor del Integer a 'byte'
        // **Desbordamiento aquí:** El valor 32768 está fuera del rango de 'byte' (-128 a 127).
        // El valor de 'byte' será 0 debido al desbordamiento.
        System.out.println("byteObjeto = " + byteObjeto);  // Imprime el valor de 'byteObjeto'

        // Se convierte el objeto Integer a un tipo primitivo 'long'
        Long longObjeto = intObjeto.longValue();  // Convierte el valor del Integer a 'long'
        // **No hay desbordamiento aquí:** El tipo 'long' puede almacenar valores más grandes que 'int',
        // por lo que el valor 32768 se almacena correctamente.
        System.out.println("longObjeto = " + longObjeto);  // Imprime el valor de 'longObjeto'

    }
}
