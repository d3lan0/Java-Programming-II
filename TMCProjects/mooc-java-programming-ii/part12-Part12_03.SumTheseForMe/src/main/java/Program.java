
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {

        if (!validateFromWhere(array, fromWhere)) {
            fromWhere = 0;
        }

        if (!validateToWhere(array, toWhere)) {
            toWhere = array.length;
        }

        int sum = 0;
        

        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] > smallest && array[i] < largest) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean validateFromWhere(int[] array, int fromwhere) {
        if (fromwhere < 0) {
            return false;
        }

        if (fromwhere > array.length) {
            return false;
        }

        return true;
    }

    public static boolean validateToWhere(int[] array, int towhere) {
        if (towhere < 0) {
            return false;
        }

        if (towhere > array.length) {
            return false;
        }

        return true;
    }

}
