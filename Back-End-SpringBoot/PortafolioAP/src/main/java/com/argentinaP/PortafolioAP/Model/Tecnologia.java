package com.argentinaP.PortafolioAP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idTecnologia;
    private String nombre;
}
