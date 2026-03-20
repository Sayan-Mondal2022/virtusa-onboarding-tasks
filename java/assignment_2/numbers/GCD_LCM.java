// 21. LCM and GCD of 2 given numbers

public class GCD_LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}