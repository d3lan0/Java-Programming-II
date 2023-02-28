/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());

    }

    @Override
    public double takeFromWarehouse(double amount) {
        if (amount > getBalance()) {
            double balance = getBalance();
            super.takeFromWarehouse(amount);
            history.add(getBalance());
            return balance;
        }
        super.takeFromWarehouse(amount);
        history.add(getBalance());
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: "  + history);
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
