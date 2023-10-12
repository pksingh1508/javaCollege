public class Test2 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Complete");
        s1.setCharAt(1, 'i');
        s1.setCharAt(7, 'd');
        System.out.println("string is : " + s1);
        System.out.println("reverse string is : " + s1.reverse());
    }
}
