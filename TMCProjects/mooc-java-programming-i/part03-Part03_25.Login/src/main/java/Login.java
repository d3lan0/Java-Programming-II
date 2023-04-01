
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        
        if(username.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if(username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("Incorrect username and password!");
        }
    }
}
