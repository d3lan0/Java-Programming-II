package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class PracticeView{
    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();

    }
    public Parent getView() {
        GridPane layout = new GridPane();

        Label instruction = new Label("Translate the word '" + this.word + "'");
        TextField wordInput = new TextField();
        Button addButton = new Button("Check");
        Label feedback = new Label("");

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10));

        layout.add(instruction, 0, 0);
        layout.add(wordInput, 0, 1);
        layout.add(addButton, 0,2);
        layout.add(feedback, 0, 3);

        addButton.setOnMouseClicked(event -> {
            String translation = wordInput.getText();

            if(dictionary.get(word).equals(translation)) {
                feedback.setText("Correct!");
            }else {
                feedback.setText("Incorrect! The translation fo the word '" + word + "' is '" + dictionary.get(word) + "'.");
                return;
            }

            this.word = this.dictionary.getRandomWord();
            instruction.setText("Translate the word '" + this.word + "'");
            wordInput.clear();

        });

        return layout;



    }
}
