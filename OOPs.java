// final : used to assign the final value;

public class OOPs {
    int x;
    final int y = 34;

    // static vs public methods;
    static void greeting() {
        System.out.println("Hello, How are you?");
    }

    public void greeting1() {
        System.out.println("Hello, How are you in greeting 2");
    }

    // some extra public class
    public void fullThrottle() {
        System.out.println("This is a throttle method?");
    }

    public void printValue(int val) {
        System.out.println("The value is : " + val);
    }

    public static void main(String[] args) {
        OOPs myObj = new OOPs();
        myObj.x = 30;
        System.out.println("The value of x is : " + myObj.x);
        System.out.println("The value of y is : " + myObj.y);

        greeting();
        myObj.greeting1();

        // calling using object
        myObj.fullThrottle();
        myObj.printValue(123);
    }
}
