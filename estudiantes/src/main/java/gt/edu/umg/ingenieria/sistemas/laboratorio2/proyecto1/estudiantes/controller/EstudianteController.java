/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.model.Estudiante;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
     @Autowired
    private EstudianteService estudianteService;
    Estudiante estudiante  = new Estudiante();

    @PostMapping("/registrar")
    public Estudiante create(@RequestBody(required = true) Estudiante newEstudiante){
        
        return this.estudianteService.createEstudiante(newEstudiante);
    }
    
  
    @GetMapping("/buscarTodos")
    public List<Estudiante> findAllEstudiantes() {
    return this.estudianteService.getAllEstudiantes();
    }
    
}
