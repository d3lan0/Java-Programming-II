
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
        String outputSelection = scanner.nextLine();
        if (outputPositive(outputSelection)) {
            System.out.println(positiveNumberOutput(numbers));
        } else {
            System.out.println(negativeNumberOutput(numbers));
        }

    }

    public static String positiveNumberOutput(ArrayList<String> numbers) {
        double average = numbers.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num > 0)
                .average()
                .getAsDouble();
        return "Average of positive numbers: " + average;
    }

    public static String negativeNumberOutput(ArrayList<String> numbers) {
        double average = numbers.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();
        return "Average of negative numbers: " + average;
    }
    
    public static boolean outputPositive(String outputSelection) {
        return outputSelection.equals("p") ? true : false;
    }
}
