package com.example.ExamenBD.service;

import com.example.ExamenBD.entity.Contenido;
import com.example.ExamenBD.repository.ContenidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContenidosService {

    @Autowired
    ContenidosRepository contenidosRepository;

    public void addContenido(Contenido contenido){
        contenidosRepository.crearContenido(contenido);
    }

}
