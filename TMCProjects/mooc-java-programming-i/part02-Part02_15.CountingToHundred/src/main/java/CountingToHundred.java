
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.valueOf(scanner.nextLine());
        int counter = start;
        while (counter <= 100){
            System.out.println(counter);
            counter++;
        }

    }
}
