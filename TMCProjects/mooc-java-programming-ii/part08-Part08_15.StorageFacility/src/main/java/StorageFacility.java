
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.facility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storeageUnit, String item) {
        if(!this.facility.containsKey(storeageUnit)){
            return;
        }
        
        this.facility.get(storeageUnit).remove(item);

        if (this.facility.get(storeageUnit).size() == 0) {
            this.facility.remove(storeageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsInUse = new ArrayList<>();
        for (String unit : this.facility.keySet()) {
            if (this.facility.get(unit).size() > 0) {
                unitsInUse.add(unit);
            }
        }

        return unitsInUse;
    }

}
