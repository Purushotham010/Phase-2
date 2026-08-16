import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : map.keySet()) {
            if (map.get(x) > n / 2) {
                System.out.println(x);
                return;
            }
        }

        System.out.println(-1);
    }
}