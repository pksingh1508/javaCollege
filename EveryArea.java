class SabkaArea {
    // circle
    double area(double radius) {
        return (3.14 * radius * radius);
    }
    // Rectangle
    double area(double lenght, double breadth) {
        return lenght * breadth;
    }
    // triangle
    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = s * (s - a) * (s -b) * (s - c);
        return Math.sqrt(area);
    }
    // square
    double area(int side) {
        return side * side;
    }

    
}

public class EveryArea {
    public static void main(String[] args) {
        SabkaArea a1 = new SabkaArea();
        // circle Area
        double circleArea = a1.area(12.3);
        System.out.println("Area of Circle is : " + circleArea);

        // Rectangle Area
        double rectangleArea = a1.area(12, 5);
        System.out.println("Area of rectangle is : " + rectangleArea);

        // triangle area
        double triangleArea = a1.area(7, 8, 9);
        System.out.println("Area of triangle is : " + triangleArea);

        // square area
        double squareArea = a1.area(9);
        System.out.println("Area of Square is : " + squareArea);
    }
}
