class SimpleCuboid {
    double length, breadth, height;
    // default Constructor
    // public Cuboid() {
    //     length = 10;
    //     breadth = 12;
    //     height = 11;
    // }
    double volume() {
        return length * breadth * height;
    }
}


public class VolUsingDefaultConstructor {
    public static void main(String[] args) {
        SimpleCuboid myObj = new SimpleCuboid();
        System.out.println("Volume : " + myObj.volume());
    }
}
