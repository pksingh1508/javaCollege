// Anagram => army and Mary is an Anagram.
// This is inserted using vim command.
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstSentence = sc.nextLine();
        System.out.println("Enter second word");
        String secondSentence = sc.nextLine();

        firstSentence = firstSentence.toLowerCase().replace(" ", "");
        secondSentence = secondSentence.toLowerCase().replace(" ", "");
        System.out.println(firstSentence);
        System.out.println(secondSentence);

        if (firstSentence.contentEquals(secondSentence)) {
            System.out.println("Anagram");
        } else {
            System.out.println("not anagram");
        }

        sc.close();
    }
}
