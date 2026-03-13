import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        System.out.println("\nEnter the elements: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        System.out.println("\nArray elements are: " + arr);

        // QUESTION - 1: Largest element:
        int largestNumber = Collections.max(arr);
        System.out.println("\nThe largest number in the array is:\n" + largestNumber);

        // QUESTION - 2: Second Largest Element:
        int secondLargest = arr.stream().filter(x -> x < largestNumber).max(Integer::compare).orElse(-1);
        System.out.println("\nThe Second largest number in the array is:\n" + secondLargest);
    }
}
