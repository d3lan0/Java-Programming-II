
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            }
            
            if(number > 0){
                count++;
                sum += number;
            }
           
        }
        
        
        if(count == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double avg = 1.0 * sum/count;
            System.out.println("Average of the numbers: " + avg);
        }
    }
}
