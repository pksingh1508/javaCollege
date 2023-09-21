import java.util.Scanner;

public class checkInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value for checking.");
        if (sc.hasNextInt()) {
            int val = sc.nextInt();
            System.out.println(val + " is an Integer");
        } else {
            String myVal = sc.next();
            System.out.println(myVal + " is not an Integer");
        }

        sc.close();
    }
}