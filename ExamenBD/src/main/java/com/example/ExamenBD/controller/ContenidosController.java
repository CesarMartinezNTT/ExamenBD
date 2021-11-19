package com.example.ExamenBD.controller;

import com.example.ExamenBD.entity.Contenido;
import com.example.ExamenBD.service.ContenidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContenidosController {

    @Autowired
    private ContenidosService contenidosService;

    //Creacion del contenido
    @PostMapping
    public ResponseEntity<Contenido> addContenido(@RequestBody Contenido contenido) {
        System.out.println("Se hizo la solicitud");
        contenidosService.addContenido(contenido);
        return ResponseEntity.ok(contenido);
    }
}
