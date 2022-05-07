package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia,Integer>{
    
}
