package Day_08;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter no 2 : ");
        int num2 = sc.nextInt();
        int lcm = 0;
        int max = (num1 > num2) ? num1 : num2;
        for(int i=max; ; i++) {
            if(i%num1 == 0 && i%num2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.print("LCM is : "+ lcm);
    }
}
