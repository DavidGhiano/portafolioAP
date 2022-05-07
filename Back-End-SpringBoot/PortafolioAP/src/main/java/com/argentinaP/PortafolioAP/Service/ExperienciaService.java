package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    @Autowired
    private ExperienciaRepository experienciaRepo;
}
