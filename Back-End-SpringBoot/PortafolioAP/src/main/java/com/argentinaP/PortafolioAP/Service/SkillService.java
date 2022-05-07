package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepo;
}
