
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    
    private int calcPrice(int squares, int price){
        return squares * price;
    }

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared){
        return Math.abs(calcPrice(this.princePerSquare,this.squares) - calcPrice(compared.princePerSquare,compared.squares));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return (calcPrice(this.princePerSquare,this.squares) > calcPrice(compared.princePerSquare,compared.squares));
    }
 
}
