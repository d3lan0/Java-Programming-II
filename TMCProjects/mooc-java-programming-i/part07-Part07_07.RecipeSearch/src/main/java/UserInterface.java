
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author theo.higgins
 */
public class UserInterface {

    private String file;
    private ArrayList<Recipe> recipies;
    private Scanner scanner;

    public UserInterface() {
        this.recipies = new ArrayList();
        this.scanner = new Scanner(System.in);

    }

    public void start() {

        System.out.println("File to read: ");
        this.file = scanner.nextLine();

        ArrayList<String> fileData = getDataFromFile();
        createRecipies(fileData);

        System.out.println("\rCommands: "
                + "\rlist - lists the repices "
                + "\rstop - stops the program "
                + "\rfind name - searches recipes by name"
                + "\rfind cooking time - searches recipes by cooking time"
                + "\rfind ingredient - searches recipes by ingredient");

        
            System.out.println("\rEnter commands: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                System.exit(0);
            }

            processCommand(command);
        

    }

    private ArrayList<String> getDataFromFile() {
        ArrayList<String> fileData = new ArrayList();
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String value = fileReader.nextLine();
                fileData.add(value);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return fileData;

    }

    private void createRecipies(ArrayList<String> data) {

        for (int j = 0; j <= data.size(); j++) {

            ArrayList<String> temp = new ArrayList();
            for (int i = j; i < data.size(); i++) {
                if (data.get(i).equals("")) {
                    break;
                }
                temp.add(data.get(i));
                j++;

            }

            Recipe tempRecipe = new Recipe(temp.get(0), Integer.valueOf(temp.get(1)));
            for (int i = 2; i < temp.size(); i++) {
                tempRecipe.addIngredients(temp.get(i));
            }

            recipies.add(tempRecipe);

        }
    }

    private void processCommand(String command) {

        if (command.equals("list")) {
            System.out.println("\rRecipes: ");
            for (Recipe recipe : recipies) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }

        if (command.equals("find name")) {
            findRecipeByKeyword();
        }

        if (command.equals("find cooking time")) {
            findRecipeByTime();
        }
        
        if(command.equals("find ingredient")){
            findRecipeByIngredient();
        }
    }

    private void findRecipeByKeyword() {
        System.out.println("Searched Word: ");
        String word = scanner.nextLine();
        System.out.println("\rRecipes: ");
        for (Recipe recipe : recipies) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    private void findRecipeByTime() {
        System.out.println("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        System.out.println("\rRecipes: ");
        for (Recipe recipe : recipies) {
            if (recipe.getCookTime() <= maxTime) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    private void findRecipeByIngredient() {
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("\rRecipes: ");
        for (Recipe recipe : recipies) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }

        }
    }

    public String toString() {
        return this.recipies.toString();
    }

}
