import java.util.Scanner;

public class StaticMethods {
    public static int square(int a){
        return a * a;
    }

    public static int cube(int a){
        return a * a * a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Integer: ");
        int a = in.nextInt();
        System.out.println("Square of: " + a + " is: " + square(a));
        System.out.println("Cube of: " + a + " is: " + cube(a));
    }
}
