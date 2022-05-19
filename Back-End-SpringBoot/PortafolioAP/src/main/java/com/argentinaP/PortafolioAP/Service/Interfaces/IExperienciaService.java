package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> getExperiencias();
    
    public void saveExperiencia (Experiencia experiencia);
    
    public void deleteExperiencia(Integer id);
    
    public Experiencia findExperiencia (Integer id);    
}
