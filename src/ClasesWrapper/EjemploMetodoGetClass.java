package ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        // Definimos una variable de tipo String
        String texto = "Hola que tal!";

        // Obtenemos la clase de la variable 'texto' utilizando el metodo getClass()
        Class strClass = texto.getClass();

        // Mostrar el nombre completo de la clase, que incluye el paquete
        System.out.println("strClass.getName() = " + strClass.getName());
        // Salida esperada: java.lang.String

        // Mostrar solo el nombre de la clase, sin el paquete
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        // Salida esperada: String

        // Mostrar el nombre del paquete al que pertenece la clase
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        // Salida esperada: java.lang

        // Mostrar la referencia de la clase en formato 'class nombreDelPaquete.NombreClase'
        System.out.println("strClass = " + strClass);
        // Salida esperada: class java.lang.String

        // Obtener todos los métodos de la clase 'String' e imprimir su nombre
        for (Method method : strClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
        // Esto imprimirá los nombres de todos los métodos públicos de la clase String

        // Definimos una variable de tipo Integer
        Integer num = 34;

        // Obtenemos la clase asociada con la variable 'num' (que es de tipo Integer)
        Class intClass = num.getClass();

        // Obtenemos la clase de la clase Integer, es decir, la clase de su superclase que es 'Number'
        Class objClass = intClass.getSuperclass().getSuperclass();

        // Imprimir la referencia de la clase 'Integer'
        System.out.println("intClass = " + intClass);
        // Salida esperada: class java.lang.Integer

        // Imprimir el nombre completo de la clase 'Integer'
        System.out.println("intClass.getName() = " + intClass.getName());
        // Salida esperada: java.lang.Integer

        // Imprimir el nombre simple de la clase 'Integer' (sin paquete)
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        // Salida esperada: Integer

        // Imprimir el nombre del paquete al que pertenece la clase 'Integer'
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        // Salida esperada: java.lang

        // Imprimir la superclase de 'Integer', que es 'Number'
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        // Salida esperada: class java.lang.Number

        // Imprimir la superclase de la superclase de 'Integer', que es 'Object'
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        // Salida esperada: class java.lang.Object

        // Imprimir la clase de la superclase de 'Integer', que es 'Number'
        System.out.println("objClass = " + objClass);
        // Salida esperada: class java.lang.Number

        // Obtener todos los métodos de la clase 'Number' (superclase de 'Integer') e imprimir su nombre
        for (Method method : objClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
        // Esto imprimirá los métodos públicos de la clase 'Number'

    }
}

