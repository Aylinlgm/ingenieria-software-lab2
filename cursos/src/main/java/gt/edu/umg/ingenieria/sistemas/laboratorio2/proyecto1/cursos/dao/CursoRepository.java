/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.cursos.model.Curso;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author aylin
 */
public interface CursoRepository extends CrudRepository<Curso, Long>{
    
    //public Client findClientByNit(String nit);
}
