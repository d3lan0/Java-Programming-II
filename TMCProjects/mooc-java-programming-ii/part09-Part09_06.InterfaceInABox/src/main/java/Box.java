
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
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() < maxCapacity) {
            if (item instanceof Packable) {
                items.add(item);
            }
        }
    }

    @Override
    public double weight() {
        if (!this.items.isEmpty()) {
            double weight = 0.0;
            for (Packable item : items) {
                weight += item.weight();
            }

            return weight;
        }
        return 0.0;
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }

}
