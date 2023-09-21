public class strings {
    public static void main(String[] args) {
        String name = new String("  Pawan Kumar  ");
        // * ? all strings methods

        System.out.println("length of name : " + name.length());
        System.out.println(" to lowercase : " + name.toLowerCase());
        System.out.println(" to uppercase : " + name.toUpperCase());
        System.out.println("trim : " + name.trim());
        System.out.println("replce : " + name.replace('P', 'R'));
        System.out.println("starts with" + name.startsWith("Pa"));
        System.out.println("end with" + name.endsWith("ar"));
        System.out.println("char at : " + name.charAt(4));
        System.out.println("index of : " + name.indexOf('K'));
        System.out.println("equals : " + name.equals("Pawan Kumar"));
    }
}
