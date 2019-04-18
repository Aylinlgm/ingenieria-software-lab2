/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.proyecto1.estudiantes.model.Estudiante;
import org.springframework.data.repository.CrudRepository;


public interface EstudianteRepository extends CrudRepository<Estudiante, Long>{
    
    //public Client findClientByNit(String nit);
    
}
