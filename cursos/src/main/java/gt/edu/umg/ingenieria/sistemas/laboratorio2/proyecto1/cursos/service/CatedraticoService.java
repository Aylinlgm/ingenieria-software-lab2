/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.dao.CatedraticoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.model.Catedratico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aylin
 */
@Service
public class CatedraticoService {
    
    
    @Autowired
    private  CatedraticoRepository catedraticoRepository;
    
    public Catedratico create (Catedratico catedratico)
    {
        return this.catedraticoRepository.save(catedratico);
    }
    
    public List<Catedratico> getAllCatedraticos(){
        return (List<Catedratico>) this.catedraticoRepository.findAll();
    }
            
    
}
