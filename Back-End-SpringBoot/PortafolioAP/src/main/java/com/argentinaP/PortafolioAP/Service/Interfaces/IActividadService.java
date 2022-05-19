package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Actividad;
import java.util.List;

public interface IActividadService {
    public List<Actividad> getActividad();
    
    public void saveActividad (Actividad actividad);
    
    public void deleteActividad(Integer id);
    
    public Actividad findActividad (Integer id);
}
