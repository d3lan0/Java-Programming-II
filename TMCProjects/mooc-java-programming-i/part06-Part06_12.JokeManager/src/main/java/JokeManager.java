import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    private int randomIndex(){
        int random = (int) (Math.random() * jokes.size());
        System.out.println("Random: " + random);
        return random;
        
    }
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
     
        return jokes.get(randomIndex());
        
    }
    
    public void printJokes(){
        if(!jokes.isEmpty()){
            for(String joke : jokes){
                System.out.println(joke);
            }
        }
    }
    
    
}
