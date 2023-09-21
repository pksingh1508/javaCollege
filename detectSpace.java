public class detectSpace {
    public static void main(String[] args) {
        // ? program to check double and triple spaces
        String spacedLetter = "Pk    singh  kumar     ok";

        // ! first way
        String letter = spacedLetter.replace("   ", "3");
        letter = letter.replace("  ", "2");
        System.out.println(letter);

        int doubleSpaceCount = 0;
        int tripleSpaceCount = 0;

        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == '2') {
                doubleSpaceCount += 1;
            } else if (letter.charAt(i) == '3') {
                tripleSpaceCount += 1;
            }
        }

        System.out.println("Double space: " + doubleSpaceCount);
        System.out.println("triple space: " + tripleSpaceCount);

        // ! second way

        // String replacedSingleSpaceString = spacedLetter.replace(" ", "2");
        // String replacedTripleSpaceString = spacedLetter.replace(" ", "3");
        // System.out.println(replacedSingleSpaceString);
        // System.out.println(replacedTripleSpaceString);

        // int doubleSpaceCount = 0;
        // int tripleSpaceCount = 0;

        // for (int i = 0; i < replacedSingleSpaceString.length(); i++) {
        // if (replacedSingleSpaceString.charAt(i) == '2') {
        // doubleSpaceCount += 1;
        // }
        // }
        // for (int i = 0; i < replacedTripleSpaceString.length(); i++) {
        // if (replacedTripleSpaceString.charAt(i) == '3') {
        // tripleSpaceCount += 1;
        // }
        // }

        // System.out.println("triple space: " + tripleSpaceCount);
        // System.out.println("Double space: " + (doubleSpaceCount - tripleSpaceCount));
    }
}
