import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int noOfLimit = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < noOfLimit; i++) {
            int nextTerm = a + b;
            System.out.println(nextTerm);
            a = b;
            b = nextTerm;
        }

        sc.close();
    }
}
