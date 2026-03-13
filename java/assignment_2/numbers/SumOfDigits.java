// import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int total = 0;
        int temp = num;

        while (temp > 0){
            total += temp % 10;
            temp = temp / 10;
        }

        System.out.println("The sum of digits for a given number '" + num + "' is: " + total);


        // This is for sum of array elements:
        // ArrayList<Integer> arr = new ArrayList<>();

        // System.out.print("Enter the number of elements in array: ");
        // int size = sc.nextInt();

        // System.out.println();
        // for(int i = 0; i < size; i++){
        //     System.out.print("Enter the number: ");
        //     int n = sc.nextInt();

        //     arr.add(n);
        // } 

        // System.out.print("\nThe array elements are: " + arr);
        // int total = arr.stream().mapToInt(Integer::intValue).sum();

        // System.out.println("\n\nThe sum is: " + total);
    }
}
