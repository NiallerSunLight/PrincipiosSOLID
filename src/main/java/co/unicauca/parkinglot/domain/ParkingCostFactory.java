/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.util.EnumMap;
import java.util.Map;

/**
 * Fabrica que utiliza patron singleton para generar una instacia de la interfaz IParkingCost
 *
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public class ParkingCostFactory {
    
    private Map<TypeEnum, IParkingCost> vehicleDictionary;

    private static ParkingCostFactory instance;

    /**
     * Constructor por defecto utilizando el patron Singleton
     */
    
    private ParkingCostFactory() {
        vehicleDictionary = new EnumMap<>(TypeEnum.class);
        vehicleDictionary.put(TypeEnum.CAR, new CarParkingCost());
        vehicleDictionary.put(TypeEnum.MOTO, new MotoParkingCost());
        vehicleDictionary.put(TypeEnum.TRUCK, new TruckParkingCost());
    }

    /**
     * Devuelve la instancia de la clase
     *
     * @return instancia unica de la la fábrica
     */
    public static ParkingCostFactory getInstance() {
        if (instance == null) {
            instance = new ParkingCostFactory();
        }
        return instance;
    }

    /**
     * Para un pais determina la clase que se encarga de calcular el costo del
     * envío.
     *
     * @param country
     * @return
     */
    public IParkingCost getDelivery(TypeEnum vehicle) {

        IParkingCost result = null;

        if (vehicleDictionary.containsKey(vehicle)) {
            result = vehicleDictionary.get(vehicle);
        }

        return result;
    }
    
}
