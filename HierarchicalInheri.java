class AreaOfBoss {
    int l, b;
    void showData() {
        System.out.println("lenght is : " + l + " Breadth is :"+ b);
    }
}

class Cuboid9 extends AreaOfBoss {
    int h;
    void volume() {
        int vol = l * b * h;
        System.out.println("Volume of Cuboid is : " + vol);
    }
}

class Triangle9 extends AreaOfBoss {
    int h;
    void area() {
        int ar = (l * h) / 2;
        System.out.println("Area of triangle is : " + ar);
    }
}
class Cube9 extends AreaOfBoss {
    void area() {
        int cArea = l * l * l;
        System.out.println("Area of Cube is : " + cArea);
    }
}


public class HierarchicalInheri {
    public static void main(String[] args) {
        // creating object for cuboid
        Cuboid9 cd = new Cuboid9();
        cd.l = 2;
        cd.b = 5;
        cd.h = 6;
        cd.showData();
        cd.volume();

        // creating object for Triangle
        Triangle9 t = new Triangle9();
        t.l = 5;
        t.h = 9;
        t.area();

        // creating object for cube
        Cube9 c = new Cube9();
        c.l = 6;
        c.area();

    }
}
