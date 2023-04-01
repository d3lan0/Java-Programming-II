
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNum = scan.nextInt();
        System.out.println("Give the second number:");
        int secNum = scan.nextInt();
        
        if (firstNum == secNum) {
            System.out.println("The numbers are equal!");
        }else if(firstNum > secNum) {
            System.out.println("Greater number is: " + firstNum);
        }else {
            System.out.println("Greater number is: " + secNum);
        }

    }
}
