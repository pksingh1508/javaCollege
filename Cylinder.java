public class Cylinder {
    double pi = 3.14;
    double radius = 1;
    double height = 1;

    public void setDimension(double a, double b) {
        this.radius = a;
        this.height = b;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double surfaceArea() {
        double sarea = 2 * pi * radius * height;
        return sarea;
    }

    public double volume() {
        return (pi * radius * radius * height);
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setDimension(3, 6);
        System.out.println("The radius of the cylinder is : " + c.getRadius());
        System.out.println("The height of the cylinder is : " + c.getHeight());
        System.out.println("The surfaceArea of the cylinder is : " + c.surfaceArea());
        System.out.println("The volume of the cylinder is : " + c.volume());
    }
}
