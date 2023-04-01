
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            }
            
            if(number < 0){
                sum+= number;
            }
       
        }
        System.out.println("The sum of the numbers: " + sum);

    }
}
