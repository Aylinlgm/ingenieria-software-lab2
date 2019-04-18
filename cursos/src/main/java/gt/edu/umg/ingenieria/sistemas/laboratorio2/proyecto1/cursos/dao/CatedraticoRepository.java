/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.model.Catedratico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aylin
 */
@Repository
public interface CatedraticoRepository extends CrudRepository<Catedratico, Long>{
    
    //public Catedratico findClientByNit(String nit);

}

