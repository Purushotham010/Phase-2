import java.util.*;

public class Next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] a = s.toCharArray();

        int i = n - 2;

        // Find the first decreasing digit from the right
        while (i >= 0 && a[i] >= a[i + 1])
            i--;

        int j = n - 1;

        // Find the smallest digit greater than a[i]
        while (a[j] <= a[i])
            j--;

        // Swap
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        // Reverse remaining digits
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(a));
    }
}