// 14. Kth largest number

import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);
        System.out.println("Kth Largest: " + arr[arr.length - k]);
    }
}