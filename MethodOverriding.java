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
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Upper n = new Niche();
        n.show();
        Upper u = new Upper();
        System.out.println(u.x + " : " + n.x);

    }
}
