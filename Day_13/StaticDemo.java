class StaticDemo {

    static int i = 100;

    static void method() {
        System.out.println("It should be a default static method");
    }

    static {
        System.out.println("From the static block");
    }

    public static void main(String[] args) {
        method();
    }
}