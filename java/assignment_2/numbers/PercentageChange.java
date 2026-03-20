// 11. Calculate % increase/decrease.

import java.util.Scanner;

public class PercentageChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original value: ");
        double original = sc.nextDouble();

        System.out.print("Enter new value: ");
        double newValue = sc.nextDouble();

        double change = ((newValue - original) / original) * 100;

        if (change > 0)
            System.out.println("Percentage Increase: " + change + "%");
        else
            System.out.println("Percentage Decrease: " + Math.abs(change) + "%");

        sc.close();
    }
}