package com.argentinaP.PortafolioAP.Service.Interfaces;

import com.argentinaP.PortafolioAP.Model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> getSkills();
    
    public void saveSkill(Skill skill);
    
    public void deleteSkill(Integer id);
    
    public Skill findSkill(Integer id);
    
    public Skill getUltimoSkill();
}
