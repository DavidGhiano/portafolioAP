package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {
    @Autowired
    private ActividadRepository actividadRepo;
}
