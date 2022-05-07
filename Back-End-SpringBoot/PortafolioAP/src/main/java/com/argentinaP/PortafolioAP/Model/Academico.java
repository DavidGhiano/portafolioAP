package com.argentinaP.PortafolioAP.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
        @Entity
public class Academico {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idAcademico;
    private String nombre;
    private String titulo;
    private String urlCarrera;
    private String estado;
    @OneToOne
    private Lugar lugar;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date comienzo;
    @Column(nullable=true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date finalizado = null;
    
}
