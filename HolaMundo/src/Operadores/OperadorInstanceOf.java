package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
       // String texto = new String("Creando un objeto de la clase String ... que tal!");
        // Se crea un objeto String con un texto
        String texto = "Creando un objeto de la clase String ... que tal!";

        // Se crea un objeto Integer con el valor 7
        Integer num = 7;

        // Verificamos si el objeto 'texto' es una instancia de la clase String
        boolean b1 = texto instanceof String;  // Devuelve true porque 'texto' es un objeto String
        System.out.println("Texto es del tipo String = " + b1);

        // Verificamos si el objeto 'texto' es una instancia de la clase Object
        b1 = texto instanceof Object;  // Devuelve true porque todas las clases en Java heredan de Object
        System.out.println("Texto es del tipo Object = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Integer
        b1 = num instanceof Integer;  // Devuelve true porque 'num' es un Integer
        System.out.println("Num es del tipo Integer = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Number
        b1 = num instanceof Number;  // Devuelve true porque Integer es una subclase de Number
        System.out.println("Num es del tipo Number = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Object
        b1 = num instanceof Object;  // Devuelve true porque todas las clases en Java heredan de Object
        System.out.println("Num es del tipo Object = " + b1);

        // Creamos un objeto Double con el valor 45.54
        Double decimal = 45.54;
        // Verificamos si el objeto 'num' es una instancia de la clase Number
        b1 = num instanceof Number;  // Devuelve true porque Integer es una subclase de Number
        System.out.println("Decimal es de tipo Number = " + b1);

        // Creamos un objeto Boolean
        Boolean b2 = texto instanceof String;  // b2 toma el valor de true porque 'texto' es un String
        // Verificamos si b2 es una instancia de la clase Boolean
        b2 = b2 instanceof Boolean;  // Devuelve true porque b2 es un objeto de tipo Boolean
        System.out.println("b2 es de tipo Boolean = " + b2); 

    }
}
