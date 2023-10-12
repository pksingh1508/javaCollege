class A {
    void show() {
        System.out.println("This is a show method in A");
    }
}
class B extends A {
    void show() {
        System.out.println("This is a show method in B");
    }
}
class C extends A {
    void show() {
        System.out.println("This is a show method in C");
    }
}
public class DMA {
    // DMA = Dynamic Method Dispatch
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
