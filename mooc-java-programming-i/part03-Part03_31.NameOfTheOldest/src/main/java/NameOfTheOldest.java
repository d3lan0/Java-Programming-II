
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> persons = new ArrayList<>();
        int oldest = 0;
        String name= "";
        
        while(true){
            String string = scanner.nextLine();
            if(string.equals("")){
                break;
            }
            persons.add(string);
        }
        
        for(String person: persons){
            String[] thisPerson =  person.split(",");
            if(Integer.valueOf(thisPerson[1]) > oldest){
                name = thisPerson[0];
                oldest = Integer.valueOf(thisPerson[1]);
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }

    
}
