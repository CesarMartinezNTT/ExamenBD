package com.example.ExamenBD.service;

import com.example.ExamenBD.entity.Curso;
import com.example.ExamenBD.repository.CursosRepository;
import com.example.ExamenBD.repository.CursosRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    CursosRepositoryDao cursosRepositoryDao;

    @Autowired
    CursosRepository cursosRepository;
    public void addCurso(Curso curso){
        cursosRepository.crearCurso(curso);
    }


}
