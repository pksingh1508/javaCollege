import java.util.Scanner;

public class switchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int r;
        System.out.println("Press 1 for Addition,2 for subtraction,3 for multiplication");
        choice = sc.nextInt();

        System.out.println("Enter your First number");
        int a = sc.nextInt();
        System.out.println("Enter your Second number");
        int b = sc.nextInt();

        // int c = sc.nextInt();
        // System.out.println("Enter your : 1=addition,2=subtraction,3=multiplication");
        switch (choice) {
            case 1:
                r = a + b;
                System.out.println("The sum=" + r);
                break;
            case 2:
                r = a - b;
                System.out.println("The sub=" + r);
                break;

            case 3:
                r = a * b;
                System.out.println("The mul=" + r);
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();

    }

}
