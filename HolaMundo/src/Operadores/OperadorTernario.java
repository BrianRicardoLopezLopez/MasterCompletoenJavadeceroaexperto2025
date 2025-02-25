package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condición ? si es verdadero: si es falso
        // Primer uso del operador ternario para evaluar una condición
        String variable = 7 == 7 ? "Si es verdadero" : "Si es falso";
        // Se evalúa si 7 es igual a 7 (es verdadero), entonces "Si es verdadero" se asigna a la variable
        System.out.println("variable = " + variable);

        // Segundo uso del operador ternario
        String variable2 = 7 == 5 ? "Si es verdadero" : "Si es falso";
        // Se evalúa si 7 es igual a 5 (es falso), entonces "Si es falso" se asigna a la variable2
        System.out.println("variable = " + variable2);

        // Declaramos el estado como una cadena vacía
        String estado = "";
        double promedio = 6.2;  // Promedio de un estudiante
        double promedio2 = 5.2; // Otro promedio para comparación

        // Usamos el operador ternario para decidir si el estudiante aprobó o fue rechazado
        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        // Aquí, el promedio (6.2) es mayor que 5.49, por lo que "Aprobado" se asigna a estado
        System.out.println("estado = " + estado);

        // Comprobamos el estado para el segundo promedio
        estado = promedio2 >= 5.49 ? "Aprobado" : "Rechazado";
        // El promedio2 (5.2) es menor que 5.49, por lo que "Rechazado" se asigna a estado
        System.out.println("estado = " + estado);

        // Declaración de un nuevo promedio que será calculado
        double promedio3 = 0.0;

        // Declaramos las variables de las materias
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        // Creamos un objeto Scanner para recibir la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario las notas para cada materia
        System.out.println("Ingresa la nota de matemáticas entre 2.0 - 7.0: ");
        matematicas = sc.nextDouble(); // Asignamos la entrada del usuario a la variable matematicas

        System.out.println("Ingresa la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = sc.nextDouble(); // Asignamos la entrada del usuario a la variable ciencias

        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0: ");
        historia = sc.nextDouble(); // Asignamos la entrada del usuario a la variable historia

        // Calculamos el promedio de las tres materias
        promedio3 = (matematicas + ciencias + historia) / 3;

        // Mostramos el promedio calculado
        System.out.println("promedio3 = " + promedio3);

        // Usamos nuevamente el operador ternario para decidir el estado (Aprobado o Rechazado) basado en el promedio
        estado = promedio3 >= 5.49 ? "Aprobado" : "Rechazado";
        // Si el promedio es mayor o igual a 5.49, asignamos "Aprobado"; de lo contrario, "Rechazado"
        System.out.println("estado = " + estado);


        // es lo mismo péro con más línea de código
       /* if (promedio >= 5.49){
            estado = "Aprobrado";
        }else {
            estado = "Rechazado";
        }*/
    }
}
