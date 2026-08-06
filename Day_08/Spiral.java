import java.util.Scanner;
class Spiral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();
        int size=2*no-1;
        int matrix[][] = new int[size][size];
        int r,c,num;
        for(r=0;r<size;r++){
            for(c=0;c<size;c++){
                num = Math.min(Math.min(r,c),Math.min(size-1-r,size-1-c));
                matrix[r][c] = no-num;
            }
        }
        for(r=0;r<size;r++){
            for(c=0;c<size;c++){
                System.out.print((matrix[r][c])+" ");
            }
            System.out.println();
        }
    }
}