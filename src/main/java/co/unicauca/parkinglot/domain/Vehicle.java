/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;


/**
 *
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public class Vehicle {
    
    /**
    * Placa 
    */
    private String plate;
    
    /**
     * Tipo: Carro, moto, camion
     */
    private TypeEnum type;

    /**
     * Constructor parametrizado
     * @param plate
     * @param type 
     */
    public Vehicle(String plate, TypeEnum type) {
        this.plate = plate;
        this.type = type;
    }

    /**
     * Constructor por defecto
     */
    public Vehicle() {
    }

    /**
     * Setters and Getters
     * @return 
     */
    public String getPlate() {
        return plate;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * To string
     * @return 
     */
    @Override
    public String toString() {
        return "Vehicle{" + "plate=" + plate + ", type=" + type + '}';
    }
    
}
