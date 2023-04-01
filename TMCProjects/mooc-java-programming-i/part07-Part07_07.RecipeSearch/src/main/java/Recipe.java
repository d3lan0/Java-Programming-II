
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
public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime){
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList();
    }
    
    public void addIngredients(String ingredient){
            ingredients.add(ingredient); 
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public String getName(){
        return this.name;
    }
    
   public int getCookTime(){
       return this.cookTime;
   }
    
    
    
}
