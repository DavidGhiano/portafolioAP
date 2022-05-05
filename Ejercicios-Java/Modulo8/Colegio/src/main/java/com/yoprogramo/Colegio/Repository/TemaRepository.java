package com.yoprogramo.Colegio.Repository;

import com.yoprogramo.Colegio.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema,Long> {
    
}
