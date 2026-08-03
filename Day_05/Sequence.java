//perfect square
import java.util.Scanner;

class Sequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        String term = "1";

        for (int i = 0; i < n; i++) {
            System.out.println(term);

            StringBuilder next = new StringBuilder();
            int j = 0;

            while (j < term.length()) {
                char ch = term.charAt(j);
                int count = 1;

                while (j + 1 < term.length() && term.charAt(j + 1) == ch) {
                    count++;
                    j++;
                }

                next.append(count).append(ch);
                j++;
            }

            term = next.toString();   // Missing statement
        }
    }
}