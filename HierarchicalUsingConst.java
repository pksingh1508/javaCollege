class AreaOfBoss12 {
    int l, b;
    AreaOfBoss12(int x) {
        l = x;
    }
    AreaOfBoss12(int x, int y) {
        l = x;
        b = y;
    }
    void showData() {
        System.out.println("lenght is : " + l + " Breadth is :"+ b);
    }
}

class Cuboid91 extends AreaOfBoss12 {         
    int h;
    Cuboid91(int x, int y, int z) {
        super(x, y);
        h = z;
    }
    void volume() {
        int vol = l * b * h;
        System.out.println("Volume of Cuboid is : " + vol);
    }
}

class Triangle91 extends AreaOfBoss12 {
    int h;
    Triangle91(int x, int y) {
        super(x);
        h = y;
    }
    void area() {
        int ar = (l * h) / 2;
        System.out.println("Area of triangle is : " + ar);
    }
}
class Cube91 extends AreaOfBoss12 {
    Cube91(int x) {
        super(x);
    }
    void area() {
        int cArea = l * l * l;
        System.out.println("Area of Cube is : " + cArea);
    }
}

public class HierarchicalUsingConst {
    public static void main(String[] args) {

        // Cuboid
        Cuboid91 c91 = new Cuboid91(2, 3, 4);
        c91.volume();

        // Triangle
        Triangle91 t91 = new Triangle91(10, 6);
        t91.area();

        // Cube
        Cube91 cu91 = new Cube91(9);
        cu91.area();

    }
}
