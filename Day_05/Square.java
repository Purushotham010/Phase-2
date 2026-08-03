//perfect square
import java.util.Scanner;
class Square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :");
        int no = sc.nextInt();
        for(int i =no;i<=no;i++) {
            if(i<0)
            System.out.print("-" + i * i + " ");
            else
            System.out.print(i * i + " ");
        }
    }
}