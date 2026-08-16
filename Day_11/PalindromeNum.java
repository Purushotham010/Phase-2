import java.util.Scanner;

public class PalindromeNum {
    public static boolean isPal(int num) {
        int original = num;
        int rev = 0;

        while(num>0) {
            rev = rev*10+num%10;
            num /= 10;
        }
        return original == rev;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int count  = 0;
        for(int i=m; i<=n; i++) {
            if(isPal(i)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
