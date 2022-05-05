package com.yoprogramo.bazar.Service;

import com.yoprogramo.bazar.Model.Producto;
import java.util.List;

public interface IProductoService {

    public List<Producto> getProductos();
    
    public Producto getProducto(Long id);
    
    public void saveProducto(Producto producto);
    
    public void deleteProducto(Long id);
    
    public Producto findProducto (Long id);
    
    public List<Producto> maxPrecio();
    
    public List<Producto> minPrecio();
    
    public List<Producto> getProductosOrderAsc();
    
    public List<Producto> getProductosOrderDesc();

    
}
