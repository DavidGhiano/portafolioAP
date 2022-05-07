package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Academico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicoRepository extends JpaRepository<Academico, Integer> {
    
}
