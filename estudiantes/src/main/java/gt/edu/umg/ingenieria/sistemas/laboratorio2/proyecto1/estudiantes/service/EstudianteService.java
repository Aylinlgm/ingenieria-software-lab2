/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.dao.EstudianteRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aylin
 */

@Service
public class EstudianteService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;
    
     public Estudiante createEstudiante(Estudiante estudiante){ 
        return this.estudianteRepository.save(estudiante);
        }
     
     public List<Estudiante> getAllEstudiantes() {
        return (List<Estudiante>) this.estudianteRepository.findAll();
    }
        
    
    
    
}
