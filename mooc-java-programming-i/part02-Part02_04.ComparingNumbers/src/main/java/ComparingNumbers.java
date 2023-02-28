
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.valueOf(scanner.nextLine());
        int numTwo = Integer.valueOf(scanner.nextLine());
        
        if(numOne == numTwo){
            System.out.println(numOne + " is equal to " + numTwo);
        }
        
        if(numOne > numTwo){
            System.out.println(numOne + " is greater than " + numTwo);
        }else {
            System.out.println(numOne + " is less than " + numTwo);
        }

    }
}
