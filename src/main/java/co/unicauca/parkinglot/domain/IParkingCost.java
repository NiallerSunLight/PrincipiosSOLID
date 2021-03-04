/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;

/**
 * Interfaz para calcular el costo del parqueadero de cualquier tipo de vehiculo
 * carro, moto, camion.
 * 
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public interface IParkingCost {
    
    long calculateCost(Vehicle veh, LocalDateTime input, LocalDateTime output);
    
}
