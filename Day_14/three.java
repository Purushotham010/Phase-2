//Abstract Class
import java.util.Scanner;
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
class three {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}