package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Integer>{
    
}
