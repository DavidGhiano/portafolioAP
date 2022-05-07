package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Integer> {
    
}
