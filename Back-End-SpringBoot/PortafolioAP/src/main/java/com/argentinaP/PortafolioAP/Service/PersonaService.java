package com.argentinaP.PortafolioAP.Service;

import com.argentinaP.PortafolioAP.Model.Persona;
import com.argentinaP.PortafolioAP.Repository.PersonaRepository;
import com.argentinaP.PortafolioAP.Service.Interfaces.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository personaRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Integer id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Integer id) {
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
}
