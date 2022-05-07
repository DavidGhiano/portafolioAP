package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Academico;
import java.util.List;

public interface IAcademicoService {
    public List<Academico> getAcademicos();
    
    public void saveAcademico (Academico academico);
    
    public void deleteAcademico(Integer id);
    
    public Academico findAcademico (Integer id);
}
