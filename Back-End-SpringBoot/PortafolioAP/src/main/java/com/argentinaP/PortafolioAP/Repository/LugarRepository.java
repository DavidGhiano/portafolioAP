package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarRepository extends JpaRepository<Lugar, Integer> {
    
}
