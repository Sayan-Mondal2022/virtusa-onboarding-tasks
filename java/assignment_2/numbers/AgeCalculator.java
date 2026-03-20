// 12. Find age from a given DOB

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DOB (YYYY-MM-DD): ");
        LocalDate dob = LocalDate.parse(sc.next());

        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);

        System.out.println("Age: " + age.getYears() + " years");

        sc.close();
    }
}