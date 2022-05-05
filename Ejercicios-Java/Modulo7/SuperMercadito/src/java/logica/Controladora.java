/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author dg260
 */
public class Controladora {
    private ControladoraPersistencia control = new ControladoraPersistencia();
    
    public void crearProducto(Producto prod){
        control.crearProducto(prod);
    }
    
    public List<Producto> traerProductos(){
        return control.traerProductos();
    }
}
