package com.examen.demo.rest;




import com.examen.demo.services.ialumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class alumnoController {


    ialumnoServices alumnoServices;


    @Autowired
    public alumnoController(IalumnoServices alumnoServices){
        this.alumnoServices=alumnoServices;
    }


    @GetMapping("/alumno")
    public List<alumno> getAll(){
        return alumnoServices.GetAllalumno();
    }


    @PostMapping("/alumno")
    public alumno savealumno(@RequestBody alumno entity){
        return alumnoServices.Savealumno(entity);
    }


    @GetMapping("/alumno/{id}")
    public alumno getAll(@PathVariable int id){
        return alumnoServices.FindalumnoById(id);
    }

    @PutMapping("/alumno")
    public alumno updatealumno(@RequestBody alumno entity){
        return alumnoServices.Updatealumno(entity);
    }



    @DeleteMapping("/alumno/{id}")
    public void Deletealumno(@PathVariable Integer id){
        alumnoServices.Deletealumno(id);
    }


}


