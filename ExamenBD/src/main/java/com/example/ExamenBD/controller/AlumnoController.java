package com.example.ExamenBD.controller;

import com.example.ExamenBD.entity.Alumno;
import com.example.ExamenBD.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @PostMapping("/add")
    public ResponseEntity<Alumno> addStudent(@RequestBody Alumno student) {
        System.out.println("Se hizo la solicitud");
        service.AddAlumno(student);
        return ResponseEntity.ok(student);

    }
    @GetMapping
    public List<Alumno> getAlumnos()

    {
        return  service.getListAlumno();
    }

    @DeleteMapping("/delete")
    public void deleteALumno(@PathVariable("id") Integer id){
        System.out.println("Se hizo la solicitud");
        service.deleteAlumno(id);

    }

    @PutMapping("/update")
    public ResponseEntity<Alumno> updateAlumno(@RequestBody Alumno alumno)
    {
        System.out.println("Se hizo la solicitud");
        service.updateAlumno(alumno);

        return ResponseEntity.ok(alumno);
    }

}
