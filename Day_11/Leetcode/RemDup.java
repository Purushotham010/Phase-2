import java.util.*;

public class RemDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int k = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] != a[k - 1]) {
                a[k] = a[i];
                k++;
            }
        }

        System.out.println(k);

        for (int i = 0; i < k; i++)
            System.out.print(a[i] + " ");
    }
}