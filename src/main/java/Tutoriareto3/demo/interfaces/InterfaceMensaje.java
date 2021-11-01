/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tutoriareto3.demo.interfaces;

import Tutoriareto3.demo.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface InterfaceMensaje extends  CrudRepository<Mensaje, Integer> {
    
}
