import java.util.Scanner;
class Array3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
int[][][] arr = new int[n][n][n];
int no = 1;

for (int i = 0; i < n; i++) {
    System.out.println("Enter matrix " + i);
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            arr[i][j][k] = no++;
            System.out.print(arr[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println();
}
}
}