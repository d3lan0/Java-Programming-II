/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    protected String getName(){
        return this.name;
    }
    
    protected String getAddress(){
        return this.address;
    }
    
    public String toString(){
        return this.name + "\n  " + this.address;
    }
    
}
