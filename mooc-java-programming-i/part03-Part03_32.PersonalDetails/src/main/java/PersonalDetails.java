
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> persons = new ArrayList<>();
        int birthYearsSum = 0;
        int longestName = 0;
        String name= "";
        
        while(true){
            String string = scanner.nextLine();
            if(string.equals("")){
                break;
            }
            persons.add(string);
        }
        
        for(String person: persons){
            String[] thisPerson = person.split(",");
            birthYearsSum += Integer.valueOf(thisPerson[1]);
            System.out.println(thisPerson[0].length());
            if(thisPerson[0].length() > longestName){
                name = thisPerson[0];
                longestName = thisPerson[0].length();
            }
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * birthYearsSum / persons.size()));


    }
}
