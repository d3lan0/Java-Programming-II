/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Book implements Packable {
    
    private String name;
    private String author;
    private double weight;
    
    public Book(String name, String author, double weight){
        this.name = name; 
        this.author = author;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.name + ": " + this.author;
    }
    
    
}
