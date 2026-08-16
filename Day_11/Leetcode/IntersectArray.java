import java.util.*;

public class IntersectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++)
            set.add(sc.nextInt());

        int m = sc.nextInt();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();

            if (set.contains(x))
                result.add(x);
        }

        for (int x : result)
            System.out.print(x + " ");
    }
}