package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {

        launch(MultipleViews.class);
    }

    public void start(final Stage primaryStage) {
        BorderPane firstScene = new BorderPane();
        final VBox secondScene = new VBox();
        GridPane thirdScene = new GridPane();

        Label firstViewText = new Label("First view!");
        Button firstToSecondViewButton = new Button("To the second view!");
        firstScene.setTop(firstViewText);
        firstScene.setCenter(firstToSecondViewButton);


        Label secondViewText = new Label("Second View!");
        Button  secondViewToThirdViewButton = new Button("To the third view");
        secondScene.setSpacing(10);
        secondScene.getChildren().add(secondViewToThirdViewButton);
        secondScene.getChildren().add(secondViewText);


        Label thirdViewText = new Label("Third View!");
        Button thirdViewToFirstViewButton = new Button("To the first view!");
        thirdScene.add(thirdViewText, 0, 0);
        thirdScene.add(thirdViewToFirstViewButton, 1, 1);

        Scene first = new Scene(firstScene);
        Scene second = new Scene(secondScene);
        Scene third = new Scene(thirdScene);

        firstToSecondViewButton.setOnAction(event -> primaryStage.setScene(second));
        secondViewToThirdViewButton.setOnAction(event -> primaryStage.setScene(third));
        thirdViewToFirstViewButton.setOnAction(event -> primaryStage.setScene(first));

        primaryStage.setScene(first);
        primaryStage.show();


    }
}
