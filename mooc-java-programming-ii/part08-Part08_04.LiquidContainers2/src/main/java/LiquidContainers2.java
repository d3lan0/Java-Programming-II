
import java.util.Scanner;

public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
 
 
        while (true) {    
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] commands = input.split(" ");
            String command = commands[0];
            int value = Integer.parseInt(commands[1]);
            
            if(command.equals("add")){
                first.add(value);
                continue;
            }
            
            if(command.equals("move")){
                if(value > first.contains()){
                   second.add(first.contains());
                   first.remove(value);
                }else {
                    first.remove(value);
                    second.add(value);
                }
                continue;
            }
            
            if(command.equals("remove")){
                second.remove(value);
            }
 
        }
    }
 
}
