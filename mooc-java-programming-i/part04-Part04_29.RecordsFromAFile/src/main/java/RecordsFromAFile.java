
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fileData = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                
                String[] data = line.split(",");
                System.out.println(data[0] + ", age: " + data[1] + " years");
                fileData.add(line);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
