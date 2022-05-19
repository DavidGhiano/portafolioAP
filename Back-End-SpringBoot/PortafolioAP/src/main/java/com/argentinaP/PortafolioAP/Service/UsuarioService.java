package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Usuario;
import com.argentinaP.PortafolioAP.Repository.UsuarioRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public Usuario findUsuario(Integer id) {
        Usuario usuario = usuarioRepo.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> listaUsuario = usuarioRepo.findAll();
        return listaUsuario;
    }
}
