package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Sesion;
import com.argentinaP.PortafolioAP.Repository.SesionRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.ISesionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionService implements ISesionService{
    @Autowired
    private SesionRepository sesionRepo;

    @Override
    public List<Sesion> getSesiones() {
        List<Sesion> lista = sesionRepo.findAll();
        return lista;
    }

    @Override
    public void saveSesion(Sesion sesion) {
        sesionRepo.save(sesion);
    }

    @Override
    public void deleteSesion(Integer id) {
        sesionRepo.deleteById(id);
    }

    @Override
    public Sesion findSesion(Integer id) {
        Sesion sesion = sesionRepo.findById(id).orElse(null);
        return sesion;
    }
}
