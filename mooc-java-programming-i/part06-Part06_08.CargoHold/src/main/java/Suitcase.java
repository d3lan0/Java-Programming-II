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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if (this.totalWeight() + item.getWeight() <= maxWeight){    
        this.items.add(item);
        }
    }
    
    public void printItems(){
        if(items.isEmpty()){
            return;
        }
        for (Item item: items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        if(!items.isEmpty()){
            int totalWeight = 0;
            for (Item item: items){
                totalWeight += item.getWeight();
            }
            return totalWeight;
        }
        return 0;
    }
    
    public Item heaviestItem(){
        if(!items.isEmpty()){
            Item heaviest = items.get(0);
         for(Item item : items){
             if(item.getWeight() > heaviest.getWeight()){
                 heaviest = item;
             }
         }
         return heaviest;
        }
        return null; 
    }
    
    public String toString(){
        if(items.isEmpty()){
            return "no items (" + this.totalWeight() + " kg)";
        }
        
        if(items.size() == 1){
            return items.size() + " item (" + this.totalWeight() + "kg)";
        }
        
        return items.size() + " items (" + this.totalWeight() + "kg)";
    }
}
