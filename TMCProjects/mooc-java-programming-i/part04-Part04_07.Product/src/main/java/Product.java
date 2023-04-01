/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Product {
    private double price;
    private int qauntity;
    private String name;
    
    public Product(String initialName, double intitialPrice, int initialQuantity){
        this.price = intitialPrice;
        this.name = initialName;
        this.qauntity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.qauntity + " pcs");
    }
    
}
