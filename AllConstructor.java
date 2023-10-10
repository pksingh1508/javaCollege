class Cuboid {
    double length, breadth, height;
    // default Constructor
    public Cuboid() {
        length = 10;
        breadth = 12;
        height = 11;
    }
    // parameterized constructor
    public Cuboid(double x, double y, double z) {
        this.length = x;
        this.breadth = y;
        this.height = z;
    }
    // copy constructor
    public Cuboid(Cuboid cpObj) {
        this.length = cpObj.length;
        this.breadth = cpObj.breadth;
        this.height = cpObj.height;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class AllConstructor {
    public static void main(String[] args) {
        //object of the cuboid for default constructor
        Cuboid cuboidObject = new Cuboid();
        System.out.println("Volume using default constructor : " + cuboidObject.volume());

        // object of the cuboid for parameter constructor
        Cuboid pObj = new Cuboid(23, 10, 11);
        System.out.println("Volume using parameter constructor : " + pObj.volume());

        // object of the cuboid for copy constructor
        Cuboid objforcopy = new Cuboid(1,2,3);
        Cuboid copyObj = new Cuboid(objforcopy);
        System.out.println("Volume using copy constructor : " + copyObj.volume());

    }
}
