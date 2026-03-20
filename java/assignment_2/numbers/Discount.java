// 10. Calculate discount and show the net amount.

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total amount
        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();

        // Input discount percentage
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculate discount
        double discount = (amount * discountPercent) / 100;

        // Calculate net amount
        double netAmount = amount - discount;

        // Output results
        System.out.println("Discount: " + discount);
        System.out.println("Net Amount: " + netAmount);

        sc.close();
    }
}