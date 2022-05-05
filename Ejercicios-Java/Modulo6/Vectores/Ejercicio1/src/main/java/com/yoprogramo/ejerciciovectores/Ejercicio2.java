package com.yoprogramo.ejerciciovectores;

import java.util.Scanner;

public class Ejercicio2 {

    /*En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
    Se desea un programa que sea capaz de determinar cuál es la mayor edad 
    y cuál es la menor edad que se encuentra entre los estudiantes.
    */
    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        int aux = 0;
        int contador = 0;
        int[] vector = new int[15];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las edades de los estudiantes");
        do{
            System.out.println("Inserte la edad del estudiante " + (contador+1));
            aux = teclado.nextInt();
            if(aux > 0){
                vector[contador] = aux;
                
                if(aux > vector[mayor]){
                    mayor = contador;
                }
                if(aux < vector[menor]){
                    menor = contador;
                }
                contador++;
            }else{
                System.out.println("Por favor, ingrese un número mayor de 0");
            }
            
        }while(contador<15);
        System.out.println("La edad mayor es: " + vector[mayor]);
        System.out.println("La edad menor es: " + vector[menor]);
    }
    
}
