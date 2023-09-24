public class Square {
    double side = 2.3;

    public void setSide(double givenSide) {
        this.side = givenSide;
    }

    public double area() {
        return side * side;
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(4.5);
        System.out.println("The area is : " + sq.area());
    }
}
