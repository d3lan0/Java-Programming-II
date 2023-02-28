
public class PaymentTerminal {

    private final double AFFORDABLEMEAL = 2.50;
    private final double HEARTYMEAL = 4.30;
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public double getAmeals(){
        return this.affordableMeals;
    }

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= AFFORDABLEMEAL){
            this.affordableMeals += 1;
            this.money += AFFORDABLEMEAL;
            return payment - AFFORDABLEMEAL;
        }
        
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= HEARTYMEAL){
            this.heartyMeals += 1;
            this.money += HEARTYMEAL;
            return payment - HEARTYMEAL;
        }
        
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card){
        if (card.balance() >= AFFORDABLEMEAL){
            this.affordableMeals += 1;
            card.takeMoney(AFFORDABLEMEAL);
            return true;
        }
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card){
        if (card.balance() >= HEARTYMEAL){
            this.heartyMeals += 1;
            card.takeMoney(HEARTYMEAL);
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum < 0){
            return;
        }
        
        card.addMoney(sum);
        this.money += sum;
    }
    


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
