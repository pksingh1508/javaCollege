interface Papa1 {
    final int a = 10;
    void show1();
}
interface Papa2 {
    int b = 10;
    void show2();
}
interface Papa3 {
    int c = 10;
    void show3();
}
interface Papa4 {
    int d = 10;
    void show4();
}
interface Papa5 {
    int e = 10;
    void show5();
}
interface Papa6 {
    int f = 10;
    void show6();
}
interface Papa7 {
    int g = 10;
    void show7();
}

interface Papa extends Papa1, Papa2, Papa3, Papa4, Papa5, Papa6, Papa7 {
    int all = a + b + c + d + e + f + g;
    void showAll();
}

class GrandFather {
    void BigDaddy() {
        System.out.println("This is GrandFather Class");
    }

}

// class SabkaLadka implements Baap1, Baap2, Baap3, Baap4, Baap5, Baap6, Baap7 {
class SabkaLadka extends GrandFather implements Papa {

    void sum() {
        System.out.println("The total sum is : " + all);
    }

    public void show1() {
        System.out.println("This is the Papa 1");
    }
    public void show2() {
        System.out.println("This is the Papa 2");
    }
    public void show3() {
        System.out.println("This is the Papa 3");
    }
    public void show4() {
        System.out.println("This is the Papa 4");
    }
    public void show5() {
        System.out.println("This is the Papa 5");
    }
    public void show6() {
        System.out.println("This is the Papa 6");
    }
    public void show7() {
        System.out.println("This is the Papa 7");
    }
    public void showAll() {
        System.out.println("This is the main Papa");
    }
}

public class MainInterface {
    public static void main(String[] args) {

        SabkaLadka sl = new SabkaLadka();

        sl.show1();
        sl.show2();
        sl.show3();
        sl.show4();
        sl.show5();
        sl.show6();
        sl.show7();
        sl.showAll();
        sl.sum();
        sl.BigDaddy();

    }
}
