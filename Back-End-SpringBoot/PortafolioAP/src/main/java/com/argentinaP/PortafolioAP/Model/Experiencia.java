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
    private String posicion;
    private String jornada;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date comienzo;
    @Column(nullable=true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date finalizado;
    @OneToOne
    private Lugar lugar;
    @OneToMany
    private List<Actividad> actividades;
}
