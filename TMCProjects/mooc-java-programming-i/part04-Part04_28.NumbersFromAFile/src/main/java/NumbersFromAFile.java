
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Numbers: " + countInRange(file, lowerBound, upperBound));

    }
    
    public static int countInRange(String file, int lowerBound, int upperBound){
        ArrayList<Integer> fileData = new ArrayList<>();
        int count = 0;
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                fileData.add(Integer.valueOf(line));
            }            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for(int value : fileData){
            if(value >= lowerBound && value <= upperBound){
                count++;
            }
        }
        
        return count;
    }

}
