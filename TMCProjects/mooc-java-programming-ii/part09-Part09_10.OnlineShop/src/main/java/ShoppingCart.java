
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author theo.higgins
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!cart.containsKey(product)) {
            cart.put(product, new Item(product, 1, price));
            return;
        }
        cart.get(product).increaseQuantity();
    }

    public int price() {
        int total = 0;
        if (!cart.isEmpty()) {
            for (Item item : cart.values()) {
                total += item.price();
            }
        }
        return total;
    }

    public void print() {
        if (!cart.isEmpty()) {
            for (Item item : cart.values()) {
                System.out.println(item);
            }
        }
    }

}
