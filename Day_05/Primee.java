import java.util.Scanner;

public class Primee {
    static boolean isPrime(int num) {
        if (num < 1){
            return false;
        }
        if(num==1 || num==2){
            return false;
        }
        for (int i=3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
