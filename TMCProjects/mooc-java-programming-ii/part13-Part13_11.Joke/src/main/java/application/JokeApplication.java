package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class JokeApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20));
        menu.setSpacing(10);

        Button showJoke = new Button("Joke");
        Button jokeAnswer = new Button("Answer");
        Button jokeExplanation = new Button("Explanation");

        menu.getChildren().addAll(showJoke, jokeAnswer, jokeExplanation);

        layout.setTop(menu);

        StackPane joke = createView("What do you call a bear with no teeth?");
        StackPane answer = createView("A gummy bear.");
        StackPane explanation = createView("A bear with no teeth only has gums, get it?");

        showJoke.setOnAction(event -> layout.setCenter(joke));
        jokeAnswer.setOnAction(event -> layout.setCenter(answer));
        jokeExplanation.setOnAction(event -> layout.setCenter(explanation));

        layout.setCenter(joke);

        Scene scene = new Scene(layout);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
