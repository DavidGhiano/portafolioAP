package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepo;
}
