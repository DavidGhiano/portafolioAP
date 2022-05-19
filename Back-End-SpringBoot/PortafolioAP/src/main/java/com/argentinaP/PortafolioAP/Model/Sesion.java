package com.argentinaP.PortafolioAP.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Sesion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idSesion;
    private String fecha;
}
