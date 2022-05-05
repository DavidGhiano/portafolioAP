package com.yoprogramo.bazar.Controller;

import com.yoprogramo.bazar.Model.Producto;
import com.yoprogramo.bazar.Service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService iProducto;
    
    @GetMapping("/productos/traer")
    public List<Producto> getProductos(){
        return iProducto.getProductos();
    }
    
    @GetMapping("/productos/traer/{id}")
    public Producto getProducto(@PathVariable Long id){
        return iProducto.getProducto(id);
    }
    @PostMapping("/productos/crear")
    public String createProducto(@RequestBody Producto producto){
        iProducto.saveProducto(producto);
        return "El producto fue creado con éxito";
    }
    
     @DeleteMapping("/productos/eliminar/{id}")
     public String deleteProducto(@PathVariable Long id){
         iProducto.deleteProducto(id);
         return "El producto fue eliminado correctamente";
     }
     
     @PutMapping("/productos/editar/{id}")
     public Producto editProducto(@PathVariable Long id,
                                  @RequestParam ("nombre") String nuevoNombre,
                                  @RequestParam ("precio") Double nuevoPrecio,
                                  @RequestParam ("stock") int nuevoStock){
         Producto producto = iProducto.findProducto(id);
         producto.setNombre(nuevoNombre);
         producto.setPrecio(nuevoPrecio);
         producto.setStock(nuevoStock);
         
         iProducto.saveProducto(producto);
         return producto;
     }
     
     @GetMapping("/productos/traer/mayor")
     public List<Producto> traerMayorPrecio(){
         List<Producto> producto = iProducto.maxPrecio();
         return producto;
     }
     @GetMapping("/productos/traer/menor")
     public List<Producto> traerMenorPrecio(){
         List<Producto> producto = iProducto.minPrecio();
         return producto;
     }
     
     @GetMapping("/productos/traer/order/asc")
     public List<Producto> traerOrdenadoAsc(){
         List<Producto> listaProducto = iProducto.getProductosOrderAsc();
         return listaProducto;
     }
     
     @GetMapping("/productos/traer/order/desc")
     public List<Producto> traerOrdenadoDesc(){
         List<Producto> listaProducto = iProducto.getProductosOrderDesc();
         return listaProducto;
     }

}
