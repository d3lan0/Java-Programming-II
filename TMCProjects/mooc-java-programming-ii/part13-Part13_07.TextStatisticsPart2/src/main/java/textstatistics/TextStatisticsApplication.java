package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;
import javafx.scene.control.TextArea;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {

        launch(TextStatisticsApplication.class);
    }

    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();

        final TextArea textbox = new TextArea();
        layout.setCenter(textbox);
        
        
        Label letters = new Label("Letters: 0");
        Label wordsLabels = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        HBox bottom = new HBox();
        bottom.setSpacing(10);
        bottom.getChildren().add(letters);
        bottom.getChildren().add(wordsLabels);
        bottom.getChildren().add(longestWord);
        
        layout.setBottom(bottom);

        textbox.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] words = newValue.split(" ");
            int numberOfWords = words.length;

            String longest = Arrays.stream(words).min((s1, s2) -> s2.length() - s1.length())
                    .get();
            
            letters.setText("Letters: " + characters);
            wordsLabels.setText("Words: " + numberOfWords);
            longestWord.setText("The longest word is: " + longest);

        });

        
        Scene view = new Scene(layout);

        primaryStage.setScene(view);
        primaryStage.show();
    }
}
