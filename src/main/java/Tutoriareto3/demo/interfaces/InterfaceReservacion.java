/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tutoriareto3.demo.interfaces;

import Tutoriareto3.demo.modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface InterfaceReservacion extends  CrudRepository<Reservacion, Integer> {
    
}
