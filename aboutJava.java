// public = access specifier
// first = name of the class
public class aboutJava {
    // static = call when running the program without making the object;
    // {} seperator
    // String args[] = array of strings
    // system = class java.lang(package)
    // out = object of the system class which call println (member of the class)
    // println = method
    public static void main(String args[]) {
        System.out.println("Hello World");
        String myName = "Pawan Singh";
        System.out.println("hello " + myName);
        String cars[] = { "audi", "mercedes", "RollsRoyce", "BMW-i7" };
        System.out.println(cars[0]);
        // for (int i = 0; i < cars.length; i++) {
        // System.out.print(cars[i]);
        // }
        for (String car : cars) {
            System.out.println(car);
        }
        // counting number from 1 to 10
        System.out.println("Counting number from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // star
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // reverse star
        System.out.println("Reverse Star");
        int k = 6;
        for (int i = 0; i < k; i++) {
            for (int j = k - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

/*
 * factorial
 * pattern problems
 * 
 */