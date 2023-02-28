

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        System.out.println(checker.timeOfDay("3:59:31"));
        
        System.out.println(checker.timeOfDay("13:59:31"));
        
        System.out.println(checker.timeOfDay("24:41:16)"));
    }
}
