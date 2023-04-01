
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
public class OneItemBox extends Box {

    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (items.size() < 1) {
            items.add(item);
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
