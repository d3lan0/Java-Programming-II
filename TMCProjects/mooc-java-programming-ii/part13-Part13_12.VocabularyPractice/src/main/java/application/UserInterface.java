package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UserInterface extends Application{
    private Dictionary dictionary;

    public void init(){
        this.dictionary = new Dictionary();
    }
    public void start(Stage primaryStage)  {
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20));
        menu.setSpacing(10);

        Button enterWords = new Button("Enter new words");
        enterWords.setOnAction(event -> layout.setCenter(inputView.getView()));

        Button practice = new Button("Practice");
        practice.setOnAction(event -> layout.setCenter(practiceView.getView()));

        menu.getChildren().addAll(enterWords, practice);

        layout.setTop(menu);
        layout.setCenter(practiceView.getView());

        Scene view = new Scene(layout, 400, 300);

        primaryStage.setScene(view);
        primaryStage.show();



    }
}
