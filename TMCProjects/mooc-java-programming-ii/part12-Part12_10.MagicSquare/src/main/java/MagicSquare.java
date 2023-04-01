import java.util.ArrayList;
import java.util.Collections;
 
public class MagicSquare {
 
    private int[][] square;
 
    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }
 
        this.square = new int[size][size];
 
        int numberOfSquares = size * size + 1;
        int arraySize = size - 1;
 
 
        int currentCol = (int) Math.ceil(this.square.length / 2);
        int currentRow = 0;
        int digit = 1;
 
        for (int i = 1; i < numberOfSquares; i++) {
 
            if (currentCol > arraySize) {
                currentCol = 0;
            }
 
            if (currentRow < 0) {
                currentRow = arraySize;
            }
 
            if (this.square[currentRow][currentCol] != 0) {
                currentRow += 2;
                currentCol--;
 
                if (currentCol > arraySize) {
                    currentCol = 0;
                }
 
                if (currentRow < 0) {
                    currentRow = arraySize;
                }
                
                if (currentRow > arraySize) {
                    currentRow = 1;
                }
                
                if (currentCol < 0) {
                    currentCol = arraySize;
                }
 
                this.square[currentRow][currentCol] = digit;
            }
            
 
            if (this.square[currentRow][currentCol] == 0) {
 
                this.square[currentRow][currentCol] = digit;
                
                if (currentCol > arraySize) {
                    currentCol = 0;
                }
 
                if (currentRow < 0) {
                    currentRow = arraySize;
                }
            }
 
            currentCol++;
            currentRow--;
            digit++;
 
            
 
            
 
        }
    }
 
// implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        return internalArraySum(this.square);
    }
 
    private ArrayList<Integer> internalArraySum(int[][] array) {
        ArrayList<Integer> sumOfRows = new ArrayList<>();
 
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
            sumOfRows.add(sum);
        }
        return sumOfRows;
    }
 
    public ArrayList<Integer> sumsOfColumns() {
        int[][] rotatedArray = rotateArray(this.square);
        return internalArraySum(rotatedArray);
    }
 
    private int[][] rotateArray(int[][] array) {
        int[][] rotatedArray = new int[array.length][array.length];
 
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int col = 0; col < array[row].length; col++) {
                rotatedArray[col][row] = array[row][col];
            }
        }
 
        return rotatedArray;
    }
 
    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sum = new ArrayList<>();
 
        sum.add(sumLeadingDiag(this.square));
        sum.add(sumTrailingDiag(this.square));
 
        return sum;
    }
 
    public int sumLeadingDiag(int[][] array) {
        int sum = 0;
 
        for (int row = 0; row < array.length; row++) {
            sum += array[row][row];
        }
 
        return sum;
    }
 
    public int sumTrailingDiag(int[][] array) {
        int sum = 0;
        int col = 0;
 
        for (int row = array.length - 1; row >= 0; row--) {
            sum += array[row][col];
            System.out.println(sum);
            col++;
        }
 
        return sum;
    }
 
    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }
 
    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }
 
        return numbers;
    }
 
    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();
 
        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }
 
        return true;
    }
 
    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());
 
        if (sums.size() < 3) {
            return false;
        }
 
        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }
 
        return true;
    }
 
    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }
 
        return this.square[y][x];
    }
 
    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }
 
        this.square[y][x] = value;
    }
 
    public int getWidth() {
        return this.square.length;
    }
 
    public int getHeight() {
        return this.square.length;
    }
 
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }
 
            result.append("\n");
        }
 
        return result.toString();
    }
}
 