import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Speed: ");
        double speed = sc.nextDouble();

        double totalDist = 800;
        double speedinMs = speed*0.5/18.0;
        double time = totalDist/speedinMs;
        
        System.out.printf("%.2f", time);
    }
}