package com.example.ExamenBD.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Datos")

public class Curso {
    List<Contenido> contenidosList;
}