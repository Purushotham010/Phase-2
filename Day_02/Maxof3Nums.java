import java.util.Scanner;
class Maxof3Nums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        System.out.print(num1>num2?num1>num3?"num1 is big":"num3 is big":num2>num3?"num2 is big":"num3 is big");
        }
    }