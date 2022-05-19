package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Academico;
import com.argentinaP.PortafolioAP.Repository.AcademicoRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.IAcademicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicoService implements IAcademicoService{
    @Autowired
    private AcademicoRepository academicoRepo;

    @Override
    public List<Academico> getAcademicos() {
        List<Academico> listaAcademico = academicoRepo.findAll();
        return listaAcademico;
    }

    @Override
    public void saveAcademico(Academico academico) {
        academicoRepo.save(academico);
    }

    @Override
    public void deleteAcademico(Integer id) {
        academicoRepo.deleteById(id);
    }

    @Override
    public Academico findAcademico(Integer id) {
        Academico academico = academicoRepo.findById(id).orElse(null);
        return academico;
    }
}
