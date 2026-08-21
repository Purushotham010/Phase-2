//Multiple inheritances
import java.util.Scanner;
interface A {

    void showA();
}

interface B {

    void showB();
}

class C implements A, B {

    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }
}

class six {

    public static void main(String[] args) {

        C obj = new C();

        obj.showA();
        obj.showB();
    }
}