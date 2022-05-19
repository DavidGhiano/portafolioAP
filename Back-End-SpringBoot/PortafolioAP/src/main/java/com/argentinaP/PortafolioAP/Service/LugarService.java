package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Lugar;
import com.argentinaP.PortafolioAP.Repository.LugarRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarService implements ILugarService {
    @Autowired
    private LugarRepository lugarRepo;

    @Override
    public List<Lugar> getLugares() {
        List<Lugar> lista = lugarRepo.findAll();
        return lista;
    }

    @Override
    public void saveLugar(Lugar lugar) {
        lugarRepo.save(lugar);
    }

    @Override
    public void deleteLugar(Integer id) {
        lugarRepo.deleteById(id);
    }

    @Override
    public Lugar findLugar(Integer id) {
        Lugar lugar = lugarRepo.findById(id).orElse(null);
        return lugar;
    }
}
