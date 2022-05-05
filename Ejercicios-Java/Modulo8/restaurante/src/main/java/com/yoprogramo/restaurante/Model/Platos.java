package com.yoprogramo.restaurante.Model;

import java.util.ArrayList;
import java.util.List;

public class Platos {
    private List<Plato> listaPlatos = new ArrayList<Plato>();

    public Platos() {
        inicializarLista();
    }

    public void setListaPlatos(Plato plato) {
        this.listaPlatos.add(plato);
    }

    public List<Plato> getListaPlatos(){
        return this.listaPlatos;
    }
    
    
    public List<Plato> inicializarLista() {
        
        listaPlatos.add(new Plato(1,"Milanesa de carne", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(2,"Milanesa de pollo", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(3,"Milanesa de soja", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(4,"Papa fritas chicas", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(5,"Papa fritas medianas", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(6,"Papa fritas grandes", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(7,"Papa fritas con chedal", 3.50f,"Milanesa de carne"));
        listaPlatos.add(new Plato(8,"agua", 3.50f,"Milanesa de carne"));
        
        
        return listaPlatos;
    }
    
    
}
