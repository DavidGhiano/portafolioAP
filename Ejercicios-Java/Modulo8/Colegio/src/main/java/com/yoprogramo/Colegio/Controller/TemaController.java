package com.yoprogramo.Colegio.Controller;

import com.yoprogramo.Colegio.Model.Tema;
import com.yoprogramo.Colegio.Service.ITemaService;
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
public class TemaController {
    @Autowired
    private ITemaService iTema;
    
    @PostMapping("/tema/crear")
    public String createTema(@RequestBody Tema tema){
        iTema.saveTema(tema);
        return "Tema agregado con éxito";
    }
    @GetMapping("/tema/traer")
    public List<Tema> getTemas(){
        List<Tema> listaTema = iTema.getTemas();
        return listaTema;
    }
    @GetMapping("/tema/traer/{id}")
    public Tema getTema(@PathVariable Long id){
        return iTema.getTema(id);
    }
    @PutMapping("/tema/editar/{id}")
    public String editTema(@PathVariable Long id,
                           @RequestParam("nombre") String nombre,
                           @RequestParam("descripcion") String descripcion){
        Tema tema = iTema.getTema(id);
        tema.setNombre(nombre);
        tema.setDescripcion(descripcion);
        
        iTema.saveTema(tema);
        return "Tema editado con éxito";
    }
    
    @DeleteMapping("/tema/eliminar/{id}")
    public String deleteTema(@PathVariable Long id){
        iTema.deleteTema(id);
        return "El tema fue eliminado correctamente";
    }
}
