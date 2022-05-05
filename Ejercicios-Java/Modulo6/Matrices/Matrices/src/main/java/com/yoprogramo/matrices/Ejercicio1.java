package com.yoprogramo.matrices;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[][] jugadores = new int[5][3];
        Scanner teclado = new Scanner(System.in);
        float[] promedio = new float[5];
        float resultado = 0.0f;
        int suma = 0;
        
        for(int i=0;i<5;i++){
            System.out.println("---Jugador " + (i+1) + " ---");
            for(int j=0;j<3;j++){
                System.out.println("Goles en el partido numero " + (j+1));
                jugadores[i][j] = teclado.nextInt();
                suma = suma + jugadores[i][j];
            }
            resultado = ((float)suma/3);
            promedio[i] = resultado;
            suma = 0;
        }
        
        for(int i= 0; i<5; i++){
            System.out.println("* El promedio del jugador " + (i+1) + " es: " + promedio[i]);
        }
    }
    
}
