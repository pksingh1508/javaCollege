// class Base {
//     public void message() {
//         System.out.println("This is a message form base class");
//     }
// }

// class Derived extends Base {
//     public void message() {
//         System.out.println("This is a message form the derived class");
//     }

//     public void show() {
//         message();
//         super.message();
//     }
// }

// code from gfg
// Java program to show use of super with methods

// superclass Person
class Person {
    void message() {
        System.out.println("This is person class\n");
    }
}

// Subclass Student
class Student extends Person {
    void message() {
        System.out.println("This is student class");
    }

    // Note that display() is
    // only in Student class
    void display() {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}

public class SuperWithMethod {
    public static void main(String[] args) {
        Student s = new Student();

        // calling display() of Student
        s.display();
    }
}
