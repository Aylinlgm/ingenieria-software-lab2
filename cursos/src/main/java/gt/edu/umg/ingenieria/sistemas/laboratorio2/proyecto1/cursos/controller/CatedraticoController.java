/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.model.Catedratico;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.service.CatedraticoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aylin
 */
@RestController
@RequestMapping ("/catedratico")
public class CatedraticoController {
    
    @Autowired
    private CatedraticoService catedraticoService = new CatedraticoService();
    Catedratico catedratico = new Catedratico();
    
    @PostMapping("/registrar")
    public Catedratico create(@RequestBody(required = true) Catedratico newCatedratico){
        
        return this.catedraticoService.create(newCatedratico);
    }
    
    @GetMapping("/buscarTodos")
    public List<Catedratico> getAllEstudiantes(){
        return this.catedraticoService.getAllCatedraticos();
    }
   
    
}
