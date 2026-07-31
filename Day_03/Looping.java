import java.util.Scanner;
class Looping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int i = 1;
        int no = sc.nextInt();
        for (;i<=no;i++){
            System.out.println(i+"");
        }

    }
}