/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.model.Curso;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/cursos")
public class CursoController {
    
    @Autowired
    private CursoService cursoService = new CursoService();
    Curso curso = new Curso();
    
    
    @PostMapping("/crear")
    public Curso create(@RequestBody(required = true) Curso newCurso)
    {
        return this.cursoService.create(newCurso);
    }
    
    @GetMapping("/buscarTodos")
    public List<Curso> getAllCursos(){
        return this.cursoService.getAllCursos();
    }
    
    
    
}
