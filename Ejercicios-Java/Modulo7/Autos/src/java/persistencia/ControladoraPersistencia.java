package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Auto;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    private AutoJpaController autoJps = new AutoJpaController();

    public ControladoraPersistencia() {
    }
    
    public void crearAuto(Auto auto){
        autoJps.create(auto);
    }
    
    public void eliminarAuto(int id){
        try {
            autoJps.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAuto(Auto auto){
        try {
            autoJps.destroy(auto.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Auto> traerAutos(){
        return autoJps.findAutoEntities();
    }
}
