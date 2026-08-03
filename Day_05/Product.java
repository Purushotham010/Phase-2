import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        int product = 1;

        for(int i = 1; i <= value; i++) {
            product *= i;
        }
        System.out.println("The product of first " + value + " natural numbers is: " + product);
    }    
}
