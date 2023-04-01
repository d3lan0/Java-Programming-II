
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
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int maxWeight;

    public BoxWithMaxWeight(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Item newItem) {
        int currentWeight = 0;
        for (Item item : items) {
            currentWeight += item.getWeight();
        }

        if (currentWeight + newItem.getWeight() <= maxWeight) {
            items.add(newItem);
        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
