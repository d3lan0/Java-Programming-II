
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author theo.higgins
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return null;
        }

        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licnesePlate) {
        if (!this.registry.containsKey(licnesePlate)) {
            return false;
        }

        this.registry.remove(licnesePlate);
        return true;
    }

    public void printLicensePlates() {
        ArrayList<String> plates= new ArrayList<>();
        
        for(LicensePlate licensePlate : this.registry.keySet()){
            plates.add(licensePlate.toString());
        }
        
        for(String plate : plates){
            System.out.println(plate);
        }
        
    }
    
    public void printOwners(){
        ArrayList<String>owners = new ArrayList<>();
        
        for(String owner : this.registry.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        
        for(String owner: owners){
            System.out.println(owner);
        }
    }
}
