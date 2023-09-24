// Java do not support multiple inheritance 
// we can achieve this by using interfaces

class Parent1 {
    public void fun() {
        System.out.println("This is fun of parent1");
    }
}

class Parent2 {
    public void fun1() {
        System.out.println("This is fun of parent2");
    }
}

public class MultipleInheritance extends Parent1 {
    public static void main(String[] args) {

    }
}
