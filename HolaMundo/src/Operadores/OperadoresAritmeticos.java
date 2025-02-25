package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Definimos las variables enteras de forma compacta, asignando valores a i, j y sum.
        int i = 5, j = 4, sum = i + j;

// Imprimimos la suma de i y j
        System.out.println("sum = " + sum);  // Imprime "sum = 9"

// Imprimimos directamente la expresión de la suma y la concatenación
        System.out.println("i + j = " + i + j);  // Esto imprimirá "i + j = 54" (concatenación primero, operación después)

// Imprimimos primero la suma y luego la cadena.
        System.out.println(i + j + " i + j");  // Esto imprimirá "9 i + j" (la operación de suma se realiza antes de la concatenación de la cadena)

// Aseguramos que la operación se realice antes de la concatenación usando paréntesis.
        System.out.println("i + j = " + (i + j));  // Esto imprimirá "i + j = 9"

// Realizamos una operación de resta.
        int resta = i - j;
        System.out.println("resta = " + resta);  // Imprime "resta = 1"

// Para mostrar la resta de manera más explícita con paréntesis.
        System.out.println("(i - j) = " + (i - j));  // Imprime "(i - j) = 1"

// Realizamos una multiplicación.
        int multi = i * j;
        System.out.println("multiplicación = " + multi);  // Imprime "multiplicación = 20"

// Realizamos una división entera.
        int div = i / j;
        System.out.println("división = " + div);  // Imprime "división = 1" (ya que 5 / 4 es 1 con división entera)

// Realizamos una división con resultado decimal. Convertimos el resultado a tipo float para obtener decimales.
        float div2 = (float) i / j;
        System.out.println("división2 = " + div2);  // Imprime "división2 = 1.25"

// Realizamos una operación de módulo (resto de la división).
        int resto = i % j;
        System.out.println("resto = " + resto);  // Imprime "resto = 1" (resto de 5 dividido entre 4)

// Realizamos otro cálculo de módulo con diferentes valores.
        resto = 8 % 5;
        System.out.println("resto = " + resto);  // Imprime "resto = 3" (resto de 8 dividido entre 5)

// Usamos un cuadro de entrada para obtener un número del usuario y verificamos si es par o impar.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));  // Muestra un cuadro de diálogo para ingresar un número.
        if (numero % 2 == 0) {  // Verificamos si el número es par.
            System.out.println("numero par = " + numero);  // Imprime si el número es par.
        } else {  // Si no es par, es impar.
            System.out.println("numero impar = " + numero);  // Imprime si el número es impar.
        }

    }
}
