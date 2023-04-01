

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;
    private int cardValue;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
        setCardValue();
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
    
    private void setCardValue(){
       this.cardValue = this.value + this.suit.ordinal();
    }
    
    public int getCardValue(){
        return this.cardValue;
    }
    
    
    @Override
    public int compareTo(Card card) {       
        return this.cardValue - card.cardValue;
    }

}
