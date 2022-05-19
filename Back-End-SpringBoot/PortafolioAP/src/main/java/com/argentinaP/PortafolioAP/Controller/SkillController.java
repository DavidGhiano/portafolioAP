package com.argentinaP.PortafolioAP.Controller;

import com.argentinaP.PortafolioAP.Model.Skill;
import com.argentinaP.PortafolioAP.Service.Interfaces.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    @Autowired
    private ISkillService iSkill;
            
    
    @GetMapping("/portafolio/skill/traer")
    public List<Skill> getSkills(){
        return iSkill.getSkills();
    }
    
    @GetMapping("/portafolio/skill/traer/ultimo")
    public Skill getSkillId(){
        Skill skill = iSkill.getUltimoSkill();
        return skill;
    }
    
    @PostMapping("/portafolio/skill/crear")
    public String crearSkill(@RequestBody Skill skill){
        iSkill.saveSkill(skill);
        return "Se guardó con éxito";
    }
}
