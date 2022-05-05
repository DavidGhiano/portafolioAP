package com.yoprogramo.restaurante.Controller;

import com.yoprogramo.restaurante.Model.Plato;
import com.yoprogramo.restaurante.Model.Platos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PlatoController {
    
    private Platos platos = new Platos();
    
    @GetMapping("/platos/{id}")
    public Plato obtenerPlatos(@PathVariable int id){
        for (Plato plato : platos.getListaPlatos()){
            if(plato.getId() == id){
                return plato;
            }
        }
        return null;
    }
    
    @GetMapping("/platos")
    @ResponseBody
    public List<Plato> obtenerAll(){
        return platos.getListaPlatos();
    }
    
    @PostMapping("/platos/agregar")
    public void cargarPlato(@RequestBody Plato plato){
        try{
            platos.setListaPlatos(plato);
            System.out.println(plato.getId());
            System.out.println(plato.getNombre());
            System.out.println(plato.getPrecio());
            System.out.println(plato.getDescripcion());

            System.out.println("Plato agregado con éxito");    
        }catch(Exception e){
            System.out.println("Hubo un error: " + e.getMessage());
        }
        
    }
}
