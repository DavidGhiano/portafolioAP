package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService {
    @Autowired
    private TecnologiaRepository tecnologiaRepo;
}
