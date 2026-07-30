class Increment {
    public static void main(String[] args){
        int a = 5;
        int b;
        System.out.println("the A value is :" + a);
        // System.out.println("the B value is :" + b);
        b = a++;
        System.out.println("the a value is :" + a);
        System.out.println("the b value is :" + b);
        b = ++a;
        System.out.println("The a value is :" + a);
        System.out.println("The b value is :" + b);
        b = a--;
        System.out.println("The a value is :" + a);
        System.out.println("The b value is :" + b);
        b = --a;
        System.out.println("The a value is :" + a);
        System.out.println("The b value is :" + b);

    }
}