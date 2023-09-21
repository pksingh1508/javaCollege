import java.util.Scanner;

public class userInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number - ");
        int secondNumber = sc.nextInt();
        System.out.println("Sum of two number is = " + (firstNumber + secondNumber));
        sc.close();
    }
}
