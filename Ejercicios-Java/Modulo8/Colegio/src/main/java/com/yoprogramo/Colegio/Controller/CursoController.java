package com.yoprogramo.Colegio.Controller;

import com.yoprogramo.Colegio.Model.Curso;
import com.yoprogramo.Colegio.Model.Tema;
import com.yoprogramo.Colegio.Service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private ICursoService iCurso;
    
    @PostMapping("/curso/crear")
    public String createCurso(@RequestBody Curso curso){
        iCurso.saveCurso(curso);
        return "Curso creado con éxito";
    }
    
    @GetMapping("/curso/traer")
    public List<Curso> getCursos(){
        List<Curso> listaCurso = iCurso.getCursos();
        return listaCurso;    
    }
    
    //Obtener todos los temas de un determinado curso
    @GetMapping("/curso/traer/{id}/tema")
    public List<Tema> getCursoTema(@PathVariable Long id){
        Curso curso = iCurso.getCurso(id);
        List<Tema> listaTema = curso.getListaTema();
        return listaTema;
    }
    //Obtener todos los cursos que contengan como nombre la palabra Java (puede contener otras palabras)
    @GetMapping("/curso/search")
    public List<Curso> getCursoSearch(@RequestParam String nombre){
        List<Curso> listaCurso = iCurso.getCursoSearch(nombre);
        return listaCurso;
    }
    
    @PutMapping("/curso/editar/{id}")
    public String editCurso(@PathVariable Long id,
                            @RequestBody Curso cur){
        Curso curso = iCurso.getCurso(id);
        curso.setNombre(cur.getNombre());
        curso.setTipo_curso(cur.getTipo_curso());
        curso.setFecha_finalizacion(cur.getFecha_finalizacion());
        curso.setListaTema(cur.getListaTema());
        
        iCurso.saveCurso(curso);
        return "Curso editado con éxito";
    }
}
