package com.yoprogramo.ejerciciovectores;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de 
    las 23 provincias argentinas en el último mes.
    A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas 
    más altas para poder mostrar en la pantalla de su programa, 
    para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, 
    determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
    */
    public static void main(String[] args) {
        int[] masAltas = new int[5];
        int[] index = new int[5];
        int aux = 0;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        
        //Ingresamos las temperaturas y las provincias
        String[] provincias = CargarProvincias();
        int[] temperaturas = CargarTemperaturas();
        
        //Iniciamos el vector masAltas en 0
        for(int i= 0; i<5; i++){
            masAltas[i] = 0;
            index[i] = 0;
        }
        //Recorremos las temperaturas y guardamos las más altas
        for(int i = 0; i<23; i++){
            if(temperaturas[i] > masAltas[0]){
                masAltas[4] = masAltas[3];
                index[4]=index[3];
                masAltas[3] = masAltas[2];
                index[3]=index[2];
                masAltas[2] = masAltas[1];
                index[2]=index[1];
                masAltas[1] = masAltas[0];
                index[1]=index[0];                
                masAltas[0] = temperaturas[i];
                index[0]=i;
            }else if(temperaturas[i] > masAltas[1]){
                masAltas[4] = masAltas[3];
                index[4]=index[3];
                masAltas[3] = masAltas[2];
                index[3]=index[2];
                masAltas[2] = masAltas[1];
                index[2]=index[1];
                masAltas[1] = temperaturas[i];
                index[1]=i;
            }else if(temperaturas[i] > masAltas[2]){
                masAltas[4] = masAltas[3];
                index[4]=index[3];
                masAltas[3] = masAltas[2];
                index[3]=index[2];
                masAltas[2] = temperaturas[i];
                index[2]=i;
            }else if(temperaturas[i] > masAltas[3]){
                masAltas[4] = masAltas[3];
                index[4]=index[3];
                masAltas[3] = temperaturas[i];
                index[3]=i;
            }else if(temperaturas[i] > masAltas[4]){
                masAltas[4] = temperaturas[i];
                index[4]=i;
            }
        }
        for(int i = 0; i<5 ; i++){
            System.out.println(masAltas[i] + "° en " + provincias[index[i]]);
        }
        
    }
    
    public static String[] CargarProvincias(){
        String[] provincias = new String[23];
        provincias[0] = "Buenos Aires";
        provincias[1] = "Catamarca";
        provincias[2] = "Chaco";
        provincias[3] = "Chubut";
        provincias[4] = "Córdoba";
        provincias[5] = "Corrientes";
        provincias[6] = "Entre Rios";
        provincias[7] = "Formosa";
        provincias[8] = "Jujuy";
        provincias[9] = "La Pampa";
        provincias[10] = "La Rioja";
        provincias[11] = "Mendoza";
        provincias[12] = "Misiones";
        provincias[13] = "Neuquén";
        provincias[14] = "Rio Negro";
        provincias[15] = "Salta";
        provincias[16] = "San Juan";
        provincias[17] = "San Luis";
        provincias[18] = "Santa Cruz";
        provincias[19] = "Santa Fe";
        provincias[20] = "Santiago del Estero";
        provincias[21] = "Tierra de Fuego";
        provincias[22] = "Tucumán";
        
        return provincias;
    }
    
    public static int[] CargarTemperaturas(){
        int[] temperaturas = new int[23];
        temperaturas[0] = 16;
        temperaturas[1] = 18;
        temperaturas[2] = 27;
        temperaturas[3] = 6;
        temperaturas[4] = 14;
        temperaturas[5] = 27;
        temperaturas[6] = 17;
        temperaturas[7] = 28;
        temperaturas[8] = 19;
        temperaturas[9] = 10;
        temperaturas[10] = 18;
        temperaturas[11] = 12;
        temperaturas[12] = 26;
        temperaturas[13] = 6;
        temperaturas[14] = 9;
        temperaturas[15] = 11;
        temperaturas[16] = 13;
        temperaturas[17] = 12;
        temperaturas[18] = 3;
        temperaturas[19] = 16;
        temperaturas[20] = 22;
        temperaturas[21] = 3;
        temperaturas[22] = 18;
        
        return temperaturas;
    } 
    
}
