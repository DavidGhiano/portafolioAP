package com.yoprogramo.ejerciciovectores;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    Se tienen tres vectores. 
    En el primero de ellos se guarda un número de dni, 
    en el segundo un nombre 
    y en el tercero un apellido. 
    Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla. 
    Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, es decir, los datos contenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.
    */
    public static void main(String[] args) {
        int cantidad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos de personas a ingresar: ");
        cantidad = teclado.nextInt();
        int[] dni = new int[cantidad];
        String[] nombre = new String[cantidad];
        String[] apellido = new String[cantidad];
        for(int i = 0; i<cantidad;i++){
            System.out.println("--- Persona " + (i+1) + " ---");
            System.out.println("Ingrese DNI");
            dni[i] = teclado.nextInt();
            System.out.println("Ingrese NOMBRE");
            nombre[i] = teclado.next();
            System.out.println("Ingrese APELLIDO");
            apellido[i] = teclado.next();
        }
        for(int i=0; i<cantidad;i++){
            System.out.println(nombre[i] + " " + apellido[i].toUpperCase() + " - DNI: " + dni[i]);
        }
        
    }
    
}
