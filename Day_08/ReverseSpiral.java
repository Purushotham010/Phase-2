import java.util.Scanner;

public class ReverseSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int value = n * n;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        // Fill the matrix in spiral order, but with values decreasing from n*n to 1.
        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                matrix[top][col] = value--;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = value--;
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    matrix[bottom][col] = value--;
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    matrix[row][left] = value--;
                }
                left++;
            }
        }

        // Print the reverse spiral matrix.
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
