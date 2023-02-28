/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Gauge {
    private int value = 0;
    
    public Gauge(){
    }
    
    public void increase(){
        if(this.value < 5){
            this.value++;
        }      
    }
    
    public void decrease(){
        if(this.value > 0){
            this.value--;
        }
    }
    
    public int value(){
        return value;
    }
    
    public boolean full(){
        return this.value == 5;
    }
}
