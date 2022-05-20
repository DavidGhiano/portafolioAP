package com.argentinaP.PortafolioAP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
    private String urlLogo;
    private String estado;
    @OneToOne
    private Lugar lugar;
    private String comienzo;
    private String finalizado;
    
}
