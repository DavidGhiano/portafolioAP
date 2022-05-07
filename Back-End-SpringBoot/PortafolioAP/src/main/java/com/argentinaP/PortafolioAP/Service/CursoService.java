package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepo;
}
