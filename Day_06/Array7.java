import java.util.Scanner;
class Array7{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.next();
        char c[] = name.toCharArray();
        for (int i= name.length()-1;i>=0; i--) {
            System.out.print(c[i] );
        }System.out.println("\n Original name: "+name);
    }
}