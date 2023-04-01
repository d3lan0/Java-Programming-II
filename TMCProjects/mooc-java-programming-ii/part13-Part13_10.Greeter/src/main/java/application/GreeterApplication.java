package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label instructions = new Label("Enter your name and start.");
        TextField name = new TextField();
        Button  start = new Button("Start");

        GridPane initPage = new GridPane();
        initPage.add(instructions, 0, 0);
        initPage.add(name, 0, 1);
        initPage.add(start, 0,2);

        initPage.setPrefSize(300, 100);
        initPage.setAlignment(Pos.CENTER);
        initPage.setVgap(10);
        initPage.setHgap(10);
        initPage.setPadding(new Insets(20));

        Scene initPageView = new Scene(initPage);

        Label greeting = new Label();
        GridPane welcomePage  = new GridPane();
        welcomePage.setPrefSize(300,100);
        welcomePage.getChildren().add(greeting);
        welcomePage.setAlignment(Pos.CENTER);

        Scene welcomePageView = new Scene(welcomePage);

        start.setOnAction(event ->  {
            greeting.setText("Welcome " + name.getText() + "!");
            primaryStage.setScene(welcomePageView);
        });

        primaryStage.setScene(initPageView);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
