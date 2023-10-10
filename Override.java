class Baseb {
    int x;
    Baseb(int x) {
        this.x = x;
    }
    
    void show() {
        System.out.println("Super x : " + x);
    }
}

class DerivedD extends Baseb {
    int y;
    DerivedD(int x, int y) {
        super(x);
        this.y = y;
    }
    
    void show() {
        System.out.println("Super x : " + x);
        System.out.println("Sub y : " + y);
    }
}

public class Override {
    public static void main(String[] arsgs) {
        DerivedD s1 = new DerivedD(12, 34);
        s1.show();
    }
}
