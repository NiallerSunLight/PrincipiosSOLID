/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.access;

/**
 *
 * Carlos Enrique Hoyos
 * Jesus Edwin Adrada
 */
public class RepositoryFactory {
    
    private static RepositoryFactory instance;
    
    //Constructor por defecto
    private RepositoryFactory(){
        
    }
    
    /**
     * Patron singleton
     */
    
    public static RepositoryFactory getInstance() {

        if (instance == null) {
            instance = new RepositoryFactory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IVehicleRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IVehicleRepository
     */
    public IVehicleRepository getRepository(String type) {

        IVehicleRepository result = null;

        switch (type) {
            case "default":
                //Revisar la parte result
                result = (IVehicleRepository) new VehicleRepository();
                break;
        }

        return result;

    }
}
    
