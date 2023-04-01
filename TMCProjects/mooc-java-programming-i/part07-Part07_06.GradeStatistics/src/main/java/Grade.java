/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Grade {
    int grade;
    
    public Grade (int grade){
        this.grade = grade;
    }
    
    public boolean isPassing(){
        return this.grade >= 50;
    }
    
    public int getGrade(){
        return this.grade;
    }
    
}
