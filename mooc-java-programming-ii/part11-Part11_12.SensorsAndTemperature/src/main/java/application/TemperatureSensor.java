/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author theo.higgins
 */
public class TemperatureSensor implements Sensor {
        private boolean state;
        private int reading;
        
    public TemperatureSensor(){
        this.state = false;
    }
    
    public int getReading(){
        return this.reading;
    }

    @Override
    public boolean isOn() {
        if(this.state){
            return true;
        }
         return false;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if(!this.state){
            throw new IllegalStateException("The sensor is off");
        }
        
        this.reading = new Random().nextInt(61)-30;
        return this.reading;
    }
    
}
