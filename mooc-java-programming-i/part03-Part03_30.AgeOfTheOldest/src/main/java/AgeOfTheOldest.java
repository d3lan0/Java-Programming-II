
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true){
            String string = scanner.nextLine();
            if(string.equals("")){
                break;
            }
            String[] person = string.split(",");
            if(Integer.valueOf(person[1]) > oldest){
                oldest = Integer.valueOf(person[1]);
            }
            
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
