package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Curso;
import java.util.List;

public interface ICursoService {
    public List<Curso> getCurso();
    
    public void saveCurso (Curso curso);
    
    public void deleteCurso(Integer id);
    
    public Curso findCurso (Integer id);    
}
