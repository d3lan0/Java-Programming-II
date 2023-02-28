
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author theo.higgins
 */
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explaination) {

        if (!hasAbbreviation(sanitize(abbreviation))) {
            this.abbreviations.put(sanitize(abbreviation), sanitize(explaination));
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(sanitize(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(sanitize(abbreviation));
    }
    

    private String sanitize(String input) {
        return input.toLowerCase().trim();
    }

}
