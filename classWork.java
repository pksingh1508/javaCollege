// write a program to find the max number among the following array

public class classWork {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 25, 55 };

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        // for Each
        for (int i : arr) {
            if (maxValue <= i) {
                maxValue = i;
            }
            if (minValue >= i) {
                minValue = i;
            }
        }
        System.out.println("Max value is : " + maxValue);
        System.out.println("Min value is : " + minValue);

    }
}
