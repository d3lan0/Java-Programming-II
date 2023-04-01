package ticTacToe;

public class Game {
    private final int[][] game;

    public Game() {
        this.game = new int[3][3];
    }

    public void setValue(int num) {
        switch (num) {
            case 1:
                game[0][0] = 1;
                break;
            case 2:
                game[0][1] = 1;
                break;
            case 3:
                game[0][2] = 1;
                break;
            case 4:
                game[1][0] = 1;
                break;
            case 5:
                game[1][1] = 1;
                break;
            case 6:
                game[1][2] = 1;
                break;
            case 7:
                game[2][0] = 1;
                break;
            case 8:
                game[2][1] = 1;
                break;
            case 9:
                game[2][2] = 1;
                break;
            default:
                break;
        }
    }

    public boolean checkForWinner() {
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
            if (game[rowNumber][i] != 1) {
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
            if (game[i][colNum] != 1) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiags(){
        return checkLeadingDiag() || checkTrailingDiag();
    }

    private boolean checkLeadingDiag() {
        for (int i = 0; i < game.length; i++) {
            if (game[i][i] != 1) {
                return false;
            }
        }
        return true;
    }

    private boolean checkTrailingDiag() {
        int col = 0;
        for(int i = game.length - 1; i >= 0; i--){
            if (game[i][col] != 1) {
                return false;
            }
            col++;
        }
        return true;
    }

}
