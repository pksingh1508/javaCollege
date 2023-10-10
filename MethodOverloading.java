public class MethodOverloading {
    static int plusMethodInt(int x) {
        return x + 2;
    }

    static double plusMethodDouble(double x) {
        return x + 2.4;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = plusMethodInt(23);
        System.out.println("Int is : " + a);
        double b = plusMethodDouble(23.45);
        System.out.println("Double is : " + b);

        int c = plusMethod(23, 23);
        System.out.println("C is : " + c);
        double d = plusMethod(12.3, 34.1);
        System.out.println("D is : " + d);

        System.out.println("Method Overloading...");
        int sum = add(12, 123);
        System.out.println("Sum of a and b is : " + sum);
        int sum1 = add(12, 12, 44);
        System.out.println("sum of a, b, c is : " + sum1);

    }
}