package com.yoprogramo.Colegio.Service;

import com.yoprogramo.Colegio.Model.Curso;
import java.util.List;

public interface ICursoService {
    public void saveCurso(Curso curso);
    
    public Curso getCurso(Long id);
    
    public List<Curso> getCursos();
    
    public void deleteCurso(Long id);
    
    public List<Curso> getCursoSearch(String nombre);
    
}
