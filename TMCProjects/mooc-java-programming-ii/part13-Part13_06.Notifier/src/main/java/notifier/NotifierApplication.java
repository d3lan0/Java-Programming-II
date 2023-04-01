package notifier;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }


    public void start(Stage primaryStage)  {

        final TextField textBox = new TextField();
        Button button = new Button( "Update");
        final Label text = new Label();

        VBox components = new VBox();
        components.getChildren().addAll(textBox, button, text);
        
        button.setOnAction((event) -> {
            text.setText(textBox.getText());
        });
        

        Scene viewport = new Scene(components);
        primaryStage.setScene(viewport);
        primaryStage.show();
    }
}
