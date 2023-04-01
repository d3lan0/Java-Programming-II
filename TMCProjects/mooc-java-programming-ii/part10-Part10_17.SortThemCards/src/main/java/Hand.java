
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand () {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public ArrayList<Card> getCards(){
        return this.cards;
    }
    
    public void print() {
        cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        int thisHandValue = handValue(this);
        int thatHandValue = handValue(o);
        
        if(thisHandValue == thatHandValue) {
            return 0;
        }
        
        if(thisHandValue > thatHandValue) {
            return 1;
        }
        
        return -1;
        
    }
    
    private int handValue (Hand hand) {
        return hand.getCards().stream()
                .mapToInt(card -> card.getValue() + card.getSuit().ordinal())
                .sum();
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
}
