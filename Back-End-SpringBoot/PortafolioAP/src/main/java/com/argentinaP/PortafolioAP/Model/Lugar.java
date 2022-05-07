package com.argentinaP.PortafolioAP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Lugar {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idLugar;
    private String ciudad;
    private String provincia;
    private String pais;
}
