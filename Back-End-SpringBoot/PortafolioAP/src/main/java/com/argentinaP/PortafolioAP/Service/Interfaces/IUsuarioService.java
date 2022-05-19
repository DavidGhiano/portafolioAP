package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<Usuario> getUsuario();
    
    public void saveUsuario (Usuario usuario);
    
    //public void deleteUsuario(Integer id);
    
    public Usuario findUsuario(Integer id);
}
