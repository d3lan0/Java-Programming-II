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
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    private String getJoke(){
        System.out.println("Write the Joke to be added:");
        String joke = scanner.nextLine();
        return joke;
    }
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner  = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands \n"
                + "1- add a joke \n"
                + "2- draw a joke \n"
                + "3- list jokes \n"
                + "X- stop");
        
            String command = scanner.nextLine();

            if(command.equals("X")){
                break;
            }
            
            if(command.equals("1")){
                System.out.println("Write the Joke to be added:");
                String joke = scanner.nextLine();
                this.jokeManager.addJoke(joke);
                continue;
            }
            
            if(command.equals("2")){
                System.out.println(this.jokeManager.drawJoke());
                continue;
            }
            
            if(command.equals("3")){
                this.jokeManager.printJokes();
                continue;
            }
            
        
        }
    }
    
}
