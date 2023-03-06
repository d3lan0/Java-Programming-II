/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author theo.higgins
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        if(sensors.isEmpty()){
            throw new IllegalStateException("There are no sensors");
        }
        
        boolean on = true;
        for(Sensor sensor: sensors){
            if (!sensor.isOn()){
                on = false;
            }
        }
        
        return on;
    }
   
    @Override
    public void setOn() {
        if(sensors.isEmpty()){
            throw new IllegalStateException("There are no sensors");
        }
        
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        
        if(sensors.isEmpty()){
            throw new IllegalStateException("There are no sensors");
        }
        
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if(sensors.isEmpty()){
            throw new IllegalStateException("There are no sensors");
        }
        
        double average = sensors.stream()
                .mapToInt(sensor -> sensor.read())
                .average().getAsDouble();
        
        readings.add((int) Math.round(average));
        
        return  (int) Math.round(average);
    }
    
    public List<Integer> readings() {
      return this.readings;
    }
    
}
