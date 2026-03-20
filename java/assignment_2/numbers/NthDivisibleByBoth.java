// 19. Nth number that is divisible by both number a and b.

public class NthDivisibleByBoth {
    public static void main(String[] args) {
        int n = 5, a = 2, b = 3;

        int lcm = (a * b) / gcd(a, b);
        System.out.println("Result: " + (n * lcm));
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}