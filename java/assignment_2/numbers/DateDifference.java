// 13. Find the number of years/days between 2 dates

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate d1 = LocalDate.parse(sc.next());

        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate d2 = LocalDate.parse(sc.next());

        long days = ChronoUnit.DAYS.between(d1, d2);
        long years = ChronoUnit.YEARS.between(d1, d2);

        System.out.println("Days: " + Math.abs(days));
        System.out.println("Years: " + Math.abs(years));

        sc.close();
    }
}