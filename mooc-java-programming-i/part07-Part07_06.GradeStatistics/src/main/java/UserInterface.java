import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author theo.higgins
 */
public class UserInterface {
    Scanner scanner;
    ArrayList<Grade> grades;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.grades = new ArrayList();
    }
    
    public void start(){
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            int input = Integer.valueOf(scanner.nextLine());
            
           if(input == -1){
               break;
           }
           
           if(!(input > 0 && input < 100)){
               continue;
           }
           
           grades.add(new Grade(input));
           
        }
        
    }
    
    public double calcPointAverages(){
        double sum = 0;
        for(Grade grade : grades){
            sum += grade.getGrade();
        }
        
        return sum/this.grades.size();
    }
    
    public float avgPassing(){
        float sum = 0;
        int count = 0;
        for(Grade grade : grades){
            if(grade.isPassing()){
                sum += grade.getGrade();
                count++;
            }
        }
        
        if(count == 0){
            return 0;
        }
        
        return sum/count;
    }
    
    
    public float passPercentage(){
        float count = 0;
        for(Grade grade : grades){
            if(grade.isPassing()){
                count++;
            }
        }
        return 100 * count / grades.size();
    }
    
    public void gradeDistribution(){
        String five = "";
        String four = "";
        String three = "";
        String two = "";
        String one = "";
        String zero = "";
        for(Grade grade: grades){
            if(grade.getGrade() >= 90){
            five = five + "*";
            continue;
            }

            if(grade.getGrade() >= 80){
               four = four + "*";
               continue;
            }

            if(grade.getGrade() >= 70){
                three = three + "*";
                continue;
            }

            if(grade.getGrade() >= 60){
                two = two + "*";
                continue;
            }

            if(grade.getGrade() >= 50){
                one = one + "*";
                continue;
            }

            if(grade.getGrade() < 50 ){
                zero = zero + "*";
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
    }
    
    @Override
    public String toString(){
        return grades.toString();
    }
    
    
}
