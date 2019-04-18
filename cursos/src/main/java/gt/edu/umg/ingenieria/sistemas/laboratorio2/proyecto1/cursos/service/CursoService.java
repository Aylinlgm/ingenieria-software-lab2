/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.dao.CursoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aylin
 */
@Service
public class CursoService {
    
    @Autowired    
    private CursoRepository cursoRespository; 
    
    public Curso create(Curso curso){
        return this.cursoRespository.save(curso);
    }
    
    public List<Curso> getAllCursos(){
        return (List<Curso>) this.cursoRespository.findAll();
    }
    
    
    
}
