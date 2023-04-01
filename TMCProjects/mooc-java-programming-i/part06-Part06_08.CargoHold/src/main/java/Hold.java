import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Hold {
    private ArrayList<Suitcase> cargoHold;
    private int maximumWeight;
    
    private int getCurrentWeight(){
        int currentWeight = 0;
        if (!cargoHold.isEmpty()){
            for(Suitcase suitcase : cargoHold){
                currentWeight += suitcase.totalWeight();
            }
        }
        return currentWeight;
    }
    
    public Hold(int maximumWeight){
        this.cargoHold = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(getCurrentWeight() + suitcase.totalWeight() <= this.maximumWeight){
           cargoHold.add(suitcase);
        }
    }
    
    public void printItems(){
        if(!cargoHold.isEmpty()){
            for(Suitcase suitcase : cargoHold){
                suitcase.printItems();
            }
        }
    }
    
    public String toString(){
        return cargoHold.size() + " suitcases (" + getCurrentWeight() + " kg)";
    }
    
    
    
}
