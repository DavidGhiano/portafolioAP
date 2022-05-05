package com.yoprogramo.Colegio.Repository;

import com.yoprogramo.Colegio.Model.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository <Curso, Long>{
    
    @Query(value = "Select * from curso where nombre LIKE %:nombre%", nativeQuery = true)
    List<Curso> getCursoSearch(@Param("nombre") String nombre);
    
}
