/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList(){
        this.tasks = new ArrayList<>();
    }
   
    private boolean isEmpty(){
        return tasks.isEmpty();
    }
    
    public void add(String task){
        tasks.add(task);
    }
    
    public void print(){
        if(isEmpty()){
            return;
        }
        
        int taskIndex = 1;
        for(String task : tasks){
            System.out.println(taskIndex + ": " + task);
            taskIndex++;
        }
    }
    
    public void remove(int number){
        if(isEmpty()){
            return;
        }
        
        tasks.remove(number-1);
    }
}
