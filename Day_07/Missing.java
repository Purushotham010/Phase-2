import java.util.*;

public class Missing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        int[] arr = new int[n - 1];
        int actualSum = 0;

        System.out.println("Enter " + (n - 1) + " numbers:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = s.nextInt();
            actualSum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;

        System.out.println("Missing number: " + (expectedSum - actualSum));

        s.close();
    }
}