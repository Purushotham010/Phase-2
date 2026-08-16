import java.util.*;

public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int k = 5;
        int candies = n;

        int order = sc.nextInt();

        if (order <= 0 || order > candies) {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : " + candies);
            return;
        }

        candies -= order;

        System.out.println("NUMBER OF CANDIES SOLD : " + order);

        if (candies <= k)
            candies = n;

        System.out.println("NUMBER OF CANDIES AVAILABLE : " + candies);
    }
}