package com.example.ExamenBD.repository;


import com.example.ExamenBD.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CursosRepository{

    @Autowired
    CursosRepositoryDao cursosRepositoryDao;

    public void crearCurso(Curso curso){
        cursosRepositoryDao.save(curso);
    }

}
