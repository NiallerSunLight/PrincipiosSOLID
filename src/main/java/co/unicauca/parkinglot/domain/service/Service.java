/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain.service;

import co.unicauca.parkinglot.access.IVehicleRepository;
import co.unicauca.parkinglot.domain.IParkingCost;
import co.unicauca.parkinglot.domain.ParkingCostFactory;
import co.unicauca.parkinglot.domain.Vehicle;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public class Service {
    
    private IVehicleRepository repository;

    //constructor parametrizado
    public Service(IVehicleRepository repository) {
        this.repository = repository;
    }
    
    public long calculateParkingCost(Vehicle vehicle, LocalDateTime input, LocalDateTime output){
        long resul = 0;
        if (vehicle == null ) {
            return 0;
        } 
        // La fábrica devuelve una instancia de la jerarquia IDelivery  
        IParkingCost delivery = ParkingCostFactory.getInstance().getDelivery(vehicle.getType());
        resul= delivery.calculateCost(vehicle, input, output);  
        return resul;
    }
    
    public boolean saveVehicle(Vehicle vehicle){
        //Validate product
        if (vehicle == null || vehicle.getPlate().isEmpty()) {
            return false;
        }

        repository.save(vehicle);
        return true;
    }
    
    public List<Vehicle> listVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles = repository.list();

        return vehicles;
    }
    
}
