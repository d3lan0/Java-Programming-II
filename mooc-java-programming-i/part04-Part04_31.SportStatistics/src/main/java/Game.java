/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore){
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.awayTeam = awayTeam;
        this.awayScore= awayScore;
    }
    
    public String getHome(){
        return this.homeTeam;
    }
    
    public String getAway(){
        return this.awayTeam;
    }
    
    public int homeScore(){
        return this.homeScore;
    }
    
    public int awayScore(){
        return this.awayScore;
    }
    
    public String winner(){
        if (homeScore > awayScore){
            return homeTeam;
        }
        return awayTeam;
    }
}
