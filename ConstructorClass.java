public class ConstructorClass {
    int x;
    // Type of Constructor

    // 1. default constructor 
    public ConstructorClass() {
        x = 12;
    }
    // 2. parameter constructor 
    public ConstructorClass(int y) {
        x = y;
    }
    // 3. copy constructor

    public static void main(String[] args) {
        ConstructorClass myObj = new ConstructorClass(42);
        System.out.println("The value of x is : " + myObj.x);
    }
}
