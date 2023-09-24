public class Buffer {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer();

        sc.append("Hello ");
        sc.append(" ");
        sc.append("World!");
        sc.append("This is a good program for the beginners!");

        System.out.println("String is : " + sc.toString());
        System.out.println("Capacity : " + sc.capacity());

    }
}
