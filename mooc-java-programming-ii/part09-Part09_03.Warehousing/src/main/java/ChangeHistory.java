
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
public class ChangeHistory {

    private ArrayList<Double> inventoryChanges;

    public ChangeHistory() {
        this.inventoryChanges = new ArrayList<>();
    }

    public void add(double status) {
        this.inventoryChanges.add(status);

    }

    public void clear() {
        this.inventoryChanges.clear();
    }

    @Override
    public String toString() {
        return this.inventoryChanges.toString();
    }

    public double maxValue() {
        if (this.inventoryChanges.isEmpty()) {
            return 0;
        }

        double max = this.inventoryChanges.get(0);
        for (double value : this.inventoryChanges) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public double minValue() {
        if (this.inventoryChanges.isEmpty()) {
            return 0;
        }

        double min = this.inventoryChanges.get(0);
        for (double value : this.inventoryChanges) {
            if (value < min) {
                min = value;
            }
        }
        return min;

    }

    public double average() {
        if (this.inventoryChanges.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double value : this.inventoryChanges) {
            sum += value;
        }

        return sum / this.inventoryChanges.size();

    }
}
