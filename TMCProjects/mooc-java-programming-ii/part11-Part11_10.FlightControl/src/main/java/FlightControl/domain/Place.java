/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author theo.higgins
 */
public class Place {
    private String place;
    
    public Place(String place) {
        this.place = place;
    }
    
    public String getPlace(){
        return this.place;
    }
    
    public String toString() {
        return this.place;
    }
}

