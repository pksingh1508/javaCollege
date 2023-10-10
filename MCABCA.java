class MCA {
    void show() {
        System.out.println("MCA Class");
    }
}

class BCA extends MCA {
    void show() {
        System.out.println("BCA class");
    }
    void regular() {
        System.out.println("BCA is regular");
    }
}

public class MCABCA {
    public static void main(String[] args) {
        BCA b = new BCA();
        b.show();
    }
}
