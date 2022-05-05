package com.yoprogramo.Colegio.Service;

import com.yoprogramo.Colegio.Model.Tema;
import java.util.List;

public interface ITemaService {
    public void saveTema(Tema tema);
    
    public Tema getTema(Long id);
    
    public List<Tema> getTemas();
    
    public void deleteTema(Long id);
    
}
