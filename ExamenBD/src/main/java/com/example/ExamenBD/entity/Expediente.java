package com.example.ExamenBD.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expediente")
@Getter @Setter
public class Expediente {

    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "curso")
    private List<Contenido> contenidos;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date fechaIns;
    private Date fechafin;
    private int calificacion;
    private Curso curso;

    public Expediente(List<Contenido> contenidos, Date fechaIns, Date fechafin, int calificacion, Curso curso) {
        this.contenidos = contenidos;
        this.fechaIns = fechaIns;
        this.fechafin = fechafin;
        this.calificacion = calificacion;
        this.curso = curso;
    }
    public Expediente(){

    }
}
