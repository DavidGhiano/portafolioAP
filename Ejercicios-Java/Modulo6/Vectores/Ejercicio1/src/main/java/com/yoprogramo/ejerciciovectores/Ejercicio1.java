package com.yoprogramo.ejerciciovectores;

import java.util.Scanner;

public class Ejercicio1 {

    /*Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. 
    Realizar un programa que permita la carga por teclado de los 10 números solicitados.*/
    public static void main(String[] args) {
        int contador = 0;
        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Inserte números de 1 a 100---");
        do{
            System.out.println("Inserte numero "+ (contador+1) + ": ");
            vector[contador] = teclado.nextInt();
            if(vector[contador]>=1 && vector[contador]<=100){
                contador++;
            }else{
                System.out.println("Inserte un número de 1 a 100");
            }
        }while(contador < 10);
    }
    
}
