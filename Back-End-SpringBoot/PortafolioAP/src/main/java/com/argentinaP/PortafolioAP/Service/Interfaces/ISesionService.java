package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Sesion;
import java.util.List;

public interface ISesionService {
    public List<Sesion> getSesiones();
    
    public void saveSesion (Sesion sesion);
    
    public void deleteSesion(Integer id);
    
    public Sesion findSesion(Integer id);    
}
