/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Timer {
    private ClockHand milliseconds;
    private ClockHand seconds;
    
    public Timer() {
        this.milliseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.milliseconds.advance();
        
        if (this.milliseconds.value() == 0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds.toString() + ":" + milliseconds;
    }
    
}
