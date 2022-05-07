package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarService {
    @Autowired
    private LugarRepository lugarRepo;
}
