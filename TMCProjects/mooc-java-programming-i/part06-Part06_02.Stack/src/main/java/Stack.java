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
public class Stack {
    private ArrayList<String> strings;
    
    public Stack(){
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.strings.isEmpty();
    }
    
    public void add(String value) {
        if(!this.strings.contains(value)){
            strings.add(value);
        }
    }
    
    public ArrayList<String> values(){
        return this.strings;
    }
    
    public String take(){
        int top = strings.size() - 1;
        String value = strings.get(top);
        strings.remove(top);
        return value;
    }
}
