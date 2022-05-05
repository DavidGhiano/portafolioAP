package com.yoprogramo.fecha.Controller;

import java.util.Calendar;
import org.springframework.web.bind.annotation.*;

@RestController
public class EdadController {
    
    @GetMapping("/edad/{dia}/{mes}/{anio}")
    public String validacion(@PathVariable int dia,
                               @PathVariable int mes,
                               @PathVariable int anio){
        if(mes >= 1 && mes <= 12){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(validarDia(dia,31)){
                    return "La edad es: " + calcularEdad(dia,mes,anio) + " años.";
                }
                return "Día no valido para el mes seleccionado";
            }
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
                if(validarDia(dia,30)){
                    return "La edad es: " + calcularEdad(dia,mes,anio) + " años.";
                }
                return "Día no valido para el mes seleccionado";

            }
            if(mes == 2){
                int diaB = 28;
                if((anio % 4) == 0) diaB = 29;
                if(validarDia(dia,diaB)){
                    return "La edad es: " + calcularEdad(dia,mes,anio) + " años.";
                }
                return "Día no valido para el mes seleccionado";
            }
        }
        return "Mes fuera del rango";       
    }
    
    
    public boolean validarDia(int dia, int cantidad){
        if(dia >= 1 && dia <= cantidad){
            return true;
        }
        return false;
    }
    public int calcularEdad(int dia,
                            int mes,
                            int anio){
        Calendar fechaActual = Calendar.getInstance();
        int diaActual = fechaActual.get(Calendar.DATE);
        int mesActual = fechaActual.get(Calendar.MONTH)+1;
        int anioActual = fechaActual.get(Calendar.YEAR);
        
        int edad = anioActual - anio -1;
        
        if(mesActual == mes){
            if( diaActual >= dia) edad++;
        }else if(mesActual > mes) edad++;
        return edad;


    }
}
