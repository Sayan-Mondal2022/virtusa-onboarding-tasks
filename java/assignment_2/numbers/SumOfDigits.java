import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the number of elements in array: ");
        int size = sc.nextInt();

        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            arr.add(n);
        } 

        System.out.print("\nThe array elements are: " + arr);
        int total = arr.stream().mapToInt(Integer::intValue).sum();

        System.out.println("\n\nThe sum is: " + total);
    }
}
