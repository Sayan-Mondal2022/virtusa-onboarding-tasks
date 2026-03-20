// 18. Missing number from the array containing n distinct numbers in the range [0, n]

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        int n = arr.length;
        int sum = n * (n + 1) / 2;

        int actual = 0;
        for (int num : arr) actual += num;

        System.out.println("Missing Number: " + (sum - actual));
    }
}