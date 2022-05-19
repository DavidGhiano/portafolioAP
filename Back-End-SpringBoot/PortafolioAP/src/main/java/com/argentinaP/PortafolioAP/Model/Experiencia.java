package com.argentinaP.PortafolioAP.Model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idExperiencia;
    private String nombre;
    private String posicion;
    private String jornada;
    private String urlExperiencia;
    private String comienzo;
    private String finalizado;
    @OneToOne
    private Lugar lugar;
    @OneToMany
    private List<Actividad> actividades;
}
