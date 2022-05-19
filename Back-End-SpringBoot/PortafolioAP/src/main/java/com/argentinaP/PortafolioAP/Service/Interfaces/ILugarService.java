package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Lugar;
import java.util.List;

public interface ILugarService {
    public List<Lugar> getLugares();
    
    public void saveLugar (Lugar lugar);
    
    public void deleteLugar(Integer id);
    
    public Lugar findLugar(Integer id);    
}
