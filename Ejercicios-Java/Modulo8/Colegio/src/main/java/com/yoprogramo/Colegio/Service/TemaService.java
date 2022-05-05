package com.yoprogramo.Colegio.Service;

import com.yoprogramo.Colegio.Model.Tema;
import com.yoprogramo.Colegio.Repository.TemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{

    @Autowired
    private TemaRepository temaRepository;
    
    @Override
    public void saveTema(Tema tema) {
        this.temaRepository.save(tema);
    }

    @Override
    public Tema getTema(Long id) {
        Tema tema = this.temaRepository.findById(id).orElse(null);
        return tema;
    }

    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTema = this.temaRepository.findAll();
        return listaTema;
    }

    @Override
    public void deleteTema(Long id) {
        this.temaRepository.deleteById(id);
    }
    
}
