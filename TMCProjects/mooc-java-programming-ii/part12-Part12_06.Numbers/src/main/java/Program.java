
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int num = scanner.nextInt();
         Random numGen = new Random();
         
         for(int i = 0; i < num; i++){
             int randomNum = numGen.nextInt(11);
             System.out.println(randomNum);
         }
        
    }

}
