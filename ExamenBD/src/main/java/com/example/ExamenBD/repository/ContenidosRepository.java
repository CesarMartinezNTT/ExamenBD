package com.example.ExamenBD.repository;

import com.example.ExamenBD.entity.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContenidosRepository {

    @Autowired
    ContenidosRepositoryDao contenidosRepositoryDao;

    public void crearContenido(Contenido contenido){
        contenidosRepositoryDao.save(contenido);
    }



}
