package com.example.ExamenBD.service;

import com.example.ExamenBD.entity.Alumno;
import com.example.ExamenBD.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository AlumnoRepo;

    public void AddAlumno(Alumno alumno){
        AlumnoRepo.creacionAlumno(alumno);
    }

    public List<Alumno> getListAlumno() {
        return AlumnoRepository.getAll();
    }
    public List<Alumno> getAlumnos() {
        return null;
    }
    public void deleteAlumno(Integer id) {

        AlumnoRepository.deleteAlumno(id);
    }
    public void updateAlumno(Alumno alumno) {
        AlumnoRepository.updateAlumno(alumno);
    }
}
