package com.examen.demo.services;


import java.util.List;


public interface ialumnoServices {


    List<alumno> GetAllalumno();
    alumno Savealumno(alumno entity);
    alumno FindalumnoById(int id);
    alumno Updatealumno(alumno entity);
    void Deletealumno(Integer id);




}


