import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] exDuration = new int[7];
        int total = 0;

        for(int i=0; i<7; i++) {
            System.out.print("Day" + (i+1) + "Exercise duration: ");
            exDuration[i] = sc.nextInt();
            total += exDuration[i];
        }

        double avg = total/7.0;
        avg = Math.round(avg*100.0)/100.0;

        System.out.println("Exercise summary");
        System.out.println("Total exercise duration: "+total+" minutes");
        System.out.println("Average daily exercise  duration: "+avg);
        sc.close();
    }
}