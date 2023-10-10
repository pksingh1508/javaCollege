class OuterClass {
    int x = 10;

    // making an inner class
    class Innerclass {
        int y = 12;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.Innerclass myInner = outer.new Innerclass();
        System.out.println(myInner.y + outer.x);
    }
}
