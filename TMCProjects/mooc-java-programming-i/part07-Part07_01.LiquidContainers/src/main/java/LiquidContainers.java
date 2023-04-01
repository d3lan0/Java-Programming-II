
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {

            String input = scan.nextLine();
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] commands = input.split(" ");
            String command = commands[0];
            int value = Integer.parseInt(commands[1]);
            
            if(command.equals("add") &&  value > 0){
                firstContainer += value;
            }
            
            if(firstContainer > 100){
                firstContainer = 100;
            }
            
            if(command.equals("move")){
                if(value > firstContainer){
                   secondContainer += firstContainer;
                   firstContainer = 0;
                }else {
                    firstContainer -= value;
                    secondContainer += value;
                }
                
            }
            
            if (secondContainer > 100){
                secondContainer = 100;
            }
            
            if(command.equals("remove")){
                if(value > secondContainer){
                    secondContainer = 0;
                }else {
                    secondContainer -= value;
                }
            }
            
            if(secondContainer < 0){
                secondContainer = 0;
            }
            
        }
            
            

    }
        
}
