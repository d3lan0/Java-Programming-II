
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String string= scanner.nextLine();
            if(string.equals("")){
                break;
            }
            
            String[] words = string.split(" ");
            System.out.println(words[0]);
            
        }


    }
}
