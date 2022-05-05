package com.yoprogramo.bazar.Service;

import com.yoprogramo.bazar.Model.Producto;
import com.yoprogramo.bazar.Repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private ProductoRepository prodRepository;

    @Override
    public List<Producto> getProductos() {
        List<Producto> listaProductos = prodRepository.findAll();
        return listaProductos;
    }
    @Override
    public Producto getProducto(Long id){
        Producto producto = prodRepository.findById(id).orElse(null);
        return producto;
    }

    @Override
    public void saveProducto(Producto producto) {
        prodRepository.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        this.prodRepository.deleteById(id);
    }

    @Override
    public Producto findProducto(Long id) {
        Producto producto = this.prodRepository.findById(id).orElse(null);
        return producto;
    }

    @Override
    public List<Producto> maxPrecio() {
        List<Producto> producto = this.prodRepository.maxPrecio();
        return producto;
    }

    @Override
    public List<Producto> minPrecio() {
        List<Producto> producto = this.prodRepository.minPrecio();
        return producto;
    }

    @Override
    public List<Producto> getProductosOrderAsc() {
        List<Producto> listaProducto = this.prodRepository.baratoToCaro();
        return listaProducto;
    }
    
    @Override
    public List<Producto> getProductosOrderDesc() {
        List<Producto> listaProducto = this.prodRepository.caroToBarato();
        return listaProducto;
    }

    
}
