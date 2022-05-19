package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersonas();
    
    public void savePersona (Persona persona);
    
    public void deletePersona(Integer id);
    
    public Persona findPersona(Integer id);
    
}
