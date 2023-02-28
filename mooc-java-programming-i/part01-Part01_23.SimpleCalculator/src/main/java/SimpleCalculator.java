
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int sum = firstNum + secondNum;
        int diff = firstNum - secondNum;
        int prod = firstNum * secondNum;
        double quo = 1.0 * firstNum / secondNum;
        
        System.out.println(firstNum + " + " +secondNum + " = " + sum);
        System.out.println(firstNum + " - " +secondNum + " = " + diff);
        System.out.println(firstNum + " * " +secondNum + " = " + prod);
        System.out.println(firstNum + " / " +secondNum + " = " + quo);
    }
}
