
import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        
        Statistics allData = new Statistics();
        Statistics evenData = new Statistics();
        Statistics oddData = new Statistics();
        
        for(int i = 0; i < numbers.size(); i++){
            allData.addNumber(numbers.get(i));
            
            if (numbers.get(i) % 2 == 0){
                evenData.addNumber(numbers.get(i));
            } else{
                oddData.addNumber(numbers.get(i));
            }
        }
        
        System.out.println("Sum: " + allData.sum());
        System.out.println("Sum of even numbers: " + evenData.sum());
        System.out.println("Sum of odd numbers: " + oddData.sum());
        
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
    }
}
