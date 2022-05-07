package com.argentinaP.PortafolioAP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idSkill;
    private String nombre;
    private String tipo;
    private Integer porcentaje;
    private String urlIcono;
}
