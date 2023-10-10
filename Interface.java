
interface intfA {
    void m1();
}

interface intfB {
    void m2();
}

class Sample implements intfA, intfB {
    // @Override
    public void m1() {
        System.out.println("This is a m1 method of intfA");
    }

    // @Override
    public void m2() {
        System.out.println("This is a m2 method of intfB");
    }
}

public class Interface {
    public static void main(String[] args) {
        Sample sp = new Sample();
        sp.m1();
        sp.m2();
    }
}
