package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public void crearAuto(Auto auto){
        control.crearAuto(auto);
    }
    
    public void eliminarAuto(int id){
        control.eliminarAuto(id);
    }
    
    public void eliminarAuto(Auto auto){
        control.eliminarAuto(auto);
    }
    
    public List<Auto> traerAutos(){
        return control.traerAutos();
    }
}
