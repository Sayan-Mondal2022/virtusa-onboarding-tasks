import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String number = sc.next();

        // System.out.println(number);
        System.out.println("\nDisplaying EVEN Positioned digits");
        for(int i = 0; i < number.length(); i++){
            if(i % 2 == 0)
                System.out.print(number.charAt(i) + " ");
        }

        System.out.println("\nDisplaying ODD Positioned digits");
        for(int i = 0; i < number.length(); i++){
            if(i % 2 == 1)
                System.out.print(number.charAt(i) + " ");
        }
    }
}
