import java.util.Scanner;

public class CheckNumber {
    public static boolean isPrime(int num){
        if (num <= 1)
            return false;

        if (num == 2 || num == 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for(int i = 5; i <= (int) Math.sqrt(num); i+=6){
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static boolean isPerfectSquare(long num){
        int n = (int) Math.sqrt(num);
        return n * n == num;
    }

    public static boolean isFibonacci(long n) {
        return isPerfectSquare(5 * n * n + 4) || 
               isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // QUESTION 7: Check if a given number is prime or composite
        if (isPrime(num))
            System.out.println("The given number is PRIME");
        else
            System.out.println("The given number is NOT PRIME");


        // QUESTION 8: Check if a given number is a perfect square 
        if (isPerfectSquare(num))
            System.out.println("The given number is a PERFECT SQUARE");
        else
            System.out.println("The given number is NOT a PERFECT SQUARE");


        // QUESTION 9: Check if a given number is a Fibonacci number
        if(isFibonacci(num))
            System.out.println("The number is a FIBONACCI NUMBER");
        else
            System.out.println("The number is NOT a FIBONACCI NUMBER");

    }
}
