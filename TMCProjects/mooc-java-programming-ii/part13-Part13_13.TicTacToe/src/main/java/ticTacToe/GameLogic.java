package ticTacToe;

import java.util.Arrays;

public class GameLogic {
    private final String[][] game;
    private String player;
    private int turns;

    public GameLogic() {
        this.game = new String[3][3];
        this.turns = 0;
        for (String[] row : game) {
            Arrays.fill(row, "");
        }
    }

    public void setPlayer(String currentPlayer) {
        this.player = currentPlayer;
    }

    public void setValue(int num) {
        switch (num) {
            case 1:
                game[0][0] = player;
                break;
            case 2:
                game[0][1] = player;
                break;
            case 3:
                game[0][2] = player;
                break;
            case 4:
                game[1][0] = player;
                break;
            case 5:
                game[1][1] = player;
                break;
            case 6:
                game[1][2] = player;
                break;
            case 7:
                game[2][0] = player;
                break;
            case 8:
                game[2][1] = player;
                break;
            case 9:
                game[2][2] = player;
                break;
            default:
                break;
        }
        turns++;
    }

    public boolean checkForWinner() {
        if (turns == 9) {
            return true;
        }
        return checkRows() || checkCols() || checkDiags();
    }

    private boolean checkRows() {
        for (int i = 0; i < game.length; i++) {
            if (checkRow(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRow(int rowNumber) {
        for (int i = 0; i < game.length; i++) {
            if (!game[rowNumber][i].equalsIgnoreCase(player)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkCols() {
        for (int i = 0; i < game.length; i++) {
            if (checkCol(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCol(int colNum) {
        for (int i = 0; i < game.length; i++) {
            if (!game[i][colNum].equalsIgnoreCase(player)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiags() {
        return checkLeadingDiag() || checkTrailingDiag();
    }

    private boolean checkLeadingDiag() {
        for (int i = 0; i < game.length; i++) {
            if (!game[i][i].equalsIgnoreCase(player)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkTrailingDiag() {
        int col = 0;
        for (int i = game.length - 1; i >= 0; i--) {
            if (!game[i][col].equalsIgnoreCase(player)) {
                return false;
            }
            col++;
        }
        return true;
    }
}