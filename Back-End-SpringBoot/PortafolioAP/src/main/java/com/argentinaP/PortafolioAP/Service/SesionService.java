package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionService {
    @Autowired
    private SesionRepository sesionRepo;
}
