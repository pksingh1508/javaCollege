class MyParent {
    MyParent() {
        System.out.println("This is a parent class constructor");
    }
}

class Son extends MyParent {
    Son() {
        // super();
        System.out.println("This is a child class constructor");
    }

    public String name = "Son";
}

public class SuperWithConstructor {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.name);
    }
}
