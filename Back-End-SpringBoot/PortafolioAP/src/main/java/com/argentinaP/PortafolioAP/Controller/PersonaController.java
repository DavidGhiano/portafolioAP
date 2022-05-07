package com.argentinaP.PortafolioAP.Controller;

import com.argentinaP.PortafolioAP.Model.Persona;
import com.argentinaP.PortafolioAP.Service.Interfaces.IPersonaService;
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
    public Persona editarPersona(
                                    @PathVariable Integer id,
                                    @RequestParam ("nombre") String nuevoNombre,
                                    @RequestParam ("apellido") String nuevoApellido,
                                    @RequestParam ("urlFacebook") String nuevoFacebook
                                )
    {
        Persona persona = iPersona.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setUrlFacebook(nuevoFacebook);
        
        iPersona.savePersona(persona);
        
        return persona;
    }
}
