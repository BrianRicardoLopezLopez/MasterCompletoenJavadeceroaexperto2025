package Operadores;

public class OperadorInstanceOfTipoGenericos {
    public static void main(String[] args) {

        // Se crea un objeto de tipo Object que contiene una cadena de texto
        Object texto = "Creando un objeto de la clase String ... que tal!";

        // Se crea un objeto de tipo Number utilizando Integer.valueOf(7)
        Number num = Integer.valueOf(7); // 7;

        // Verificamos si el objeto 'texto' es una instancia de la clase String
        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        // Verificamos si el objeto 'texto' es una instancia de la clase Object
        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        // Verificamos si el objeto 'texto' es una instancia de la clase Integer
        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Integer
        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Number
        b1 = num instanceof Number;
        System.out.println("Num es del tipo Number = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Object
        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Long
        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Double
        b1 = num instanceof Double;
        System.out.println("Num es del tipo Double = " + b1);

        // Se crea un objeto Number de tipo Float con el valor 45.54f
        Number decimal = Float.valueOf(45.54f);

        // Verificamos si el objeto 'decimal' es una instancia de la clase Double
        b1 = decimal instanceof Double;
        System.out.println("Decimal es del tipo Double = " + b1);

        // Verificamos si el objeto 'decimal' es una instancia de la clase Float
        b1 = decimal instanceof Float;
        System.out.println("Decimal es del tipo Float = " + b1);

        // Verificamos si el objeto 'decimal' es una instancia de la clase Integer
        b1 = decimal instanceof Integer;
        System.out.println("Decimal es del tipo Integer = " + b1);

        // Verificamos si el objeto 'num' es una instancia de la clase Number
        b1 = num instanceof Number;
        System.out.println("Decimal es de tipo Number = " + b1);

        // Creamos un objeto Boolean
        Boolean b2 = texto instanceof String; // b2 toma el valor de true porque 'texto' es un String

        // Verificamos si b2 es una instancia de la clase Boolean
        b2 = b2 instanceof Boolean; // Devuelve true porque b2 es un objeto de tipo Boolean
        System.out.println("b2 es de tipo Boolean = " + b2);


    }
}
