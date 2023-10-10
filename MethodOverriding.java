class Base12 {
    int x;
    
    void eating() {
        x = 12;
        System.out.println("Base is eating...");
    }
}

class Derived12 extends Base12 {

    void eating() {
        x = 34;
        System.out.println("Derived is eating...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        
        Base12 base = new Derived12();
        base.eating();

        Base12 b = new Base12();
        b.eating();

    
    }
}
