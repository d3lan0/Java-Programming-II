
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) {
                break;
            }

            numbers.add(input);

        }
        
        ArrayList<Integer> output = numbers.stream()
                .filter(number -> number >= 1 && number <= 5)
                .collect(Collectors.toCollection(ArrayList::new));
                
                
        
        output.stream()
                .forEach(number -> System.out.println(number));

    }
}
