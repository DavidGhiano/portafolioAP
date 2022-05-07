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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveAcademico(Academico academico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAcademico(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Academico findAcademico(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
