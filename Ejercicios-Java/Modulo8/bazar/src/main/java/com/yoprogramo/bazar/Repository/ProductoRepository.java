package com.yoprogramo.bazar.Repository;

import com.yoprogramo.bazar.Model.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {
    
    @Query(value= "SELECT * FROM producto WHERE precio = (SELECT max(precio) FROM producto)", nativeQuery = true)
    List<Producto> maxPrecio();
    
    @Query(value= "SELECT * FROM producto WHERE precio = (SELECT min(precio) FROM producto)", nativeQuery = true)
    List<Producto> minPrecio();
    
    @Query(value= "SELECT * FROM producto order by precio asc", nativeQuery = true)
    List<Producto> baratoToCaro();
    
    @Query(value= "SELECT * FROM producto order by precio desc", nativeQuery = true)
    List<Producto> caroToBarato();
}
