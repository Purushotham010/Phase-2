import java.util.Scanner;
class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int a=c;
        if(a>= 65&&a<=90 ){
            System.out.println(c + " is an uppercase letter.");
        }
        else if(a>=97&&a<=122){
            System.out.println(c + " is a lowercase letter.");
        }
        else if(a>=48&&a<=57){
            System.out.println(c + " is a digit.");
        }
        else{
            System.out.println(c + " is a special character.");
        }
    }
}