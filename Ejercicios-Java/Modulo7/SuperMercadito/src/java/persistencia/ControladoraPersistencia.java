/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import logica.Producto;

/**
 *
 * @author dg260
 */
public class ControladoraPersistencia {
    
    private ProductoJpaController prodJpa = new ProductoJpaController();

    public ControladoraPersistencia() {
    }
    
    public void crearProducto(Producto producto){
        prodJpa.create(producto);
    }
    
    public List<Producto> traerProductos(){
        return prodJpa.findProductoEntities();
    }
}
