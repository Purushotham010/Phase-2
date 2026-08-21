abstract class Emp {
    void display() {
        System.out.println("From Emp class");
    }
}

class Employee extends Emp {
}

public class AbstractDemo {
    public static void main(String[] args) {
        Emp e = new Employee();
        e.display();
    }
}