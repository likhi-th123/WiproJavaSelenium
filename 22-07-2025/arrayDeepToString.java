import java.util.Arrays;

public class arrayDeepToString {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Incorrect way – will print reference
        System.out.println("Using toString(): " + Arrays.toString(matrix));

        // Correct way – prints contents properly
        System.out.println("Using deepToString(): " + Arrays.deepToString(matrix));
        System.out.println(matrix);

        System.out.println(Arrays.binarySearch(new int[]{1, 3, 5}, 541));

    }
}
