import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input data size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Element " + n + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Current Array:");
        MergeSort.show(arr);
        MergeSort.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        MergeSort.show(arr);

        sc.close();
    }
}
