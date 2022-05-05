package com.yoprogramo.Colegio.Service;

import com.yoprogramo.Colegio.Model.Curso;
import com.yoprogramo.Colegio.Repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository cursoRepository;
    
    @Override
    public void saveCurso(Curso curso) {
        this.cursoRepository.save(curso);
    }

    @Override
    public Curso getCurso(Long id) {
        Curso curso = this.cursoRepository.findById(id).orElse(null);
        return curso;
    }

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCurso = this.cursoRepository.findAll();
        return listaCurso;
    }

    @Override
    public void deleteCurso(Long id) {
        this.cursoRepository.deleteById(id);
    }

    @Override
    public List<Curso> getCursoSearch(String nombre) {
        List<Curso> listaCurso = this.cursoRepository.getCursoSearch(nombre);
        return listaCurso;
    }
    
}
