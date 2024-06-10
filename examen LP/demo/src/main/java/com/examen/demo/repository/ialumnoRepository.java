package com.examen.demo.repository;


import com.examen.demo.model.alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ialumnoRepository extends JpaRepository<alumno, Integer> {
}


