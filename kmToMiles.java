import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers: ");
        int km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println(km + " km in miles is " + miles + " miles");
        sc.close();
    }
}
