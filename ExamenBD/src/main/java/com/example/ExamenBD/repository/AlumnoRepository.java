package com.example.ExamenBD.repository;

import com.example.ExamenBD.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlumnoRepository {

    @Autowired

    com.example.ExamenBD.repository.AlumnoRepositoryDao alumnoRepositoryDao;

    public void creacionAlumno(Alumno alumno){alumnoRepositoryDao.save(alumno);}

    public static List<Alumno> getAll() {

        return (List<Alumno>) AlumnoRepository.getAll();
    }



    public static void deleteAlumno(Integer id){

        AlumnoRepository.deleteById(id);
    }

    private static void deleteById(Integer id) {
    }


    public static void updateAlumno(Alumno alumno) {
        AlumnoRepository.updateAlumno(alumno);
    }

}



