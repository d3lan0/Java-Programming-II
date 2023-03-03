/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.Logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author theo.higgins
 */
public class FlightControl {
    public HashMap<String, Airplane> airplanes;
    public HashMap<String, Flight> flights;
    public Map<String, Place> places;
    
    public FlightControl() {
        this.airplanes = new HashMap();
        this.flights = new HashMap();
        this.places = new HashMap();
    }
    
    public void addAirplane(String id, int capacity) {
        Airplane plane = new Airplane(id, capacity);
        this.airplanes.put(id, plane);
    }
    
    public void addFlight(Airplane plane, String departureId, String destinationId) {
        this.places.putIfAbsent(departureId, new Place(departureId));
        this.places.putIfAbsent(destinationId, new Place(destinationId));
        
        Flight flight = new Flight(plane, this.places.get(departureId), this.places.get(destinationId));
        this.flights.put(flight.toString(), flight);
        
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id){
        return airplanes.get(id);
    }
}
