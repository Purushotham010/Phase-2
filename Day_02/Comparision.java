import java.util.Scanner;

class Comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println(a>b?"a is big":"b is big");
    }
}