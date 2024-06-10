package com.examen.demo.services.impl;




import com.examen.demo.repository.ialumnoRepository;
import com.examen.demo.services.ialumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class alumnoServices implements ialumnoServices {


    ialumnoRepository _alumnoRepository;


    @Autowired
    public alumnoServices( ialumnoRepository alumnoRepository){
        _alumnoRepository = alumnoRepository;
    }




    @Override
    public List<alumno> GetAllalumno() {
        return _alumnoRepository.findAll();
    }


    @Override
    public alumno Savealumno(alumno entity) {
        alumno alumnoSaved = _alumnoRepository.save(entity);
        return alumnoSaved;
    }


    @Override
    public alumno FindalumnoById(int id) {
        Optional<alumno> rowInDB = _alumnoRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new alumno();
    }


    @Override
    public alumno Updatealumno(alumno entity) {
        alumno alumnoUbdate = _alumnoRepository.save(entity);
        return  alumnoUbdate;
    }


    @Override
    public void Deletealumno(Integer id) {
        _alumnoRepository.deleteById(id);
    }

}
