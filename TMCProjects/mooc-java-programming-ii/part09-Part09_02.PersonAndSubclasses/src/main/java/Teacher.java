/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String address, int salaray){
        super(name, address);
        this.salary = salaray;
    }
    
    @Override
    public String toString(){
        return super.getName() + "\n  " + super.getAddress() + "\n  salary " + this.salary + " euro/month" ;
    }
}
