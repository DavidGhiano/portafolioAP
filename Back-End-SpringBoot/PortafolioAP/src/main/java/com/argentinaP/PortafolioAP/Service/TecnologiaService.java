package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Tecnologia;
import com.argentinaP.PortafolioAP.Repository.TecnologiaRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {
    @Autowired
    private TecnologiaRepository tecnologiaRepo;

    @Override
    public List<Tecnologia> getTecnologia() {
        List<Tecnologia> lista = tecnologiaRepo.findAll();
        return lista;
    }

    @Override
    public void saveTecnologia(Tecnologia tecnologia) {
        tecnologiaRepo.save(tecnologia);
    }

    @Override
    public void deleteTecnologia(Integer id) {
        tecnologiaRepo.deleteById(id);
    }

    @Override
    public Tecnologia findTecnologia(Integer id) {
        Tecnologia tecnologia = tecnologiaRepo.findById(id).orElse(null);
        return tecnologia;
    }
}
