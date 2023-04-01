package ticTacToe;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    GameLogic game = new GameLogic();
    public void start(Stage primaryStage) throws Exception {

        final String[] currentTurn = new String[1];
        currentTurn[0] = "X";
        Label instructions = new Label("Turn: " + currentTurn[0]);
        instructions.setFont(Font.font("Monospaced", 40));


        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));

        EventHandler<MouseEvent> buttonClick = event -> {
            if (event.getSource() instanceof Button) {
                Button tempButton = (Button) event.getSource();
                game.setPlayer(currentTurn[0]);
                game.setValue(Integer.parseInt(tempButton.getId()));
                tempButton.setText(currentTurn[0]);
                tempButton.setOnMouseClicked(null);
            }
            if(game.checkForWinner()){
                instructions.setText("The end!");
                for(Node child: grid.getChildren()){
                    child.setOnMouseClicked(null);
                }

            } else {
                if (currentTurn[0].equalsIgnoreCase("x")) {
                    currentTurn[0] = "O";
                } else {
                    currentTurn[0] = "X";
                }
                instructions.setText("Turn: " + currentTurn[0]);
            }
        };

        Button button1 = generateButton("1");
        button1.setOnMouseClicked(buttonClick);
        Button button2 = generateButton("2");
        button2.setOnMouseClicked(buttonClick);
        Button button3 = generateButton("3");
        button3.setOnMouseClicked(buttonClick);
        Button button4 = generateButton("4");
        button4.setOnMouseClicked(buttonClick);
        Button button5 = generateButton("5");
        button5.setOnMouseClicked(buttonClick);
        Button button6 = generateButton("6");
        button6.setOnMouseClicked(buttonClick);
        Button button7 = generateButton("7");
        button7.setOnMouseClicked(buttonClick);
        Button button8 = generateButton("8");
        button8.setOnMouseClicked(buttonClick);
        Button button9 = generateButton("9");
        button9.setOnMouseClicked(buttonClick);

        grid.add(button1, 0, 0);
        grid.add(button4, 1, 0);
        grid.add(button7, 2, 0);
        grid.add(button2, 0, 1);
        grid.add(button5, 1, 1);
        grid.add(button8, 2, 1);
        grid.add(button3, 0, 2);
        grid.add(button6, 1, 2);
        grid.add(button9, 2, 2);

        BorderPane gameBoard = new BorderPane();
        gameBoard.setTop(instructions);
        gameBoard.setCenter(grid);

        Scene view = new Scene(gameBoard, 300, 400);
        primaryStage.setScene(view);
        primaryStage.show();

    }

    private Button generateButton(String id) {
        Button button = new Button();
        button.setFont(Font.font("Monospaced", 40));
        button.setPrefSize(100, 100);
        button.setId(id);
        return button;
    }

    public static void main(String[] args) {
       launch(TicTacToeApplication.class);
    }



}
