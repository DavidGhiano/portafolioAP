package com.argentinaP.PortafolioAP.Controller;

import com.argentinaP.PortafolioAP.Model.Persona;
import com.argentinaP.PortafolioAP.Model.Skill;
import com.argentinaP.PortafolioAP.Model.Usuario;
import com.argentinaP.PortafolioAP.Service.Interfaces.IAcademicoService;
import com.argentinaP.PortafolioAP.Service.Interfaces.IActividadService;
import com.argentinaP.PortafolioAP.Service.Interfaces.ICursoService;
import com.argentinaP.PortafolioAP.Service.Interfaces.IExperienciaService;
import com.argentinaP.PortafolioAP.Service.Interfaces.ILugarService;
import com.argentinaP.PortafolioAP.Service.Interfaces.IPersonaService;
import com.argentinaP.PortafolioAP.Service.Interfaces.ISkillService;
import com.argentinaP.PortafolioAP.Service.Interfaces.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService iPersona;
    @Autowired
    private IAcademicoService iAcademico;
    @Autowired
    private IActividadService iActividad;
    @Autowired
    private ICursoService iCurso;
    @Autowired
    private IExperienciaService iExperiencia;
    @Autowired
    private ILugarService iLugar;
    @Autowired
    private IUsuarioService iUsuario;
    @Autowired
    private ISkillService iSkill;
    
    
    
    /* 
     * PERSONA 
     * ~ METODOS para la edición de la información de la persona ~
     */
    @GetMapping("/portafolio/personas/traer")
    public List<Persona> getPersonas(){
        return iPersona.getPersonas();
    }
    
    @GetMapping("/portafolio/personas/traer/{id}")
    public Persona getPersona(@PathVariable Integer id){
        return iPersona.findPersona(id);
    }
    
    @PostMapping("/portafolio/personas/crear")
    public String crearPersona(@RequestBody Persona persona){
        iPersona.savePersona(persona);
        return "Se guardó con éxito";
    }
    
    @DeleteMapping("/portafolio/personas/borrar/{id}")
    public String eliminarPersona(@PathVariable Integer id){
        iPersona.deletePersona(id);
        return "eliminado con éxito";
    }
    
    @PutMapping("/portafolio/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Integer id,
                                 @RequestBody Persona nueva
                                )
    {
        Persona persona = iPersona.findPersona(id);
        
        persona.setNombre(nueva.getNombre());
        persona.setApellido(nueva.getApellido());
        persona.setNombreCompleto(nueva.getNombre() + " " + nueva.getApellido());
        persona.setEmail(nueva.getEmail());
        persona.setCelular(nueva.getCelular());
        persona.setTitulo(nueva.getTitulo());
        persona.setUrlFacebook(nueva.getUrlFacebook());
        persona.setUrlTwitter(nueva.getUrlTwitter());
        persona.setUrlLinkedin(nueva.getUrlLinkedin());
        persona.setUrlGithub(nueva.getUrlGithub());
        persona.setUrlWeb(nueva.getUrlWeb());
        
        iPersona.savePersona(persona);
        
        return persona;
    }
    
    /* se asocia un USUARIO a una PERSONA */
    
    @PutMapping("/portafolio/personas/editar/{id}/usuario/{idUsuario}")
    public Persona setPersonaUsuario(
                                    @PathVariable Integer id,
                                    @PathVariable Integer idUsuario
                                ){
        Persona persona = iPersona.findPersona(id);
        Usuario usuario = iUsuario.findUsuario(idUsuario);
        persona.setUsuario(usuario);
        
        iPersona.savePersona(persona);
        
        return persona;
    }
    
    
    // CRUD de SKIL
    @PutMapping("/portafolio/personas/editar/{id}/skill/agregar")
    public Persona agregarPersonaSkill( @PathVariable Integer id )
    {
        Persona persona = iPersona.findPersona(id);
        Skill skill = iSkill.getUltimoSkill();
        
        List<Skill> listaSkill = persona.getSkills();
        listaSkill.add(skill);
        
        iPersona.savePersona(persona);
        return persona;
    }
    
    @PutMapping("/portafolio/personas/editar/{id}/skill/editar/{idSkill}")
    public Persona editarPersonaSkill( 
                                        @PathVariable Integer id, 
                                        @PathVariable Integer idSkill, 
                                        @RequestBody Skill nSkill)
    {
        Persona persona = iPersona.findPersona(id);
        Skill skill = iSkill.findSkill(idSkill);
        
        List<Skill> listaSkill = persona.getSkills();
        
        listaSkill.remove(skill);
        
        skill.setNombre(nSkill.getNombre());
        skill.setPorcentaje(nSkill.getPorcentaje());
        if(nSkill.getUrlIcono() != "") skill.setUrlIcono(nSkill.getUrlIcono());
        
        
        listaSkill.add(skill);
        
        iPersona.savePersona(persona);
        return persona;
    }
    
    @PutMapping("/portafolio/personas/editar/{id}/skill/eliminar/{idSkill}")
    public Persona eliminarPersonaSkill( @PathVariable Integer id, @PathVariable Integer idSkill )
    {
        Persona persona = iPersona.findPersona(id);
        Skill skill = iSkill.findSkill(idSkill);
        
        List<Skill> listaSkill = persona.getSkills();
        listaSkill.remove(skill);
        
        iSkill.deleteSkill(idSkill);
        
        iPersona.savePersona(persona);
        return persona;
    }
    
    
}
