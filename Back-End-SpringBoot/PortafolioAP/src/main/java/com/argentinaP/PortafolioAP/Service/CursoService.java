package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Curso;
import com.argentinaP.PortafolioAP.Repository.CursoRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private CursoRepository cursoRepo;

    @Override
    public List<Curso> getCurso() {
        List<Curso> listaCurso = cursoRepo.findAll();
        return listaCurso;
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public void deleteCurso(Integer id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso findCurso(Integer id) {
        Curso curso = cursoRepo.findById(id).orElse(null);
        return curso;
    }
}
