import java.util.Scanner;
class DigitCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit: ");
        int digit = sc.nextInt();
        if(digit>=0 && digit<10)
        System.out.print("Single Digit");
        else if(digit>=10 && digit<100)
        System.out.print("Double Digits");
        else if(digit>=100 && digit<1000)
        System.out.print("Triple Digits");
        else if(digit>=1000 && digit<10000)
        System.out.print("Four Digits");
        else
        System.out.print("Out of range");
    }
}