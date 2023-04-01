
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
       ArrayList<Country> countries = new ArrayList<>(); 
       
       try {
           Files.lines(Paths.get("literacy.csv"))
                   .map(row -> row.split(","))
                   .forEach(row -> countries.add(new Country(row[3], row[2], row[4], row[5])));
       }catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }
       
       Collections.sort(countries);
       
       countries.stream()
               .forEach(country -> System.out.println(country));
    }
    
    

}
