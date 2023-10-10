<<<<<<< HEAD
class Base12 {
    int x;
    
    void eating() {
        x = 12;
        System.out.println("Base is eating...");
    }
}

class Derived12 extends Base12 {

    void eating() {
        x = 34;
        System.out.println("Derived is eating...");
=======
class Upper {
    int x = 12;

    void show() {
        x = 34;
        System.out.println("This is a method of upper class");
    }
}

class Niche extends Upper {
    void show() {
        x = 90;
        System.out.println("This is a method of Niche class");
>>>>>>> cf18492bde9d5f7f6e78b69820499abffc7781bb
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
<<<<<<< HEAD

        
        Base12 base = new Derived12();
        base.eating();

        Base12 b = new Base12();
        b.eating();

    
=======
        Upper n = new Niche();
        n.show();
        Upper u = new Upper();
        System.out.println(u.x + " : " + n.x);

>>>>>>> cf18492bde9d5f7f6e78b69820499abffc7781bb
    }
}
