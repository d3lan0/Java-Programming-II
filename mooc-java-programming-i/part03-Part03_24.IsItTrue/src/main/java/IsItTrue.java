
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if(string.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try Again!");
        }
        

    }
}
