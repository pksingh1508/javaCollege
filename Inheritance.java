class Base {
    protected String name = "Raju";

    public void honk() {
        System.out.println("This is a honk of Base class");
    }

    public Base() {
        System.out.println("Base constructor called");
    }
}

class Derived extends Base {
    protected String dName = "Derived";

    public Derived() {
        System.out.println("Derived constructor called");
    }
}

class Animals {
    public void bark(String bname) {
        System.out.println("barking ..." + bname);
    }
}

class Dog extends Animals {
    public void eat() {
        System.out.println("Eat only chicken");
    }
}

class Cat extends Animals {
    public void walk() {
        System.out.println("the cat is walking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println(d.name + " " + d.dName);
        d.honk();

        Dog dg = new Dog();
        dg.bark("bho bho");
        dg.eat();

        Cat ct = new Cat();
        ct.bark("mew mew");
        ct.walk();
    }
}
