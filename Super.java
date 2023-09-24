class Parent {
    int maxSpeed = 12;
}

class Children extends Parent {
    int maxSpeed = 123;

    public void printSpeed() {
        System.out.println(super.maxSpeed);
    }
}

public class Super extends Parent {
    int maxSpeed = 1231;

    void display() {
        System.out.println("The speed is : " + maxSpeed);
    }

    public static void main(String[] args) {
        Children ch = new Children();
        System.out.println();
        ch.printSpeed();

        Super sc = new Super();
        sc.display();

    }
}
