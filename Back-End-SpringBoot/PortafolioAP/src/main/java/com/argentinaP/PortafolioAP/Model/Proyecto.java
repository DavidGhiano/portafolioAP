package com.argentinaP.PortafolioAP.Model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idProyecto;
    private String nombre;
    private String url;
    private String descripcion;
    @OneToMany
    private List<Tecnologia> tecnologias;
}
