package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Proyecto;
import com.argentinaP.PortafolioAP.Repository.ProyectoRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService
{
    @Autowired
    private ProyectoRepository proyectoRepo;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> lista = proyectoRepo.findAll();
        return lista;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Integer id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Integer id) {
        Proyecto proyecto = proyectoRepo.findById(id).orElse(null);
        return proyecto;
    }
}
