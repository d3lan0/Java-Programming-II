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
public class Flight {
    private Airplane plane;
    private Place departureAirport;
    private Place destinationAirport;
    
    public Flight(Airplane plane, Place departureAirport, Place destinationAirport ) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }
    
    public Airplane getAirplane(){
        return this.plane;
    }
    
    public Place getDepartureAirport() {
        return this.departureAirport;
    }
    
    public Place getDestinationAirport() {
        return this.destinationAirport;
    }
    
    @Override
    public String toString(){
        return this.plane.toString() + " (" + this.departureAirport+ "-" + this.destinationAirport + ")";
    }
}
