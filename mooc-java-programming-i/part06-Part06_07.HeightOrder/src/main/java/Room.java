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
public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }
        
        Person shortest = people.get(0);
        for (Person person : people){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
        while(!people.isEmpty()){
            Person shortest = shortest();
            people.remove(shortest);
            return shortest;
        }
        return null;
    }
}
