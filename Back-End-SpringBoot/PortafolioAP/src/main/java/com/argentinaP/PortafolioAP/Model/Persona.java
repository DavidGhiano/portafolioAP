package com.argentinaP.PortafolioAP.Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String nombreCompleto;
    private String email;
    private String celular;
    private String titulo;
    private String urlFoto;
    private String urlPortada;
    private String descripction;
    private String urlFacebook;
    private String urlTwitter;
    private String urlLinkedin;
    private String urlGithub;
    private String urlWeb;
    @OneToOne
    private Lugar lugar;
    @OneToOne
    private Usuario usuario;
    @OneToMany
    private List<Skill> skills;
    @OneToMany
    private List<Proyecto> proyectos;
    @OneToMany
    private List<Curso> cursos;
    @OneToMany
    private List<Experiencia> experiencias;
    @OneToMany
    private List<Academico> academicos;
}
