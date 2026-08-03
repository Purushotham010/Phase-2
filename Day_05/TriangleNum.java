import java.util.Scanner;

class TriangleNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int a=1;
        boolean t=false;
        while(true){
            int tn=a*(a+1)/2;
            System.out.println(tn+"");
            if(tn==n){
                t=true;
                break;
            }else if(tn>n){
                break;
            }
            a++;
        }
        if(t)
        System.out.println(n+" is a triangular number.");
        else
        System.out.println(n+" is not a triangular number.");
    }
}