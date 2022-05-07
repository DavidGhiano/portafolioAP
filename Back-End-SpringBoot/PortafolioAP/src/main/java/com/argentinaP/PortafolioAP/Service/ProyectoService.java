package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepo;
}
