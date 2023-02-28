/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    private double maxHR(){
        return 206.3 -(0.711 * this.age);
    }
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMax){
        return ((this.maxHR() - this.restingHeartRate) * percentageOfMax) + this.restingHeartRate;
    }
}
