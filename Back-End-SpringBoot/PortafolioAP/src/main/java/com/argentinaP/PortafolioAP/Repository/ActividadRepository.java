package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad,Integer> {
    
}
