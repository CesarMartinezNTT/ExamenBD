package com.example.ExamenBD.controller;

import com.example.ExamenBD.entity.Curso;
import com.example.ExamenBD.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursosController {

    @Autowired
    private CursoService cursoService;

    //Creacion del Curso
    @PostMapping
    public ResponseEntity<Curso> addCurso(@RequestBody Curso curso) {
        System.out.println("Solicitud realizada con exito");
        cursoService.addCurso(curso);
        return ResponseEntity.ok(curso);
    }


}
