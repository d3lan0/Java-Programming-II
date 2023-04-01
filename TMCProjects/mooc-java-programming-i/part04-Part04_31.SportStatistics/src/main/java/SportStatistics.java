
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Game> data = gameData(file);
        int[] winLoss = winLossStats(data, team);
        
        System.out.println("Games: " + gamesPlayed(data, team));
        System.out.println("Wins: " + winLoss[0]);
        System.out.println("Losses: " + winLoss[1]);
        
        

    }
    
    public static int[] winLossStats(ArrayList<Game> data, String team){
        int win = 0;
        int loss = 0;
        for(Game game: data){
    
            if(game.getAway().equals(team) || game.getHome().equals(team)){
                String winner = game.winner();
   
                if(winner.equals(team)){
                    win++;
                }else {
                    loss++;
                }
            } 
        }
        int[] output = {win, loss};
        return output;
    }
    
    public static int gamesPlayed(ArrayList<Game> data, String team){
        int played = 0;
        for(Game game : data){
            if(game.getAway().equals(team) || game.getHome().equals(team)){
                played++;
            }
        }
        return played;
    }
    
    public static ArrayList<Game> gameData(String file) {
        ArrayList<Game> games = new ArrayList<>();
        
        try(Scanner fileReader= new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                if(data.isEmpty()){
                    continue;
                }
                String[] gameData = data.split(",");
                games.add(new Game(gameData[0], gameData[1], Integer.valueOf(gameData[2]), Integer.valueOf(gameData[3])));
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }

}
