public class Rectangle {
    double length = 1;
    double width = 1;

    public void setLength(double givenLength) {
        this.length = givenLength;
    }

    public void setWidth(double givenWidth) {
        this.width = givenWidth;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(4);
        System.out.println("The area of the rectangle is : " + r.area());
        System.out.println("The perimeter of the rectangle is : " + r.perimeter());
    }
}
