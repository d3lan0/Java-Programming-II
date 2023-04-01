/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Book {
    private String name;
    private int pages;
    private int pubYear;
    
    public Book(String name, int pages, int pubYear){
        this.name = name;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.pubYear;
    }
}
