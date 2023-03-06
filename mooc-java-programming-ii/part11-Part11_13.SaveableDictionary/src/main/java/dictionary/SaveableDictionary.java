/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author theo.higgins
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();

    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try (Scanner reader = new Scanner(new File(this.file))) {
            while (reader.hasNextLine()) {
                String[] definition = reader.nextLine().split(":");
                this.dictionary.put(definition[0], definition[1]);
            }

            return true;
            
        } catch (Exception e) {

            return false;
        }
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(this.file)){
            this.dictionary.entrySet()
                    .forEach(entry -> writer.println(entry.getKey() + ":" + entry.getValue()));
              return true;     
        }catch(Exception e){
            return false;
        }
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);

    }

    public String translate(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("Empty string is not valid.");
        }

        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
            return this.dictionary
                    .entrySet()
                    .stream()
                    .filter(entry -> Objects.equals(entry.getValue(), word))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .map(Object::toString)
                    .orElse("");
        }

        return null;

    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }

        if (this.dictionary.containsValue(word)) {
            this.dictionary.entrySet()
                    .removeIf(entry -> word.equals(entry.getValue()));
        }
    }

}
