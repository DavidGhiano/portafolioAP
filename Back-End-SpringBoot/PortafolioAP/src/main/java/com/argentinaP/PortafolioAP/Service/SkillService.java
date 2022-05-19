package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Skill;
import com.argentinaP.PortafolioAP.Repository.SkillRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    @Autowired
    private SkillRepository skillRepo;

    @Override
    public List<Skill> getSkills() {
        List<Skill> lista = skillRepo.findAll();
        return lista;
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Integer id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill findSkill(Integer id) {
        Skill skill = skillRepo.findById(id).orElse(null);
        return skill;
    }

    @Override
    public Skill getUltimoSkill() {
        List<Skill> lista = skillRepo.getUltimoSkill();
        Skill skill = lista.get(0);
        return skill;
    }

    
}
