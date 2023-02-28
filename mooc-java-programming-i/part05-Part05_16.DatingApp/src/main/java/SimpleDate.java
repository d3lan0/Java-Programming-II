
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        clone.advance(days);
        return clone;
    }
    
    public void advance(){
        if(this.month == 12 && this.day == 30){
            this.year++;
            this.month = 1;
            this.day = 1;
            return;
        }
        
        if(this.day == 30){
            this.day = 1; 
            this.month += 1;
            return;
        } 
      
        this.day++;
        
    }
    
   public void advance(int howManyDays){
       int counter = howManyDays;
       while(counter > 0){
           this.advance();
           counter--;
       }
   }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
