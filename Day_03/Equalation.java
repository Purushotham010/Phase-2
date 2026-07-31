import java.util.Scanner;

class Equalation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1, j = num; i <= num && j >= 1; i = i + 3, j = j- 3) {
            System.out.println(i + " - " + j);
        }

        sc.close();
    }
}