import java.util.Scanner;

public class intOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any value : ");
        if (s.hasNextInt()) {
            int number = s.nextInt();
            System.out.println(number + " is an integer");
        } else {
            String input = s.next();
            System.out.println(input + " is not an integer");
        }
        s.close();
    }
}
