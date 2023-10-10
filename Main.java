abstract class Main {
    public String fname = "Abhinav Singh";
    public int year = 2323;

    // abstract method : only declare not describe its body
    abstract void study();
}
// here Student is a sub-class which extend from main abstract class 
class Student extends Main {
    public int graduationYear = 2014;
    public void study() {
        System.out.println("This is an abstract class ");
    }
}
