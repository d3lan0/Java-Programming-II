
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface user = new UserInterface(scanner);
        user.start();
        System.out.println("Point average (all): " + user.calcPointAverages());
        System.out.println("Point average (passing): " + user.avgPassing());
        System.out.println("Pass percentage: " + user.passPercentage());
        user.gradeDistribution();
        
    }
}
