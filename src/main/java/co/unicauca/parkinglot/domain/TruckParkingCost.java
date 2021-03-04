/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public class TruckParkingCost implements IParkingCost{

    /**
     * 
     * Metodo implementado de la interfaz IParkingCost, que maneja la logica de calcular el costo del parking de un camion
     */
    
    @Override
    public long calculateCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        double duration = Duration.between(input,output).toHours();
        if(duration < 13){
           return 10000;
        }
        else if(duration < 25){
            return 15000;
        }
        duration = duration - 24;
        duration = ((duration * 15000) / 24) + 15000;
        duration = Math.ceil(duration/100)*100;
        return (long) duration;
    }
    
}
