
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
public class Pipe<T> {
    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<T>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        if(this.values.isEmpty()){
            return null;
        }
        
        T value = values.get(0);
        values.remove(value);
        return value;
    }
    
    public boolean isInPipe(){
        return !values.isEmpty();
    }
}
