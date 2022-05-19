package com.argentinaP.PortafolioAP.Controller;

import com.argentinaP.PortafolioAP.Model.Usuario;
import com.argentinaP.PortafolioAP.Service.Interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService iUsuario;
    
    @PostMapping("/portafolio/usuario/crear")
    public String crearUsuario(@RequestBody Usuario usuario){
        iUsuario.saveUsuario(usuario);
        return "Se guardó con éxito";
    }
    
    @GetMapping("/portafolio/usuario/traer/{id}")
    public Usuario getUsuario(@PathVariable Integer id){
        return iUsuario.findUsuario(id);
    }
}
