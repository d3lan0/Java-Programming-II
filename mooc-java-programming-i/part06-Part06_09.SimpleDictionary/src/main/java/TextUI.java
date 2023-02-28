import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner,SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.print("Bye bye!");
                return;
            }
            
            if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            
            if(command.equals("search")){
                System.out.println("To be traslated:");
                String searchValue = scanner.nextLine();
                String translation = dictionary.translate(searchValue);
                try{
                    translation.equals("null");
                }catch(Exception e){
                    System.out.println("Word " + searchValue + " was not found" );
                    continue;
                }

                System.out.println("Translation: " + translation);
               
                continue; 
            }
            
            System.out.println("Unknown command");
            
        }
    }
}
