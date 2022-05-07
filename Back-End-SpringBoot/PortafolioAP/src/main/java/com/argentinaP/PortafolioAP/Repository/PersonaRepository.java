package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    
}
