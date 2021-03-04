/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;

/**
 *
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public interface IVehicleRepository {
    
    /**
     * Metodos que implementan la interfaz para realizar la conexion con la base de datos
     * @return 
     */
    boolean save(Vehicle newVehicle);
    
    List<Vehicle> list();
    
}
