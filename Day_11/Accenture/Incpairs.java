import java.util.*;

public class Incpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long count = 0;

        for (int i = 0; i < n; i++) {
            int[] row = new int[m];

            for (int j = 0; j < m; j++)
                row[j] = sc.nextInt();

            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (row[j] > row[k])
                        count++;
                }
            }
        }

        System.out.println(count);
    }
}