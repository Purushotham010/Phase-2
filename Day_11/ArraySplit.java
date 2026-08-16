import java.util.Scanner;

class ArraySplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i=0; i<n-1; i++) {
            leftSum += arr[i];

            int rightSum = totalSum - leftSum;

            double leftAvg = (double)leftSum/(i+1);
            double rightAvg = (double)rightSum/(n-i-1);

            if(leftAvg == rightAvg) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}