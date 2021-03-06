package com.yoprogramo.bazar.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Producto {
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String nombre;
    private Double precio;
    private int stock;
}
