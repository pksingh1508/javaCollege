public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 10, 1, 7, 4, 8, 2, 11 };
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // code for insertion sort
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        System.out.println();
        System.out.println("After Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
