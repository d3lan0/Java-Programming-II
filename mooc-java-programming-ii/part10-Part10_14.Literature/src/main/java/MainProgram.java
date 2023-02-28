
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
            
        while(true) {
            
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            try{
                System.out.println("Input the age recommendation:");
            int age = Integer.parseInt(scanner.nextLine());
            library.add(new Book(name, age));
            } catch (Exception e){
                System.out.println("Error: Please enter a number. ");
            }
            
        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(library, comparator);
        
        System.out.println(library.stream()
                .count() +  " books in total. \n");
       
        
        
        System.out.println("Books:");
        library.stream()
                .forEach(book -> System.out.println(book));
        
        
    }

}
