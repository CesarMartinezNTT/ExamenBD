package com.example.ExamenBD.repository;

import com.example.ExamenBD.entity.Curso;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CursosRepositoryDao extends CrudRepository<Curso, String> {


}
