import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter no 2 : ");
        int num2 = sc.nextInt();
        int hcf = 0;
        for(int i=1; i<=num1 && i<=num2; i++) {
            if(num1%i == 0 && num2%i == 0) {
                hcf = i;
            }
        }
        System.out.print("HCF is : "+ hcf);
    }
}
