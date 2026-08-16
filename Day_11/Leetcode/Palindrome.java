import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        String clean = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                clean += c;
        }

        String reverse = new StringBuilder(clean).reverse().toString();

        System.out.println(clean.equals(reverse));
    }
}