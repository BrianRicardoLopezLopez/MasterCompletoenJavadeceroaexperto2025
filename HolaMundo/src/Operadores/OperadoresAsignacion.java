
package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        //operadores combinados: -=, +=, /=, *=, %=

        // Declaramos dos variables enteras: i y j
        int i = 5;
        int j = i + 4;  // j toma el valor de i (5) más 4, o sea 9.

        System.out.println("i = " + i);  // Imprime "i = 5"
        System.out.println("j = " + j);  // Imprime "j = 9"

// Usamos el operador += para aumentar el valor de i en 2. Esto es equivalente a: i = i + 2;
        i += 2; // i = i + 2; // i ahora es 7.
        System.out.println("i = " + i);  // Imprime "i = 7"

// Usamos el operador += nuevamente, pero esta vez para aumentar i en 5. Esto es equivalente a: i = i + 5;
        i += 5; // i = i + 5;  // i ahora es 12.
        System.out.println("i = " + i);  // Imprime "i = 12"

// Usamos el operador -= para disminuir j en 4. Esto es equivalente a: j = j - 4;
        j -= 4; // j = j - 4;  // j ahora es 5.
        System.out.println("j = " + j);  // Imprime "j = 5"

// Usamos el operador *= para multiplicar j por 3. Esto es equivalente a: j = j * 3;
        j *= 3; // j = j * 3; // j ahora es 15.
        System.out.println("j = " + j);  // Imprime "j = 15"

// En el siguiente bloque, estamos utilizando el operador += para concatenar cadenas
        String sqlString = "select * from clientes as c";  // Iniciamos la consulta SQL.
        sqlString += " where c.nombre='Brian' ";  // Concatenamos la condición para el nombre.
        sqlString += "and c.activo=1";  // Añadimos otra condición para el estado activo.
        System.out.println("sqlString = " + sqlString);  // Imprime la consulta SQL completa.

    }
}
