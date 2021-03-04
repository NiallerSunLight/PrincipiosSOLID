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
public class MotoParkingCost implements IParkingCost{
    
    /**
     * 
     * Metodo implementado de la interfaz IParkingCost, que maneja la logica de calcular el costo del parking de una moto
     */

    @Override
    public long calculateCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        double duration = Duration.between(input,output).toMinutes();
        if(duration < 61){
           return 1000;
        }
        duration = duration - 60;
        duration = ((duration * 500) / 60) + 1000;
        duration = Math.ceil(duration/100)*100;
        return (long) duration;
    }
    
}
