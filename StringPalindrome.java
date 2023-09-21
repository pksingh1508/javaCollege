// bob = bob

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String to check Palindrome");
        String givenString = sc.next();
        boolean flag = false;

        // code to check palindrome
        String stringToCheck = givenString.toLowerCase();
        int givenStringLength = stringToCheck.length();
        for (int i = 0; i < givenStringLength; i++) {
            if (stringToCheck.charAt(i) != stringToCheck.charAt(givenStringLength - i - 1)) {
                System.out.println(givenString + " is not a Palindrome");
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(givenString + " is a Palindrome");
        }

        sc.close();
    }
}
