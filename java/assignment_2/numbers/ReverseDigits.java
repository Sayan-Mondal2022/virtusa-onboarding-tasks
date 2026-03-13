import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();

        int result = 0;
        int temp = num;

        while (temp > 0){
            int rem = temp % 10;
            result = result + (rem * (int) Math.pow(10, length - 1));
            temp = temp / 10;
            length--;
        }

        System.out.println("\nThe Digit before reversal is: " + num);
        System.out.println("The Digit after reversal is: " + result);
    }
    
}
