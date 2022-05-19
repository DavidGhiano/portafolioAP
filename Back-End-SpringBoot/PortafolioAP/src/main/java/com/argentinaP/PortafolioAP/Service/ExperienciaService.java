package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Experiencia;
import com.argentinaP.PortafolioAP.Repository.ExperienciaRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> getExperiencias() {
        List<Experiencia> listaExperiencia = experienciaRepo.findAll();
        return listaExperiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Integer id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Integer id) {
        Experiencia experiencia = experienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
}
