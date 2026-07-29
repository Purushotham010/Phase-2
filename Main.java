public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        System.out.println("Before: " + a + " " + b + " " + c);

        a = a + b;
        b = a - b;
        a = a - b;

        b = b + c;
        c = b - c;
        b = b - c;

        System.out.println("After: " + a + " " + b + " " + c);
    }
}