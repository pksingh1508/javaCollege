
public class Abstract {
    public static void main(String[] args) {
        Student stObj = new Student();
        System.out.println("The fname is : " + stObj.fname);
        System.out.println("The year is : " + stObj.year);
        System.out.println("The graduation year is : " + stObj.graduationYear);
        stObj.study();
    }
}
