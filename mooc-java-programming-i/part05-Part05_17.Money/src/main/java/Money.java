
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money addition){
        int cents = addition.cents() + this.cents;
        int euros = addition.euros() + this.euros;
        
        Money newMoney = new Money(euros, cents);        
        return newMoney;        
    }
    
    public boolean lessThan(Money compared){        
        if (this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        }
        
        if (this.euros < compared.euros){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        
        int thisCents = (this.euros * 100) + this.cents;
        int decreaserCents = (decreaser.euros() * 100) + decreaser.cents;
        int newCents = thisCents - decreaserCents;
        Money newMoney = new Money(0,newCents);
        return newMoney;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
