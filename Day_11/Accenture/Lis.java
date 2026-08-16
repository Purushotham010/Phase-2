import java.util.*;

public class Lis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.fill(dp, 1);

        int answer = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }

            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}