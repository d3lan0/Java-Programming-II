
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOne = Integer.valueOf(scanner.nextLine());
        int numTwo = Integer.valueOf(scanner.nextLine());
        
        System.out.println(Math.sqrt(numOne + numTwo));
        
        

    }
}
