package com.yoprogramo.matrices;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int cantAlumno = 10;
        double[][] alumnos = new double[cantAlumno][4];
        double suma = 0.0d;
        Scanner teclado = new Scanner(System.in);
        
        for(int i= 0; i<cantAlumno; i++){
            System.out.println("*** Alumno " + (i+1) + " ***");
            for(int j = 0; j<3; j++){
                System.out.println("Ingrese la nota " + (j+1));
                alumnos[i][j] = teclado.nextDouble();
                suma = suma + alumnos[i][j];
            }
            alumnos[i][3] = (suma/3);
            suma = 0.0;
        }
        
        for(int i = 0; i<cantAlumno; i++){
            System.out.println("--- NOTAS y PROMEDIO del Alumno " + (i+1) + " ---");
            for(int j = 0; j<3; j++){
                System.out.println("Nota " + (j+1) + ": " + alumnos[i][j]);
            }
            System.out.println("Promedio: " + alumnos[i][3]);
        }
    }
    
}
