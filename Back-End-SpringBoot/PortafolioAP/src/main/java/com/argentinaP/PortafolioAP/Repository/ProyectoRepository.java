package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
    
}
