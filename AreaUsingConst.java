class Area {
    int lenght, breadth;
    Area(int x, int y) {
        lenght = x; 
        breadth = y;
    }
    int theArea() {
        return lenght * breadth;
    }
}
public class AreaUsingConst extends Area {
    AreaUsingConst(int x, int y) {
        super(x, y);
    }
     public static void main(String[] args) {
        AreaUsingConst a = new AreaUsingConst(12, 2);
        int area = a.theArea();
        System.out.println("The area is : " + area);
    }
}
