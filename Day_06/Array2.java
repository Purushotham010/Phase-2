import java.util.Scanner;
class Array2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int no=1;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                arr[i][j]=no++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}