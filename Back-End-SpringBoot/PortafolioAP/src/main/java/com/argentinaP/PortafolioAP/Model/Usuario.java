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
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idUsuario;
    private String usuario;
    private String password;
    private String token;
    @OneToMany
    private List<Sesion> sesiones;
}
