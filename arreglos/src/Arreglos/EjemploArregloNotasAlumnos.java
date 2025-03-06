package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMate, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMate = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMate.length; i++) {
            claseMate[i] = sc.nextDouble();
        }
        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = sc.nextDouble();
        }
        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = sc.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMate[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematica = (sumNotasMatematicas / claseMate.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje / claseLenguaje.length);
        double promedioTotal = (promedioHistoria + promedioHistoria + promedioLenguaje) / 3;
        System.out.println("Promedio clases matemáticas: " + promedioMatematica);
        System.out.println("Promedio clases historia: " + promedioHistoria);
        System.out.println("Promedio clases Lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " + promedioTotal);

        System.out.println("Ingrese el identificador del alumno (de 0 - 6 ): ");
        int id = sc.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMate[id])/3;
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
    }
}
