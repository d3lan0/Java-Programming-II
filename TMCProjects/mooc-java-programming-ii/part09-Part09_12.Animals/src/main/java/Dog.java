/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Dog  extends Animal implements NoiseCapable{
    
    public Dog(String name) {
        super(name);
    }
    
    public Dog(){
        super("Dog");
    }
    
    public void bark(){
        System.out.println(this + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
