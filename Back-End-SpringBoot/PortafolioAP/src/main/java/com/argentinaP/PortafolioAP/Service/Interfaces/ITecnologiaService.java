package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {
    public List<Tecnologia> getTecnologia();
    
    public void saveTecnologia(Tecnologia tecnologia);
    
    public void deleteTecnologia(Integer id);
    
    public Tecnologia findTecnologia(Integer id);    
}
