import java.util.*;

// calculate the matrix--

public class arrays2d {

    // ye ek dusra code hai alag se
    public static boolean search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(" found at cell (" + i + "," + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key is not found");
        return false;
    }
    // yaha se upper hai search ka programing

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the matrix value:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 8);
    }
}
