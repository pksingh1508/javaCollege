class Cellphone {
    public void ring() {
        System.out.println("Phone is ringing");
    }

    public void vibrate() {
        System.out.println("Phone is vibrating");
    }

    static void show() {
        System.out.println("This is a test phone");
    }
}

public class Emplyoee {
    int salary = 10000;

    public int getSalary() {
        return salary;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String givenName) {
        this.name = givenName;
    }

    public static void main(String[] args) {
        Emplyoee empObj = new Emplyoee();
        System.out.println("salary is : " + empObj.getSalary());
        empObj.setName("RamNiwash");
        System.out.println("The name is : " + empObj.getName());

        Cellphone cObj = new Cellphone();
        cObj.ring();
        cObj.vibrate();
        Cellphone.show();
    }
}
