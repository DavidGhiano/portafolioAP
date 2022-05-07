package com.argentinaP.PortafolioAP.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idCurso;
    private String nombre;
    private String dictadoPor;
    private String urlCertificado;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date comienzo;
    
    @Column(nullable=true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date finalizado;
    
}
