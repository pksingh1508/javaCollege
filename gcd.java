// gcd => (a,b)
//

import java.util.Scanner;

public class gcd {

    static int findGCD(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a < b) {
            return findGCD(a, b - a);
        } else {
            return findGCD(a - b, b);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Value ");
        int firstValue = sc.nextInt();
        System.out.println("Enter the second value ");
        int secondValue = sc.nextInt();
        int myAns = findGCD(firstValue, secondValue);
        System.out.println("The gcd of " + firstValue + " and " + secondValue + " is " + myAns);
        sc.close();
    }
}
