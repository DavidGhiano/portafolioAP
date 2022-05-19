package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> getProyecto();
    
    public void saveProyecto (Proyecto proyecto);
    
    public void deleteProyecto(Integer id);
    
    public Proyecto findProyecto (Integer id);    
}
