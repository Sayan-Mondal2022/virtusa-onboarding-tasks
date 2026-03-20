// 20. Nth number that is divisible by number a or b.

public class NthDivisibleByEither {
    public static void main(String[] args) {
        int n = 5, a = 2, b = 3;

        int count = 0, num = 1;

        while (true) {
            if (num % a == 0 || num % b == 0)
                count++;

            if (count == n) {
                System.out.println("Result: " + num);
                break;
            }
            num++;
        }
    }
}