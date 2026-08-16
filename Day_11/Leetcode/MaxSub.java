import java.util.*;

public class MaxSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int current = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(a[i], current + a[i]);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}