package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        // Inicializamos una variable 'max' que almacenará el valor más grande
        int max = 0;

        // Creamos un objeto Scanner para recibir los números desde la consola
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese 4 números
        System.out.println("Ingresa un número");
        int num1 = sc.nextInt();  // Captura el primer número

        System.out.println("Ingresa un segundo número");
        int num2 = sc.nextInt();  // Captura el segundo número

        System.out.println("Ingresa un tercer número");
        int num3 = sc.nextInt();  // Captura el tercer número

        System.out.println("Ingresa un cuarto número");
        int num4 = sc.nextInt();  // Captura el cuarto número

        // Usamos el operador ternario para comparar el primer par de números (num1 y num2)
        // Si num1 es mayor que num2, 'max' toma el valor de num1, si no, toma el valor de num2
        max = (num1 > num2) ? num1 : num2;

        // Comparamos el valor de 'max' con el tercer número (num3) y actualizamos 'max' si es necesario
        max = (max > num3) ? max : num3;

        // Comparamos el valor de 'max' con el cuarto número (num4) y actualizamos 'max' si es necesario
        max = (max > num4) ? max : num4;

        // diferente manera y la que más ocupamos es el if y else
        /*
        // Comparación entre num1 y num2
        if (num1 > num2) {  // Si num1 es mayor que num2
            max = num1;  // Entonces max toma el valor de num1
        } else {  // Si no
            max = num2;  // max toma el valor de num2
        }

        // Comparación entre max y num3
        if (max > num3) {  // Si max es mayor que num3
            max = max;  // No cambiamos el valor de max
        } else {  // Si no
            max = num3;  // max toma el valor de num3
        }

        // Comparación entre max y num4
        if (max > num4) {  // Si max es mayor que num4
            max = max;  // No cambiamos el valor de max
        } else {  // Si no
            max = num4;  // max toma el valor de num4
        }
         */

        // Imprimimos los cuatro números ingresados
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // Finalmente, imprimimos el valor máximo entre los cuatro números
        System.out.println("el número mayor es = " + max);



    }
}
