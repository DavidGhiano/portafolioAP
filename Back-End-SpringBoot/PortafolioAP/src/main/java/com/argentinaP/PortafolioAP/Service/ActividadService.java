package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Actividad;
import com.argentinaP.PortafolioAP.Repository.ActividadRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.IActividadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService implements IActividadService {
    @Autowired
    private ActividadRepository actividadRepo;

    @Override
    public List<Actividad> getActividad() {
        List<Actividad> listaActividad = actividadRepo.findAll();
        return listaActividad;
    }

    @Override
    public void saveActividad(Actividad actividad) {
        actividadRepo.save(actividad);
    }

    @Override
    public void deleteActividad(Integer id) {
        actividadRepo.deleteById(id);
    }

    @Override
    public Actividad findActividad(Integer id) {
        Actividad actividad = actividadRepo.findById(id).orElse(null);
        return actividad;
    }
}
