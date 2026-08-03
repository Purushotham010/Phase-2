import java.util.Scanner;

class Perfect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int num = sc.nextInt();

        int sum = 0;

        if (num < 1) {
            System.out.println("Not a Perfect number");
        } else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num)
                System.out.println("Perfect number");
            else
                System.out.println("Not a Perfect number");
        }
    }
}